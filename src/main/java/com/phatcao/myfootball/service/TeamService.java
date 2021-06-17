package com.phatcao.myfootball.service;

import com.phatcao.myfootball.dao.entity.TeamEntity;
import com.phatcao.myfootball.dto.team.TeamData;


public interface TeamService
{
	TeamEntity getTeamById(String codeTeam);
	TeamData getTeamDataById(String codeTeam);
}
