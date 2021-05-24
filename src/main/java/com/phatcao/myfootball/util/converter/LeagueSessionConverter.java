package com.phatcao.myfootball.util.converter;

import com.phatcao.myfootball.dao.entity.LeagueSessionEntity;
import com.phatcao.myfootball.dto.league_session.LeagueSessionData;

import java.util.List;


public interface LeagueSessionConverter
{
	List<LeagueSessionData> convertListDAOtoDTO(List<LeagueSessionEntity> source);

	LeagueSessionData convertDAOtoDTO(LeagueSessionEntity source);
}
