package com.phatcao.myfootball.util.converter.impl;

import com.phatcao.myfootball.dao.entity.LeagueEntity;
import com.phatcao.myfootball.dto.leauge.LeagueData;
import com.phatcao.myfootball.integration.model.response.CountryResponseModel;
import com.phatcao.myfootball.integration.model.response.LeagueInfoResponseModel;
import com.phatcao.myfootball.integration.model.response.LeagueResponseModel;
import com.phatcao.myfootball.util.converter.LeagueConverter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class LeagueConverterImpl implements LeagueConverter
{

	private static LeagueData getLeagueData()
	{
		return new LeagueData();
	}

	@Override
	public LeagueEntity modelToEntity(LeagueInfoResponseModel model, CountryResponseModel country) {
		LeagueEntity entity = new LeagueEntity();

		entity.setCountry(country.getName());
		entity.setLeagueId(model.getId());
		entity.setLeagueName(model.getName());
		entity.setStatus(1);
		entity.setLogo(model.getLogo());
		entity.setType(model.getType());
		entity.setFlag(country.getFlag());
		entity.setCountryCode(country.getCode());
		return entity;
	}

	@Override
	public LeagueData entityToData(final LeagueEntity source)
	{
		final LeagueData target = getLeagueData();

		target.setLeagueId(source.getLeagueId());
		target.setLeagueName(source.getLeagueName());
		return target;
	}

	@Override
	public List<LeagueData> convertLeagueEntitiesToLeagueData(final List<LeagueEntity> sources)
	{
		return sources.stream().map(this::entityToData).collect(Collectors.toList());
	}
}
