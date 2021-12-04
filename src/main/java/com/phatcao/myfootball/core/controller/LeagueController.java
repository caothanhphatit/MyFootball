package com.phatcao.myfootball.core.controller;

import com.phatcao.myfootball.core.dto.common.ResponseData;
import com.phatcao.myfootball.core.facade.LeagueFacade;
import org.json.JSONException;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/league")
public class LeagueController
{

	@Resource
	LeagueFacade leagueFacade;

	@GetMapping ("/leagues/{customerId}")
	public ResponseEntity<?> getLeagueByCustomerId(@PathVariable String customerId)
	{
		try{
			ResponseData result = leagueFacade.getLeaguesByUsername(customerId);
			return new ResponseEntity<>(result , HttpStatus.OK);
		}
		catch (NullPointerException e)
		{
			return new ResponseEntity<>(new ResponseData(true,e.getMessage() , null), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/get-all-league")
	public ResponseEntity<?> getAllLeague(@RequestParam(name = "page", required = false, defaultValue = "1") int page,
										  @RequestParam(name = "size", required = false, defaultValue = "5") int size,
										  @RequestParam(name = "is_paging", required = false, defaultValue = "true") boolean isPaging)
	{
		try{
			ResponseData result;
			if(isPaging){
				Pageable pageable = PageRequest.of(page -1, size);
				 result = leagueFacade.getAllLeaguePaging(pageable);
			}
			else
			 result = leagueFacade.getAllLeague();
			return new ResponseEntity<>(result , HttpStatus.OK);
		}
		catch (NullPointerException e)
		{
			return new ResponseEntity<>(new ResponseData(true,e.getMessage() , null), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

    @GetMapping ("/league/fetch")
    public ResponseData fetchLeague () throws JSONException {

	    leagueFacade.fetchLeagueFromFA();
	    return new ResponseData();
    }

	@GetMapping ("/league/{leagueId}/info")
	public ResponseData getLeagueInfo(@PathVariable Integer leagueId)
	{
		return leagueFacade.getInfoLeagueById(leagueId);
	}

	@GetMapping ("leagues/{idLeague}/matches")
	public ResponseData getMatchInfoByLeagueId(@PathVariable Integer idLeague)
	{
		return leagueFacade.getMatchInfoByLeagueId(idLeague);
	}
}
