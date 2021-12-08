package com.phatcao.myfootball.core.util.converter.impl;

import com.phatcao.myfootball.core.dao.entity.TeamEntity;
import com.phatcao.myfootball.core.dto.team.TeamData;
import com.phatcao.myfootball.core.util.converter.TeamConverter;
import org.springframework.stereotype.Component;


@Component
public class TeamConverterImpl implements TeamConverter
{
	@Override
	public TeamData convertDAOtoDTO(TeamEntity source)
	{
		TeamData target = new TeamData();
		target.setName(source.getNameTeam());
		target.setImage(source.getCodeTeam());
		target.setImage("default");
		target.setCodeTeam(source.getCodeTeam());
		return target;
	}
}
