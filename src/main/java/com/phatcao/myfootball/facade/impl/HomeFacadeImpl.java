package com.phatcao.myfootball.facade.impl;

import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.facade.HomeFacade;
import com.phatcao.myfootball.service.LeagueService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class HomeFacadeImpl implements HomeFacade
{
	@Resource
	LeagueService leagueService;

	private static ResponseData getResponseData()
	{
		return new ResponseData();
	}

	@Override
	public ResponseData getHomePage()
	{
		final ResponseData responseData = getResponseData();
		responseData.setData(leagueService.getAllLeague());
		responseData.setMessage("success");
		responseData.setSuccess(true);
		return responseData;
	}
}