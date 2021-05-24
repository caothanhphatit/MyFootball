package com.phatcao.myfootball.service;

import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.dto.leauge.LeagueData;

import java.util.List;


public interface LeagueService
{

	public List<LeagueData> getAllLeague();

	List<LeagueData> getLeaguesByListId(List<Integer> ids);

	LeagueData getLeagueInfoById(Integer leagueId);
}
