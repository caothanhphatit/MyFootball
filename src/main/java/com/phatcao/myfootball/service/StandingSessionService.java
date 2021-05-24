package com.phatcao.myfootball.service;

import com.phatcao.myfootball.dao.entity.StandingSessionEntity;

import java.util.List;


public interface StandingSessionService
{
	List<StandingSessionEntity> getLeagueSessionByLeagueId(int sessionId);
}
