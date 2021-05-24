package com.phatcao.myfootball.util.converter.impl;

import com.phatcao.myfootball.dao.entity.LeagueSessionEntity;
import com.phatcao.myfootball.dto.league_session.LeagueSessionData;
import com.phatcao.myfootball.util.converter.LeagueSessionConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class LeagueSessionConverterImpl implements LeagueSessionConverter
{
	@Override
	public List<LeagueSessionData> convertListDAOtoDTO(List<LeagueSessionEntity> source)
	{
		if(CollectionUtils.isEmpty(source))
			return null;
		return source.stream().map(this::convertDAOtoDTO).collect(Collectors.toList());
	}

	@Override
	public LeagueSessionData convertDAOtoDTO(LeagueSessionEntity source)
	{
		LeagueSessionData target = new LeagueSessionData();
		target.setId(source.getLeagueSessionId());
		target.setName(source.getLeagueSessionName());
		target.setStartDay(new Date (source.getStartDay()));
		target.setEndDay(new Date(source.getEndDay()));
		return target;
	}
}
