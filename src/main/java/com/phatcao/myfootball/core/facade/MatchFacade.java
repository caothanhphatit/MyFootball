package com.phatcao.myfootball.core.facade;

import com.phatcao.myfootball.core.dto.common.ResponseData;


public interface MatchFacade
{
	ResponseData getMatchInfoByMatchId(long id);
}
