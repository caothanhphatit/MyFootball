package com.phatcao.myfootball.util.converter;

import com.phatcao.myfootball.dao.entity.TeamEntity;
import com.phatcao.myfootball.dto.team.TeamData;


public interface TeamConverter
{
	TeamData convertDAOtoDTO(TeamEntity source);
}
