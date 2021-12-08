package com.phatcao.myfootball.core.service;

import com.phatcao.myfootball.core.dao.entity.MatchEntity;

import java.util.List;


public interface MatchService
{
	List<MatchEntity> getAllMatchByLeagueId(long leagueId);

	MatchEntity getMatchById(long id);

}
