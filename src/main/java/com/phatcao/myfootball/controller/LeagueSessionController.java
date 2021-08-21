package com.phatcao.myfootball.controller;

import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.facade.LeagueSessionFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class LeagueSessionController
{

	@Autowired
	LeagueSessionFacade leagueSessionFacade;
	@GetMapping("/{id}/standing-board")
	public ResponseEntity getLeagueStandingBoard(@PathVariable String id){
		try
		{
			 int sessionId = id != null ? Integer.parseInt(id) : -1;

			 ResponseData response = leagueSessionFacade.getLeagueStandingBoard(sessionId);
			 return new ResponseEntity(response , HttpStatus.OK);
		}

		catch (Exception e) {
			return  null;
		}
	}

	@GetMapping ("{id}/sessions")
	public ResponseEntity getAllSessionByLeagueId(@PathVariable String id){
		try
		{
			 int leagueId = id != null ? Integer.parseInt(id) : -1;

			ResponseData response = leagueSessionFacade.getAllByLeagueId(leagueId);
		return new ResponseEntity(response , HttpStatus.OK);
		}

		catch (Exception e) {
			return  null;
		}

	}
}
