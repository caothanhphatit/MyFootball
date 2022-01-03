package com.phatcao.myfootball.footballapi.repository.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.phatcao.myfootball.footballapi.conmon.FAConstant;
import com.phatcao.myfootball.footballapi.model.response.team.TeamResponse;
import com.phatcao.myfootball.footballapi.repository.FATeamRepository;
import com.phatcao.myfootball.footballapi.utils.ConfigProperties;
import com.phatcao.myfootball.footballapi.utils.FARequestAPI;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
import java.util.List;
import java.util.Objects;


@Repository
public class FATeamRepositoryImpl implements FATeamRepository {

	static final Logger LOG = LoggerFactory.getLogger(FATeamRepositoryImpl.class);

	@Autowired
	FARequestAPI faRequestAPI;

	@Autowired
	ConfigProperties configProperties;

	@Override
	public List<TeamResponse> fetchTeamByLeagueAndSession(final int leagueId, final int seasonYear) {

		final String url = configProperties.getBaseUrl() + FAConstant.ENDPOINT.TEAMS;

		final UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url).queryParam("league", leagueId)
				.queryParam("season", seasonYear);

		final JSONObject jsonObject = faRequestAPI.getMethod(builder.toUriString());
		final ObjectMapper objectMapper = new ObjectMapper();

		if (Objects.isNull(jsonObject)) {
			return Collections.emptyList();
		}
		try {
			final JSONArray jsonArray = jsonObject.getJSONArray("response");
			return objectMapper.readValue(jsonArray.toString(), new TypeReference<>() {
			});
		}
		catch (final Exception e) {
			LOG.error("fetch League fail from api football:{}", e.getMessage());
			return Collections.emptyList();
		}

	}
}
