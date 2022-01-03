package com.phatcao.myfootball.footballapi.converter.impl;

import com.phatcao.myfootball.core.dao.entity.VenueEntity;
import com.phatcao.myfootball.footballapi.converter.FAVenueConverter;
import com.phatcao.myfootball.footballapi.model.response.team.TeamResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Component
public class FAVenueConverterImpl implements FAVenueConverter {
	@Override
	public List<VenueEntity> convertToEntityList(final List<TeamResponse> teamResponses) {
		return teamResponses.stream().map(this::convertToEntity).collect(Collectors.toList());
	}

	private VenueEntity convertToEntity(final TeamResponse teamResponse) {
		if (Objects.nonNull(teamResponse.getVenue())) {
			final VenueEntity entity = new VenueEntity();

			entity.setAddress(teamResponse.getVenue().getAddress());
			entity.setCity(teamResponse.getVenue().getCity());
			entity.setCapacity(teamResponse.getVenue().getCapacity());
			entity.setName(teamResponse.getVenue().getName());
			entity.setId(teamResponse.getVenue().getId());
			entity.setPhoto(teamResponse.getVenue().getImage());
			entity.setSurface(teamResponse.getVenue().getSurface());

			return entity;
		}
		return null;
	}



}
