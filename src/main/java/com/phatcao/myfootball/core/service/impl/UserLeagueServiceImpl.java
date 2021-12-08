package com.phatcao.myfootball.core.service.impl;

import com.phatcao.myfootball.core.dao.entity.UserLeagueEntity;
import com.phatcao.myfootball.core.dao.repository.UserLeagueRepository;
import com.phatcao.myfootball.core.service.UserLeagueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserLeagueServiceImpl implements UserLeagueService
{
	@Resource
	UserLeagueRepository userLeagueRepository;

	@Override
	public List<UserLeagueEntity> getUserLeagueByUserName(final String userName)
	{
		return userLeagueRepository.findAllByUserName(userName);
	}

}
