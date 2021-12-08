package com.phatcao.myfootball.core.facade;

import com.phatcao.myfootball.core.dto.common.ResponseData;


public interface LeagueSessionFacade
{
	ResponseData getLeagueStandingBoard(int sessionId);

    ResponseData getAllByLeagueId(int id);
}
