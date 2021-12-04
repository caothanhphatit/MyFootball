package com.phatcao.myfootball.core.service.impl;

import com.phatcao.myfootball.core.dao.entity.StandingSessionEntity;
import com.phatcao.myfootball.core.dao.repository.StandingSessionRepository;
import com.phatcao.myfootball.core.service.StandingSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StandingSessionServiceImpl implements StandingSessionService
{
	@Autowired
	StandingSessionRepository standingSessionRepository;

	@Override
	public List<StandingSessionEntity> getLeagueSessionByLeagueId(final int sessionId)
	{
		return standingSessionRepository.getStandingSessionEntitiesByLeagueSessionId(sessionId);
	}
}
