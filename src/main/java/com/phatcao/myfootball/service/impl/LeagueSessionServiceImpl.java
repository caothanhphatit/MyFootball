package com.phatcao.myfootball.service.impl;

import com.phatcao.myfootball.dao.entity.LeagueSessionEntity;
import com.phatcao.myfootball.dao.repository.LeagueSessionRepository;
import com.phatcao.myfootball.service.LeagueSessionService;
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
}
