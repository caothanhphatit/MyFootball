package com.phatcao.myfootball.util.converter;

import com.phatcao.myfootball.dao.entity.LeagueEntity;
import com.phatcao.myfootball.dto.leauge.LeagueData;
import com.phatcao.myfootball.integration.model.response.CountryResponseModel;
import com.phatcao.myfootball.integration.model.response.LeagueInfoResponseModel;
import com.phatcao.myfootball.integration.model.response.LeagueResponseModel;

import java.util.List;


public interface LeagueConverter
{
	LeagueEntity modelToEntity(LeagueInfoResponseModel model, CountryResponseModel country);

	LeagueData entityToData(LeagueEntity source);

	List<LeagueData> convertLeagueEntitiesToLeagueData(List<LeagueEntity> sources);
}
