package com.phatcao.myfootball.service;

import com.phatcao.myfootball.dao.entity.TeamEntity;


public interface TeamService
{
	TeamEntity getTeamById(int codeTeam);
}
