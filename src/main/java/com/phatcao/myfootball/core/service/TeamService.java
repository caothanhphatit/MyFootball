package com.phatcao.myfootball.core.service;

import com.phatcao.myfootball.core.dao.entity.TeamEntity;
import com.phatcao.myfootball.core.dto.team.TeamData;


public interface TeamService
{
	TeamEntity getTeamById(String codeTeam);
	TeamData getTeamDataById(String codeTeam);
}
