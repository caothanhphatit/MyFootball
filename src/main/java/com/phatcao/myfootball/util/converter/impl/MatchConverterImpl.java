package com.phatcao.myfootball.util.converter.impl;

import com.phatcao.myfootball.dao.entity.MatchEntity;
import com.phatcao.myfootball.dto.match.CompleteMatchData;
import com.phatcao.myfootball.dto.match.IncomingMatchData;
import com.phatcao.myfootball.dto.match.MatchData;
import com.phatcao.myfootball.service.TeamService;
import com.phatcao.myfootball.util.converter.MatchConverter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Component
public class MatchConverterImpl implements MatchConverter
{
	@Resource
	TeamService teamService;



	@Override
	public MatchData convertEntityToData(MatchEntity source)
	{
		MatchData target = new MatchData();
		target.setMatchId(source.getMatchId());
		return target;


	}

	@Override
	public List<MatchData> convertEntitiesToDataList(List<MatchEntity> sources)
	{
		return null;
	}

	@Override
	public IncomingMatchData convertEntityToIncomingMatchData(MatchEntity source)
	{
		return null;
	}

	@Override
	public CompleteMatchData convertEntityToCompleteMatchData(MatchEntity m)
	{
		return null;
	}
}
