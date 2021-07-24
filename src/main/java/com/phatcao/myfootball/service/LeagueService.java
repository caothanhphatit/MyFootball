package com.phatcao.myfootball.service;

import com.phatcao.myfootball.dto.leauge.LeagueData;
import com.phatcao.myfootball.integration.model.response.LeagueResponseModel;
import org.json.JSONException;

import java.util.List;


public interface LeagueService
{
	public List<LeagueResponseModel> getAllLeagueFromFA() throws JSONException;

	public List<LeagueData> getAllLeague();

	List<LeagueData> getLeaguesByListId(List<Integer> ids);

	LeagueData getLeagueInfoById(Integer leagueId);
}
