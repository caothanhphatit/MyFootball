package com.phatcao.myfootball.service.impl;

import com.phatcao.myfootball.dao.entity.MatchEntity;
import com.phatcao.myfootball.dao.repository.MatchRepository;
import com.phatcao.myfootball.dto.match.CompleteMatchData;
import com.phatcao.myfootball.dto.match.IncomingMatchData;
import com.phatcao.myfootball.dto.match.MatchData;
import com.phatcao.myfootball.service.MatchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class MatchServiceImpl implements MatchService
{
	@Resource
	MatchRepository matchRepository;

	@Override
	public List<MatchEntity> getAllMatchByLeagueId(long leagueId)
	{
		return matchRepository.findAllMatchByLeagueId(leagueId);
	}

}
