package com.phatcao.myfootball.core.facade.impl;

import com.phatcao.myfootball.core.dto.common.ResponseData;
import com.phatcao.myfootball.core.dto.match.MatchData;
import com.phatcao.myfootball.core.facade.MatchFacade;
import com.phatcao.myfootball.core.service.MatchService;
import com.phatcao.myfootball.core.util.converter.MatchConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MatchFacadeImpl implements MatchFacade
{
	@Autowired
	MatchService matchService;

	@Autowired
	MatchConverter matchConverter;

 	@Override
	public ResponseData getMatchInfoByMatchId(long id)
	{
		MatchData data = matchConverter.convertEntityToData(matchService.getMatchById(id));
		return new ResponseData(true, "success", data);
	}
}
