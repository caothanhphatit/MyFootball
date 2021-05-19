package com.phatcao.myfootball.service;

import com.phatcao.myfootball.dao.entity.MatchEntity;
import com.phatcao.myfootball.dto.match.CompleteMatchData;
import com.phatcao.myfootball.dto.match.IncomingMatchData;
import com.phatcao.myfootball.dto.match.MatchData;

import java.util.List;


public interface MatchService
{
	List<MatchEntity> getAllMatchByLeagueId(long leagueId);

}
