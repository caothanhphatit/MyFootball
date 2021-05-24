package com.phatcao.myfootball.service.impl;

import com.phatcao.myfootball.dao.entity.StandingSessionEntity;
import com.phatcao.myfootball.dao.repository.StandingSessionRepository;
import com.phatcao.myfootball.service.StandingSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StandingSessionServiceImpl implements StandingSessionService
{
	@Autowired
	StandingSessionRepository standingSessionRepository;

	@Override
	public List<StandingSessionEntity> getLeagueSessionByLeagueId(int sessionId)
	{
		return standingSessionRepository.getStandingSessionEntitiesByLeagueSessionId(sessionId);
	}
}
