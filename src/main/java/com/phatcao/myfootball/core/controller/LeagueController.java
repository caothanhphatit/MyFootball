package com.phatcao.myfootball.core.controller;

import com.phatcao.myfootball.core.dto.common.ResponseData;
import com.phatcao.myfootball.core.facade.LeagueFacade;
import com.phatcao.myfootball.footballapi.DTO.request.FetchTeamRequest;
import com.phatcao.myfootball.footballapi.facade.FATeamFacade;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/league")
public class LeagueController {

	@Resource
	LeagueFacade leagueFacade;

	@GetMapping("/leagues/{customerId}")
	public ResponseEntity<?> getLeagueByCustomerId(@PathVariable final String customerId) {
		try {
			final ResponseData result = leagueFacade.getLeaguesByUsername(customerId);
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
		catch (final NullPointerException e) {
			return new ResponseEntity<>(new ResponseData(true, e.getMessage(), null), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/get-all-league")
	public ResponseEntity<?> getAllLeague(@RequestParam(name = "page", required = false, defaultValue = "1") final int page,
			@RequestParam(name = "size", required = false, defaultValue = "5") final int size,
			@RequestParam(name = "is_paging", required = false, defaultValue = "true") final boolean isPaging) {
		try {
			final ResponseData result;
			if (isPaging) {
				final Pageable pageable = PageRequest.of(page - 1, size);
				result = leagueFacade.getAllLeaguePaging(pageable);
			}
			else {
				result = leagueFacade.getAllLeague();
			}
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
		catch (final NullPointerException e) {
			return new ResponseEntity<>(new ResponseData(true, e.getMessage(), null), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/league/fetch")
	public ResponseData fetchLeague() throws JSONException {

		leagueFacade.fetchLeagueFromFA();
		return new ResponseData();
	}

	@GetMapping("/league/{leagueId}/info")
	public ResponseData getLeagueInfo(@PathVariable final Integer leagueId) {
		return leagueFacade.getInfoLeagueById(leagueId);
	}

	@GetMapping("leagues/{idLeague}/matches")
	public ResponseData getMatchInfoByLeagueId(@PathVariable final Integer idLeague) {
		return leagueFacade.getMatchInfoByLeagueId(idLeague);
	}

	@Autowired
	FATeamFacade faTeamFacade;

	@PostMapping("/team/fetch")
	public ResponseEntity<?> fetchTeamByLeagueAndSession(@RequestBody final FetchTeamRequest fetchTeamRequest) {
		return faTeamFacade.fetchTeam(fetchTeamRequest);
	}
}
