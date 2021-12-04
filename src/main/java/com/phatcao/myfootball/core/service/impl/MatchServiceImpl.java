package com.phatcao.myfootball.core.service.impl;

import com.phatcao.myfootball.core.dao.entity.MatchEntity;
import com.phatcao.myfootball.core.dao.repository.MatchRepository;
import com.phatcao.myfootball.core.service.MatchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class MatchServiceImpl implements MatchService
{
	@Resource
	MatchRepository matchRepository;

	@Override
	public List<MatchEntity> getAllMatchByLeagueId(final long leagueId)
	{
		return matchRepository.findAllMatchByLeagueId(leagueId);
	}

	@Override
	public MatchEntity getMatchById(long id)
	{
		return matchRepository.findById(id).orElse(null);
	}

}
