package com.phatcao.myfootball.core.controller;

import com.phatcao.myfootball.footballapi.DTO.request.FetchTeamRequest;
import com.phatcao.myfootball.footballapi.facade.FATeamFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FATeamController {

	@Autowired
	FATeamFacade faTeamFacade;

	@GetMapping("fa/team/fetch")
	public ResponseEntity<?> fetchTeamByLeagueAndSession() {

		final FetchTeamRequest fetchTeamRequest = new FetchTeamRequest();
		fetchTeamRequest.setLeagueId(39);
		fetchTeamRequest.setSessionYear(2021);
		return faTeamFacade.fetchTeam(fetchTeamRequest);
	}
}
