package com.phatcao.myfootball.util.converter;

import com.phatcao.myfootball.dao.entity.LeagueEntity;
import com.phatcao.myfootball.dto.leauge.LeagueData;

import java.util.List;


public interface LeagueConverter
{
	LeagueData convertLeagueEntityToLeagueData(LeagueEntity source);

	List<LeagueData> convertLeagueEntitiesToLeagueData(List<LeagueEntity> sources);
}
