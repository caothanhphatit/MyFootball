package com.phatcao.myfootball.facade;

import com.phatcao.myfootball.dto.common.ResponseData;


public interface LeagueFacade
{
	ResponseData getLeaguesByUsername(String username);

	ResponseData getInfoLeagueById(Integer leagueId);

	ResponseData getMatchInfoByLeagueId(Integer leagueId);
}
