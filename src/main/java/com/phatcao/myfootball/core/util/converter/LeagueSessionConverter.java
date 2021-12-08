package com.phatcao.myfootball.core.util.converter;

import com.phatcao.myfootball.core.dao.entity.LeagueSessionEntity;
import com.phatcao.myfootball.core.dto.league_session.LeagueSessionData;
import com.phatcao.myfootball.footballapi.model.response.LeagueResponseModel;
import com.phatcao.myfootball.footballapi.model.response.SeasonResponseModel;


import java.util.List;


public interface LeagueSessionConverter
{
	List<LeagueSessionEntity> convertModelsToEntities(List<SeasonResponseModel> models, LeagueResponseModel leagueId);

	List<LeagueSessionData> convertListDAOtoDTO(List<LeagueSessionEntity> source);

	LeagueSessionData convertDAOtoDTO(LeagueSessionEntity source);
}
