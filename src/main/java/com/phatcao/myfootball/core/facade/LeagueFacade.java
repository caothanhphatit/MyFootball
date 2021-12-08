package com.phatcao.myfootball.core.facade;

import com.phatcao.myfootball.core.dto.common.ResponseData;
import org.json.JSONException;
import org.springframework.data.domain.Pageable;



public interface LeagueFacade
{
	ResponseData fetchLeagueFromFA() throws JSONException;

	ResponseData getLeaguesByUsername(String username);

	ResponseData getInfoLeagueById(Integer leagueId);

	ResponseData getMatchInfoByLeagueId(Integer leagueId);

    ResponseData getAllLeague();

    ResponseData getAllLeaguePaging(Pageable pageable);
}
