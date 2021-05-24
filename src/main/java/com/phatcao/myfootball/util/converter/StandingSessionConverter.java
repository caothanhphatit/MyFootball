package com.phatcao.myfootball.util.converter;

import com.phatcao.myfootball.dao.entity.StandingSessionEntity;
import com.phatcao.myfootball.dto.league_session.LeagueSessionBoardStandingData;

import java.util.List;


public interface StandingSessionConverter
{

	List<LeagueSessionBoardStandingData> groupEntitiesToData(List<StandingSessionEntity> source);
}
