package com.phatcao.myfootball.core.facade.impl;

import com.phatcao.myfootball.core.common.Constant;
import com.phatcao.myfootball.core.dao.entity.LeagueEntity;
import com.phatcao.myfootball.core.dao.entity.LeagueSessionEntity;
import com.phatcao.myfootball.core.dao.entity.MatchEntity;
import com.phatcao.myfootball.core.dao.entity.UserLeagueEntity;
import com.phatcao.myfootball.core.dto.common.ResponseData;
import com.phatcao.myfootball.core.dto.league_session.LeagueSessionData;
import com.phatcao.myfootball.core.dto.leauge.LeagueData;
import com.phatcao.myfootball.core.dto.leauge.LeagueMatchData;
import com.phatcao.myfootball.core.dto.match.CompleteMatchData;
import com.phatcao.myfootball.core.dto.match.IncomingMatchData;
import com.phatcao.myfootball.core.facade.LeagueFacade;
import com.phatcao.myfootball.core.service.LeagueService;
import com.phatcao.myfootball.core.service.LeagueSessionService;
import com.phatcao.myfootball.core.service.MatchService;
import com.phatcao.myfootball.core.service.UserLeagueService;
import com.phatcao.myfootball.core.util.converter.LeagueConverter;
import com.phatcao.myfootball.core.util.converter.LeagueSessionConverter;
import com.phatcao.myfootball.core.util.converter.MatchConverter;
import com.phatcao.myfootball.footballapi.model.response.LeagueResponseModel;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class LeagueFacadeImpl implements LeagueFacade
{
	@Autowired
	LeagueService leagueService;
	@Autowired
	UserLeagueService userLeagueService;
	@Autowired
	MatchService matchService;
	@Autowired
	MatchConverter matchConverter;
	@Autowired
	LeagueSessionService leagueSessionService;
	@Autowired
	LeagueSessionConverter leagueSessionConverter;
	@Autowired
	LeagueConverter leagueConverter;

	@Override
	public ResponseData fetchLeagueFromFA() throws JSONException {

		List<LeagueResponseModel> listLeagueFromFA = leagueService.getAllLeagueFromFA();

		List<LeagueEntity> leagueEntities = new ArrayList<>();
		List<LeagueSessionEntity> leagueSeasonEntities = new ArrayList<>();

		for (LeagueResponseModel leagueFromFA: listLeagueFromFA
			 ) {

			leagueEntities.add(leagueConverter.modelToEntity(leagueFromFA.getLeague(),leagueFromFA.getCountry()));
			leagueSeasonEntities.addAll(leagueSessionConverter.convertModelsToEntities(leagueFromFA.getSeasons(),leagueFromFA));
		}
		leagueService.saveList(leagueEntities);

		leagueSessionService.saveList(leagueSeasonEntities);

	return null;
	}


	@Override
	public ResponseData getLeaguesByUsername(final String userName)
	{
		final List<UserLeagueEntity> data = userLeagueService.getUserLeagueByUserName(userName);
		List<LeagueData> result = null;

		if (!CollectionUtils.isEmpty(data))
		{
			final List<Integer> listLeagueIdOfUser = data.stream().map(UserLeagueEntity::getLeagueId).collect(Collectors.toList());
			result = leagueService.getLeaguesByListId(listLeagueIdOfUser);
		}

		return new ResponseData(true, "ok", result);
	}

	@Override
	public ResponseData getInfoLeagueById(final Integer leagueId)
	{
		final LeagueData result = leagueService.getLeagueInfoById(leagueId);
		final List<LeagueSessionData> leagueSessionData = leagueSessionConverter
				.convertListDAOtoDTO(leagueSessionService.getLeagueSessionByLeagueId(leagueId));
		result.setLeagueSessionData(leagueSessionData);
		return new ResponseData(true, "ok", result);
	}

	@Override
	public ResponseData getMatchInfoByLeagueId(final Integer leagueId)
	{
		final LeagueMatchData result = new LeagueMatchData();

		final List<MatchEntity> matchEntities = matchService.getAllMatchByLeagueId(leagueId);
		result.setIncomingMatchList(getIncomingMatch(matchEntities));
		result.setCompleteMatchDataList(getCompleteMatch(matchEntities));
		return null;
	}

	@Override
	public ResponseData getAllLeague() {

		final List<LeagueData> leagueData = leagueService.getAllLeague();
		return new ResponseData(true, "ok", leagueData);
	}

	@Override
	public ResponseData getAllLeaguePaging(Pageable pageable) {
		final Page<LeagueData> leagueData = leagueService.getAllLeague(pageable);
		return new ResponseData(true, "ok", leagueData);
	}

	private List<CompleteMatchData> getCompleteMatch(final List<MatchEntity> matchEntities)
	{
		final List<CompleteMatchData> results = new ArrayList<>();
		for (final MatchEntity m : matchEntities)
		{
			if (m.getStatus() == Constant.MATCH_STATUS.INCOMING)
			{
				results.add(matchConverter.convertEntityToCompleteMatchData(m));
			}
		}
		return results;
	}

	private List<IncomingMatchData> getIncomingMatch(final List<MatchEntity> matchEntities)
	{
		final List<IncomingMatchData> results = new ArrayList<>();
		for (final MatchEntity m : matchEntities)
		{
			if (m.getStatus() == Constant.MATCH_STATUS.INCOMING)
			{
				results.add(matchConverter.convertEntityToIncomingMatchData(m));
			}
		}
		return results;
	}
}
