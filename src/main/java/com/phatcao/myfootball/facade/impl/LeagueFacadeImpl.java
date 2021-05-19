package com.phatcao.myfootball.facade.impl;

import com.phatcao.myfootball.common.Constant;
import com.phatcao.myfootball.dao.entity.MatchEntity;
import com.phatcao.myfootball.dao.entity.UserLeagueEntity;
import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.dto.leauge.LeagueMatchData;
import com.phatcao.myfootball.dto.match.CompleteMatchData;
import com.phatcao.myfootball.dto.match.IncomingMatchData;
import com.phatcao.myfootball.facade.LeagueFacade;
import com.phatcao.myfootball.service.LeagueService;
import com.phatcao.myfootball.service.MatchService;
import com.phatcao.myfootball.service.UserLeagueService;
import com.phatcao.myfootball.util.converter.MatchConverter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class LeagueFacadeImpl implements LeagueFacade
{
	@Resource
	LeagueService leagueService;
	@Resource
	UserLeagueService userLeagueService;
	@Resource
	MatchService matchService;
	@Resource
	MatchConverter matchConverter;
	@Override
	public ResponseData getLeaguesByUsername(String userName)
	{
		List<String> listLeagueIdOfUser = userLeagueService.getUserLeagueByUserName(userName).stream()
				.map(UserLeagueEntity::getUserName).collect(Collectors.toList());
		return new ResponseData(true, "ok" , listLeagueIdOfUser);
	}

	@Override
	public ResponseData getInfoLeagueById(long leagueId)
	{
		return new ResponseData(true, "ok", leagueService.getLeagueInfoById(leagueId));
	}

	@Override
	public ResponseData getMatchInfoByLeagueId(long leagueId)
	{
		LeagueMatchData result = new LeagueMatchData();

		List<MatchEntity> matchEntities = matchService.getAllMatchByLeagueId(leagueId);
		result.setIncomingMatchList(getIncomingMatch(matchEntities));
		result.setCompleteMatchDataList(getCompleteMatch(matchEntities));

		return null;
	}

	private List<CompleteMatchData> getCompleteMatch(List<MatchEntity> matchEntities)
	{
		List<CompleteMatchData> results = new ArrayList<>();
		for (MatchEntity m : matchEntities){
			if(m.getStatus() == Constant.MATCH_STATUS.INCOMING ){
				results.add(matchConverter.convertEntityToCompleteMatchData(m));
			}
		}
		return results;
	}

	private List<IncomingMatchData> getIncomingMatch( List<MatchEntity>  matchEntities)
	{
		List<IncomingMatchData> results  = new ArrayList<>();
		for (MatchEntity m : matchEntities)
		{
				if(m.getStatus() == Constant.MATCH_STATUS.INCOMING ){
					results.add(matchConverter.convertEntityToIncomingMatchData(m));
				}
		}
		return results;
	}
}
