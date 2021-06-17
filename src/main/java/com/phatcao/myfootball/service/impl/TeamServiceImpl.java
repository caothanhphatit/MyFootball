package com.phatcao.myfootball.service.impl;

import com.phatcao.myfootball.dao.entity.TeamEntity;
import com.phatcao.myfootball.dao.repository.TeamRepository;
import com.phatcao.myfootball.dto.team.TeamData;
import com.phatcao.myfootball.service.TeamService;
import com.phatcao.myfootball.util.converter.TeamConverter;
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
