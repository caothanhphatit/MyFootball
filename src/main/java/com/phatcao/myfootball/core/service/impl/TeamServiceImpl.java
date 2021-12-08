package com.phatcao.myfootball.core.service.impl;

import com.phatcao.myfootball.core.dao.entity.TeamEntity;
import com.phatcao.myfootball.core.dao.repository.TeamRepository;
import com.phatcao.myfootball.core.dto.team.TeamData;
import com.phatcao.myfootball.core.service.TeamService;
import com.phatcao.myfootball.core.util.converter.TeamConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TeamServiceImpl implements TeamService
{
	@Autowired
	TeamConverter teamConverter;
	@Autowired
	TeamRepository teamRepository;

	@Override
	public TeamEntity getTeamById(final String codeTeam)
	{
		return teamRepository.getOne(codeTeam);
	}

	@Override
	public TeamData getTeamDataById(String codeTeam)
	{

		return teamConverter.convertDAOtoDTO(teamRepository.getOne(codeTeam));
	}
}
