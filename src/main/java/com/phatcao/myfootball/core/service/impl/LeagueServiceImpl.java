package com.phatcao.myfootball.core.service.impl;

import com.phatcao.myfootball.core.dao.entity.LeagueEntity;
import com.phatcao.myfootball.core.dao.repository.LeagueRepository;
import com.phatcao.myfootball.core.dto.leauge.LeagueData;
import com.phatcao.myfootball.core.service.LeagueService;
import com.phatcao.myfootball.core.util.converter.LeagueConverter;
import com.phatcao.myfootball.footballapi.model.response.LeagueResponseModel;
import com.phatcao.myfootball.footballapi.repository.FALeagueRepository;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
		final List<LeagueEntity> resultEntity = leagueRepository.findByIsActive();
		return leagueConverter.convertLeagueEntitiesToLeagueData(resultEntity);

	}

	@Override
	public Page<LeagueData> getAllLeague(Pageable pageable) {
		Page<LeagueEntity> entities = leagueRepository.findByIsActive(1,pageable);

		Page<LeagueData> data = entities.map(leagueEntity -> leagueConverter.entityToData(leagueEntity));

	return data;

	}

	@Override
	public List<LeagueData> getLeaguesByListId(final List<Integer> ids)
	{
		return leagueConverter.convertLeagueEntitiesToLeagueData(leagueRepository.findAllById(ids));
	}

	@Override
	public LeagueData getLeagueInfoById(final Integer leagueId)
	{
		return leagueConverter.entityToData(leagueRepository.getOne(leagueId));
	}

	@Override
	public void saveList(List<LeagueEntity> leagueEntities) {
		 leagueRepository.saveAll(leagueEntities);
	}


}
