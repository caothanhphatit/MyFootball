package com.phatcao.myfootball.controller;

import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.facade.LeagueFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/league")
public class LeagueController
{

	@Resource
	LeagueFacade leagueFacade;

	@GetMapping ("/leagues/{{customerId}}")
	public ResponseData getLeagueByCustomerId(@PathVariable String customerId)
	{
		return leagueFacade.getLeaguesByUsername(customerId);
	}

	@GetMapping ("/leagues/{{leagueId}}")
	public ResponseData getLeagueInfo(@PathVariable Long leagueId)
	{
		return leagueFacade.getInfoLeagueById(leagueId);
	}

	@GetMapping ("leagues/{{idLeague}}/matches")
	public ResponseData getMatchInfoByLeagueId(@PathVariable Long idLeague)
	{
		return leagueFacade.getMatchInfoByLeagueId(idLeague);
	}
}
