package com.phatcao.myfootball.footballapi.facade.impl;

import com.phatcao.myfootball.core.dao.entity.TeamEntity;
import com.phatcao.myfootball.core.dao.entity.VenueEntity;
import com.phatcao.myfootball.core.dto.common.ResponseData;
import com.phatcao.myfootball.core.service.TeamService;
import com.phatcao.myfootball.core.service.VenueService;
import com.phatcao.myfootball.footballapi.DTO.request.FetchTeamRequest;
import com.phatcao.myfootball.footballapi.converter.FATeamConverter;
import com.phatcao.myfootball.footballapi.converter.FAVenueConverter;
import com.phatcao.myfootball.footballapi.facade.FATeamFacade;
import com.phatcao.myfootball.footballapi.model.response.team.TeamResponse;
import com.phatcao.myfootball.footballapi.service.FATeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;


@Component
public class FATeamFacadeImpl implements FATeamFacade {

	@Autowired
	FATeamService faTeamService;

	@Autowired
	TeamService teamService;

	@Autowired
	VenueService venueService;

	@Autowired
	FATeamConverter faTeamConverter;

	@Autowired
	FAVenueConverter faVenueConverter;

	@Override
	public ResponseEntity<ResponseData> fetchTeam(final FetchTeamRequest fetchTeamRequest) {
		final List<TeamResponse> teamResponse = faTeamService
				.fetchTeam(fetchTeamRequest.getLeagueId(), fetchTeamRequest.getSessionYear());

		if (CollectionUtils.isEmpty(teamResponse)) {
			return new ResponseEntity<>(new ResponseData(false, "fail to fetch team from API", false),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

		final List<TeamEntity> teamEntities = faTeamConverter.convertToTeamEntity(teamResponse);

		final List<VenueEntity> venueEntities = faVenueConverter.convertToEntityList(teamResponse);

		//if save team to DB success save venue
		if (teamService.saveAll(teamEntities) && venueService.saveAll(venueEntities)) {
			return new ResponseEntity<>(new ResponseData(true, "fetch success", true), HttpStatus.CREATED);
		}

		return new ResponseEntity<>(new ResponseData(false, "can not save data to internal", false),
				HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
