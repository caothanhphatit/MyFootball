package com.phatcao.myfootball.facade.impl;

import com.phatcao.myfootball.dao.entity.StandingSessionEntity;
import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.dto.league_session.LeagueSessionBoardStandingData;
import com.phatcao.myfootball.facade.LeagueSessionFacade;
import com.phatcao.myfootball.service.LeagueSessionService;
import com.phatcao.myfootball.service.StandingSessionService;
import com.phatcao.myfootball.util.converter.StandingSessionConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class LeagueSessionFacadeImpl implements LeagueSessionFacade
{

	@Autowired
	LeagueSessionService leagueSessionService;

	@Autowired
	StandingSessionService standingSessionService;

	@Autowired
	StandingSessionConverter standingSessionConverter;
	@Override
	public ResponseData getLeagueStandingBoard(int sessionId)
	{
		ResponseData responseData = new ResponseData();

		List <StandingSessionEntity> standingSessionEntities = standingSessionService.getLeagueSessionByLeagueId( sessionId);

	List<LeagueSessionBoardStandingData> response = standingSessionConverter.groupEntitiesToData(standingSessionEntities);


		return null;
	}
}
