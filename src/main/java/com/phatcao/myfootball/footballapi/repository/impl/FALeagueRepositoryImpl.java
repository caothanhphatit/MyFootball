package com.phatcao.myfootball.footballapi.repository.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.phatcao.myfootball.footballapi.conmon.FAConstant;
import com.phatcao.myfootball.footballapi.model.response.LeagueResponseModel;
import com.phatcao.myfootball.footballapi.repository.FALeagueRepository;
import com.phatcao.myfootball.footballapi.utils.ConfigProperties;
import com.phatcao.myfootball.footballapi.utils.FARequestAPI;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;


@Repository
public class FALeagueRepositoryImpl implements FALeagueRepository {

	static final Logger LOG = LoggerFactory.getLogger(FALeagueRepositoryImpl.class);

	@Autowired
	FARequestAPI faRequestAPI;

	@Autowired
	ConfigProperties configProperties;

	@Override
	public List<LeagueResponseModel> fetchAllLeague() {
		final String url = configProperties.getBaseUrl() + FAConstant.ENDPOINT.LEAGUES;
		final JSONObject jsonObject = faRequestAPI.getMethod(url);
		final ObjectMapper objectMapper = new ObjectMapper();
		try {
			if (jsonObject != null) {
				final JSONArray jsonArray = jsonObject.getJSONArray("response");
				return objectMapper.readValue(jsonArray.toString(), new TypeReference<>() {
				});
			}
			return Collections.emptyList();
		}
		catch (final Exception e) {
			LOG.error("fetch League fail from api football:{}", e.getMessage());
			return Collections.emptyList();
		}
	}

}
