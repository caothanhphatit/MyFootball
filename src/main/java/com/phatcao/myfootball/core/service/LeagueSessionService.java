package com.phatcao.myfootball.core.service;

import com.phatcao.myfootball.core.dao.entity.LeagueSessionEntity;

import java.util.List;


public interface LeagueSessionService
{
	List<LeagueSessionEntity> getLeagueSessionByLeagueId(Integer leagueId);

    void saveList(List<LeagueSessionEntity> leagueSeasonEntities);
}
