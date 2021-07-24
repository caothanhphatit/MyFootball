package com.phatcao.myfootball.facade;

import com.phatcao.myfootball.dto.common.ResponseData;
import org.json.JSONException;


public interface LeagueFacade
{
	ResponseData fetchLeagueFromFA() throws JSONException;

	ResponseData getLeaguesByUsername(String username);

	ResponseData getInfoLeagueById(Integer leagueId);

	ResponseData getMatchInfoByLeagueId(Integer leagueId);

    ResponseData getAllLeague();
}
