package com.phatcao.myfootball.core.service;

import com.phatcao.myfootball.core.dao.entity.StandingSessionEntity;

import java.util.List;


public interface StandingSessionService
{
	List<StandingSessionEntity> getLeagueSessionByLeagueId(int sessionId);
}
