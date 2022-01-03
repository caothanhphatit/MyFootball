package com.phatcao.myfootball.footballapi.converter;

import com.phatcao.myfootball.core.dao.entity.TeamEntity;
import com.phatcao.myfootball.footballapi.model.response.team.TeamResponse;

import java.util.List;


public interface FATeamConverter {

	List<TeamEntity> convertToTeamEntity(List<TeamResponse> teamResponse);

}
