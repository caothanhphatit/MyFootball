package com.phatcao.myfootball.core.service;

import com.phatcao.myfootball.core.dao.entity.TeamEntity;
import com.phatcao.myfootball.core.dto.team.TeamData;

import java.util.List;


public interface TeamService {

	TeamEntity getTeamById(String codeTeam);

	TeamData getTeamDataById(String codeTeam);

	boolean saveAll(List<TeamEntity> teamEntity);
}
