package com.phatcao.myfootball.core.service.impl;

import com.phatcao.myfootball.core.dao.entity.LeagueSessionEntity;
import com.phatcao.myfootball.core.dao.repository.LeagueSessionRepository;
import com.phatcao.myfootball.core.service.LeagueSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LeagueSessionServiceImpl implements LeagueSessionService
{
	@Autowired
	LeagueSessionRepository leagueSessionRepository;

	@Override
	public List<LeagueSessionEntity> getLeagueSessionByLeagueId(final Integer leagueId)
	{
		return leagueSessionRepository.findLeagueSessionEntitiesByLeagueId(leagueId);
	}

	@Override
	public void saveList(List<LeagueSessionEntity> leagueSeasonEntities) {
		leagueSessionRepository.saveAll(leagueSeasonEntities);
	}
}
