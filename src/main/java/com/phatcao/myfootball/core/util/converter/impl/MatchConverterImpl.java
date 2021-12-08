package com.phatcao.myfootball.core.util.converter.impl;

import com.phatcao.myfootball.core.dao.entity.MatchEntity;
import com.phatcao.myfootball.core.dto.match.CompleteMatchData;
import com.phatcao.myfootball.core.dto.match.IncomingMatchData;
import com.phatcao.myfootball.core.dto.match.MatchData;
import com.phatcao.myfootball.core.service.TeamService;
import com.phatcao.myfootball.core.util.converter.MatchConverter;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.List;


@Component
public class MatchConverterImpl implements MatchConverter
{
	@Resource
	TeamService teamService;



	@Override
	public MatchData convertEntityToData(final MatchEntity source)
	{
		if(source == null )
			throw new AccessDeniedException("Not data found");
		final MatchData target = new MatchData();
		target.setMatchId(source.getMatchId());
		target.setHome(teamService.getTeamDataById(source.getCodeTeamHome()));
		target.setGuest(teamService.getTeamDataById(source.getCodeTeamGuest()));
		target.getHome().setScore(source.getScoreTeamHome());
		target.getGuest().setScore(source.getScoreTeamGuest());
		target.setMatchId(source.getMatchId());
		target.setLocation(1);
		return target;
	}

	@Override
	public List<MatchData> convertEntitiesToDataList(final List<MatchEntity> sources)
	{
		return null;
	}

	@Override
	public IncomingMatchData convertEntityToIncomingMatchData(final MatchEntity source)
	{
		return null;
	}

	@Override
	public CompleteMatchData convertEntityToCompleteMatchData(final MatchEntity m)
	{
		return null;
	}
}
