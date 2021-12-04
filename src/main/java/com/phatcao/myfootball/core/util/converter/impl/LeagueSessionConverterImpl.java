package com.phatcao.myfootball.core.util.converter.impl;

import com.phatcao.myfootball.core.dao.entity.LeagueSessionEntity;
import com.phatcao.myfootball.core.dto.league_session.LeagueSessionData;
import com.phatcao.myfootball.core.util.common.DateTimeConverter;
import com.phatcao.myfootball.core.util.converter.LeagueSessionConverter;
import com.phatcao.myfootball.footballapi.model.response.LeagueResponseModel;
import com.phatcao.myfootball.footballapi.model.response.SeasonResponseModel;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class LeagueSessionConverterImpl implements LeagueSessionConverter
{
	@Override
	public List<LeagueSessionEntity> convertModelsToEntities(List<SeasonResponseModel> models , LeagueResponseModel leagueId) {
		List<LeagueSessionEntity> entities = new ArrayList<>();

		if(!CollectionUtils.isEmpty(models))
		for (SeasonResponseModel season: models
			 ) {
			entities.add(convertModelToEntity(season, leagueId));
		}

		return entities;
	}

	private LeagueSessionEntity convertModelToEntity( SeasonResponseModel model, LeagueResponseModel leagueId){
		LeagueSessionEntity entity = new LeagueSessionEntity();
		entity.setLeagueId(leagueId.getLeague().getId());
		entity.setLeagueSessionName(leagueId.getLeague().getName() + model.getYear());
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
		target.setId(source.getId());
		target.setName(source.getLeagueSessionName());
		target.setStartDay(DateTimeConverter.stringToDateTime(source.getStartDay()));
		target.setEndDay(DateTimeConverter.stringToDateTime(source.getEndDay()));
		return target;
	}
}
