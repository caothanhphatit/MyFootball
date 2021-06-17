package com.phatcao.myfootball.facade.impl;

import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.dto.match.MatchData;
import com.phatcao.myfootball.facade.MatchFacade;
import com.phatcao.myfootball.service.MatchService;
import com.phatcao.myfootball.util.converter.MatchConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
