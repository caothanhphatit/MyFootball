package com.phatcao.myfootball.core.util.converter;

import com.phatcao.myfootball.core.dao.entity.StandingSessionEntity;
import com.phatcao.myfootball.core.dto.StandingSessionData;
import com.phatcao.myfootball.core.dto.league_session.LeagueSessionBoardStandingData;

import java.util.List;


public interface StandingSessionConverter
{

	List<LeagueSessionBoardStandingData> groupEntitiesToData(List<StandingSessionEntity> source);

	List<StandingSessionData> convertListEntitiesToListData ( List<StandingSessionEntity> source);

}
