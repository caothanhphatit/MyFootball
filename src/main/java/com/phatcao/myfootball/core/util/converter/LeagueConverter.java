package com.phatcao.myfootball.core.util.converter;

import com.phatcao.myfootball.core.dao.entity.LeagueEntity;
import com.phatcao.myfootball.core.dto.leauge.LeagueData;
import com.phatcao.myfootball.footballapi.model.response.CountryResponseModel;
import com.phatcao.myfootball.footballapi.model.response.LeagueInfoResponseModel;


import java.util.List;


public interface LeagueConverter
{
	LeagueEntity modelToEntity(LeagueInfoResponseModel model, CountryResponseModel country);

	LeagueData entityToData(LeagueEntity source);

	List<LeagueData> convertLeagueEntitiesToLeagueData(List<LeagueEntity> sources);
}
