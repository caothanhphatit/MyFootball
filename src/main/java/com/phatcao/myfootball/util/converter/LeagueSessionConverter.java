package com.phatcao.myfootball.util.converter;

import com.phatcao.myfootball.dao.entity.LeagueEntity;
import com.phatcao.myfootball.dao.entity.LeagueSessionEntity;
import com.phatcao.myfootball.dto.league_session.LeagueSessionData;
import com.phatcao.myfootball.integration.model.response.SeasonResponseModel;

import java.util.List;


public interface LeagueSessionConverter
{
	List<LeagueSessionEntity> convertModelsToEntities(List<SeasonResponseModel> models, int leagueId);

	List<LeagueSessionData> convertListDAOtoDTO(List<LeagueSessionEntity> source);

	LeagueSessionData convertDAOtoDTO(LeagueSessionEntity source);
}
