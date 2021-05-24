package com.phatcao.myfootball.facade.impl;

import com.phatcao.myfootball.common.Constant;
import com.phatcao.myfootball.dao.entity.MatchEntity;
import com.phatcao.myfootball.dao.entity.UserLeagueEntity;
import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.dto.league_session.LeagueSessionData;
import com.phatcao.myfootball.dto.leauge.LeagueData;
import com.phatcao.myfootball.dto.leauge.LeagueMatchData;
import com.phatcao.myfootball.dto.match.CompleteMatchData;
import com.phatcao.myfootball.dto.match.IncomingMatchData;
import com.phatcao.myfootball.facade.LeagueFacade;
import com.phatcao.myfootball.service.LeagueService;
import com.phatcao.myfootball.service.LeagueSessionService;
import com.phatcao.myfootball.service.MatchService;
import com.phatcao.myfootball.service.UserLeagueService;
import com.phatcao.myfootball.util.converter.LeagueSessionConverter;
import com.phatcao.myfootball.util.converter.MatchConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

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
	@Resource
	LeagueSessionService leagueSessionService;
	@Resource
	LeagueSessionConverter leagueSessionConverter;
	@Override
	public ResponseData getLeaguesByUsername(String userName)
	{
		List<UserLeagueEntity> data = userLeagueService.getUserLeagueByUserName(userName);
		List <LeagueData> result = null;

		if (!CollectionUtils.isEmpty(data)) {
			List<Integer> listLeagueIdOfUser = data.stream()
					.map(UserLeagueEntity::getLeagueId).collect(Collectors.toList());
			 result = leagueService.getLeaguesByListId(listLeagueIdOfUser);
		}

		return new ResponseData(true, "ok" , result);
	}

	@Override
	public ResponseData getInfoLeagueById(Integer leagueId)
	{
		LeagueData result = leagueService.getLeagueInfoById(leagueId);
		List<LeagueSessionData> leagueSessionData = leagueSessionConverter.convertListDAOtoDTO(leagueSessionService.getLeagueSessionByLeagueId(leagueId)) ;
		result.setLeagueSessionData(leagueSessionData);
		return new ResponseData(true, "ok",result);
	}

	@Override
	public ResponseData getMatchInfoByLeagueId(Integer leagueId)
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
