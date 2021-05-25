package com.phatcao.myfootball.util.converter.impl;

import com.phatcao.myfootball.dao.entity.LeagueEntity;
import com.phatcao.myfootball.dto.leauge.LeagueData;
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
	public LeagueData convertLeagueEntityToLeagueData(final LeagueEntity source)
	{
		final LeagueData target = getLeagueData();

		target.setLeagueId(source.getLeagueId());
		target.setLeagueName(source.getLeagueName());
		return target;
	}

	@Override
	public List<LeagueData> convertLeagueEntitiesToLeagueData(final List<LeagueEntity> sources)
	{
		return sources.stream().map(this::convertLeagueEntityToLeagueData).collect(Collectors.toList());
	}
}
