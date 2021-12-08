package com.phatcao.myfootball.core.util.converter.impl;

import com.phatcao.myfootball.core.dao.entity.StandingSessionEntity;
import com.phatcao.myfootball.core.dto.StandingSessionData;
import com.phatcao.myfootball.core.dto.league_session.LeagueSessionBoardStandingData;
import com.phatcao.myfootball.core.util.converter.StandingSessionConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Component
public class StandingSessionConverterImpl implements StandingSessionConverter
{


	@Override
	public List<LeagueSessionBoardStandingData> groupEntitiesToData(final List<StandingSessionEntity> sources)
	{

		final List<LeagueSessionBoardStandingData> target = new ArrayList<>();

		final Set<String> groups = sources.stream().map(StandingSessionEntity::getGroupId).collect(Collectors.toSet());

		for (final String group : groups)
		{
			final LeagueSessionBoardStandingData element = new LeagueSessionBoardStandingData();
			element.setGroup(group);
			final List<StandingSessionEntity> standingSessionEntitiesByGroup = sources.stream().filter(c -> c.getGroupId().equals(group))
					.collect(Collectors.toList());

			element.setStandingSessionData(convertListEntitiesToListData(standingSessionEntitiesByGroup));
			target.add(element);
		}
		return target;
	}

	@Override
	public List<StandingSessionData> convertListEntitiesToListData(final List<StandingSessionEntity> source)
	{
		List<StandingSessionData> target = new ArrayList<>();

		target = source.stream().map(StandingSessionConverterImpl::convertEntityToData).collect(Collectors.toList());



		return target;
	}

	private static StandingSessionData convertEntityToData(final StandingSessionEntity source)
	{
		final StandingSessionData target = new StandingSessionData();
		target.setLost(source.getLost());
		target.setWin(source.getWin());
		target.setMatchPlay(source.getMatchPlay());
		target.setDraw(source.getDraw());
		target.setGoalAgainst(source.getGoalAgainst());
		target.setGoalScore(source.getGoalScore());
		target.setPoint(source.getPoints());
		target.setGoalDiff(source.getGoalDifferent());
		target.setTeam(null);


		return target;
	}


}
