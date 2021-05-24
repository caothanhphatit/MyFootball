package com.phatcao.myfootball.service;

import com.phatcao.myfootball.dao.entity.LeagueSessionEntity;
import com.phatcao.myfootball.dto.league_session.LeagueSessionData;

import java.util.List;


public interface LeagueSessionService
{
	List<LeagueSessionEntity> getLeagueSessionByLeagueId(Integer leagueId);
}
