package com.phatcao.myfootball.facade.impl;

import com.phatcao.myfootball.dao.entity.StandingSessionEntity;
import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.dto.league_session.LeagueSessionBoardStandingData;
import com.phatcao.myfootball.dto.league_session.LeagueSessionData;
import com.phatcao.myfootball.facade.LeagueSessionFacade;
import com.phatcao.myfootball.service.LeagueSessionService;
import com.phatcao.myfootball.service.StandingSessionService;
import com.phatcao.myfootball.util.converter.LeagueSessionConverter;
import com.phatcao.myfootball.util.converter.StandingSessionConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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

	@Autowired
	LeagueSessionConverter leagueSessionConverter;

	@Override
	public ResponseData getLeagueStandingBoard(final int sessionId)
	{
		final ResponseData responseData = new ResponseData();

		final List<StandingSessionEntity> standingSessionEntities = standingSessionService.getLeagueSessionByLeagueId(sessionId);

		final List<LeagueSessionBoardStandingData> response = standingSessionConverter.groupEntitiesToData(standingSessionEntities);

		responseData.setData(response);
		responseData.setMessage("Success");
		responseData.setSuccess(true);
		return responseData;
	}

	@Override
	public ResponseData getAllByLeagueId(int id) {
		final ResponseData responseData = new ResponseData();

		List<LeagueSessionData> result = leagueSessionConverter.convertListDAOtoDTO(leagueSessionService.getLeagueSessionByLeagueId( id));


		responseData.setData(result);
		responseData.setMessage("Success");
		responseData.setSuccess(true);
		return responseData;
	}
}
