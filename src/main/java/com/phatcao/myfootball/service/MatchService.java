package com.phatcao.myfootball.service;

import com.phatcao.myfootball.dao.entity.MatchEntity;

import java.util.List;


public interface MatchService
{
	List<MatchEntity> getAllMatchByLeagueId(long leagueId);

	MatchEntity getMatchById(long id);

}
