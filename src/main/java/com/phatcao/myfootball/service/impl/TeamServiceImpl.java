package com.phatcao.myfootball.service.impl;

import com.phatcao.myfootball.dao.entity.TeamEntity;
import com.phatcao.myfootball.dao.repository.TeamRepository;
import com.phatcao.myfootball.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TeamServiceImpl implements TeamService
{
	@Autowired
	TeamRepository teamRepository;

	@Override
	public TeamEntity getTeamById(final int codeTeam)
	{
		return teamRepository.getOne(codeTeam);
	}
}
