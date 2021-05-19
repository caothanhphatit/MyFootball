package com.phatcao.myfootball.service;

import com.phatcao.myfootball.dao.entity.UserLeagueEntity;

import java.util.List;


public interface UserLeagueService
{
	List<UserLeagueEntity> getUserLeagueByUserName(String userName);
}
