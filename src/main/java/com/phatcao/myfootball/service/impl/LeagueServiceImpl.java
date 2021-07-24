package com.phatcao.myfootball.service.impl;

import com.phatcao.myfootball.dao.entity.LeagueEntity;
import com.phatcao.myfootball.dao.repository.LeagueRepository;
import com.phatcao.myfootball.dto.leauge.LeagueData;
import com.phatcao.myfootball.integration.model.response.LeagueResponseModel;
import com.phatcao.myfootball.integration.repository.FALeagueRepository;
import com.phatcao.myfootball.service.LeagueService;
import com.phatcao.myfootball.util.converter.LeagueConverter;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	FALeagueRepository faLeagueRepository;
	@Override
	public List<LeagueResponseModel> getAllLeagueFromFA() throws JSONException {
			return faLeagueRepository.fetchAllLeague();
	}

	@Override
	public List<LeagueData> getAllLeague()
	{
		final List<LeagueEntity> resultEntity = leagueRepository.findAll();
		return leagueConverter.convertLeagueEntitiesToLeagueData(resultEntity);

	}

	@Override
	public List<LeagueData> getLeaguesByListId(final List<Integer> ids)
	{
		return leagueConverter.convertLeagueEntitiesToLeagueData(leagueRepository.findAllById(ids));
	}

	@Override
	public LeagueData getLeagueInfoById(final Integer leagueId)
	{
		return leagueConverter.convertLeagueEntityToLeagueData(leagueRepository.getOne(leagueId));
	}


}
