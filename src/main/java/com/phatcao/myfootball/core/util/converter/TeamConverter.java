package com.phatcao.myfootball.core.util.converter;

import com.phatcao.myfootball.core.dao.entity.TeamEntity;
import com.phatcao.myfootball.core.dto.team.TeamData;


public interface TeamConverter
{
	TeamData convertDAOtoDTO(TeamEntity source);
}
