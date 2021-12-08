package com.phatcao.myfootball.core.service;

import com.phatcao.myfootball.core.dao.entity.UserLeagueEntity;

import java.util.List;


public interface UserLeagueService
{
	List<UserLeagueEntity> getUserLeagueByUserName(String userName);
}
