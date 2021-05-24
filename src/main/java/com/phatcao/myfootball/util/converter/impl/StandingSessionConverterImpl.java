package com.phatcao.myfootball.util.converter.impl;

import com.phatcao.myfootball.dao.entity.StandingSessionEntity;
import com.phatcao.myfootball.dto.league_session.LeagueSessionBoardStandingData;
import com.phatcao.myfootball.service.StandingSessionService;
import com.phatcao.myfootball.util.converter.StandingSessionConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class StandingSessionConverterImpl implements StandingSessionConverter
{


	@Override
	public List<LeagueSessionBoardStandingData> groupEntitiesToData(List<StandingSessionEntity> sources)
	{

		List<LeagueSessionBoardStandingData> target = new ArrayList<>();

//		for (StandingSessionEntity element : sources)
//		{
//			if()
//
//
//		}

		return null;
	}
}
