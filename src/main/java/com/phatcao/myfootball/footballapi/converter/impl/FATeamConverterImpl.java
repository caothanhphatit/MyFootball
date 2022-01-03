package com.phatcao.myfootball.footballapi.converter.impl;

import com.phatcao.myfootball.core.dao.entity.TeamEntity;
import com.phatcao.myfootball.footballapi.converter.FATeamConverter;
import com.phatcao.myfootball.footballapi.model.response.team.TeamResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Component
public class FATeamConverterImpl implements FATeamConverter {

	@Override
	public List<TeamEntity> convertToTeamEntity(final List<TeamResponse> teamResponse) {

		return teamResponse.stream().map(this::convertToTeamEntity).collect(Collectors.toList());

	}

	private TeamEntity convertToTeamEntity(final TeamResponse teamResponse) {
		if (Objects.nonNull(teamResponse) && Objects.nonNull(teamResponse.getTeam()) && Objects.nonNull(teamResponse.getVenue())) {
			final TeamEntity teamEntity = new TeamEntity();
			teamEntity.setNameTeam(teamResponse.getTeam().getName());
			teamEntity.setFounded(teamResponse.getTeam().getFounded());
			teamEntity.setVenue(teamResponse.getVenue().getId());
			teamEntity.setType(teamResponse.getTeam().isNational() ? 1 : 0);
			teamEntity.setLogo(teamResponse.getTeam().getLogo());
			teamEntity.setId(teamResponse.getTeam().getId());
			teamEntity.setCodeTeam("111");
			return teamEntity;
		}
		return null;
	}

}
