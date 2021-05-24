package com.phatcao.myfootball.service.impl;

import com.phatcao.myfootball.dao.entity.LeagueEntity;
import com.phatcao.myfootball.dao.repository.LeagueRepository;
import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.dto.leauge.LeagueData;
import com.phatcao.myfootball.service.LeagueService;
import com.phatcao.myfootball.util.converter.LeagueConverter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class LeagueServiceImpl implements LeagueService
{
	@Resource
	LeagueRepository leagueRepository;

	@Resource
	LeagueConverter leagueConverter;

	@Override
	public List <LeagueData> getAllLeague()
	{
		List<LeagueEntity> resultEntity = leagueRepository.findAll();

		return leagueConverter.convertLeagueEntitiesToLeagueData(resultEntity);

	}

	@Override
	public List<LeagueData> getLeaguesByListId(List<Integer> ids)
	{
		return leagueConverter.convertLeagueEntitiesToLeagueData(leagueRepository.findAllById(ids));
	}

	@Override
	public LeagueData getLeagueInfoById(Integer leagueId)
	{
		return leagueConverter.convertLeagueEntityToLeagueData(leagueRepository.getOne(leagueId));
	}


}
