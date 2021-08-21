package com.phatcao.myfootball.facade;

import com.phatcao.myfootball.dto.common.ResponseData;


public interface LeagueSessionFacade
{
	ResponseData getLeagueStandingBoard(int sessionId);

    ResponseData getAllByLeagueId(int id);
}
