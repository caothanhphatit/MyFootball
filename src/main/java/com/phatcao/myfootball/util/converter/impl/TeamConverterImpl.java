package com.phatcao.myfootball.util.converter.impl;

import com.phatcao.myfootball.dao.entity.TeamEntity;
import com.phatcao.myfootball.dto.team.TeamData;
import com.phatcao.myfootball.util.converter.TeamConverter;
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
		return target;
	}
}
