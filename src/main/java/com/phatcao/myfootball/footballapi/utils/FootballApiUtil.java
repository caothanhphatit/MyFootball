package com.phatcao.myfootball.footballapi.utils;

import com.phatcao.myfootball.footballapi.conmon.FAConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class FootballApiUtil
{
	@Autowired
	private ConfigProperties configProperties;

	public HttpHeaders buildHttpHeaders()
	{
		final HttpHeaders headers = new HttpHeaders();
		headers.set(FAConstant.FOOTBALL_API_RAPID_KEY, configProperties.getApiKey());
		headers.set(FAConstant.FOOTBALL_API_RAPID_HOST, configProperties.getApiHost());
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}



}
