package com.phatcao.myfootball.util.converter.impl;

import com.phatcao.myfootball.dao.entity.LeagueEntity;
import com.phatcao.myfootball.dao.entity.LeagueSessionEntity;
import com.phatcao.myfootball.dto.league_session.LeagueSessionData;
import com.phatcao.myfootball.integration.model.response.SeasonResponseModel;
import com.phatcao.myfootball.util.converter.LeagueSessionConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class LeagueSessionConverterImpl implements LeagueSessionConverter
{
	@Override
	public List<LeagueSessionEntity> convertModelsToEntities(List<SeasonResponseModel> models , int leagueId) {
		List<LeagueSessionEntity> entities = new ArrayList<>();

		if(!CollectionUtils.isEmpty(models))
		for (SeasonResponseModel season: models
			 ) {
			entities.add(convertModelToEntity(season, leagueId));
		}

		return entities;
	}

	private LeagueSessionEntity convertModelToEntity( SeasonResponseModel model, int leagueId){
		LeagueSessionEntity entity = new LeagueSessionEntity();
		entity.setLeagueId(leagueId);
		entity.setStartDay(model.getStart());
		entity.setEndDay(model.getEnd());
		entity.setYear(Integer.parseInt(model.getYear()));
		return entity;
	}

	@Override
	public List<LeagueSessionData> convertListDAOtoDTO(final List<LeagueSessionEntity> source)
	{
		if (CollectionUtils.isEmpty(source))
		{
			return null;
		}
		return source.stream().map(this::convertDAOtoDTO).collect(Collectors.toList());
	}

	@Override
	public LeagueSessionData convertDAOtoDTO(final LeagueSessionEntity source)
	{
		final LeagueSessionData target = new LeagueSessionData();
		target.setId(source.getLeagueSessionId());
		target.setName(source.getLeagueSessionName());
		target.setStartDay(new Date(source.getStartDay()));
		target.setEndDay(new Date(source.getEndDay()));
		return target;
	}
}
