package com.phatcao.myfootball.footballapi.converter;

import com.phatcao.myfootball.core.dao.entity.VenueEntity;
import com.phatcao.myfootball.footballapi.model.response.team.TeamResponse;

import java.util.List;


public interface FAVenueConverter {

	List<VenueEntity> convertToEntityList(List<TeamResponse> teamResponses);
}
