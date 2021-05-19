package com.phatcao.myfootball.service.impl;

import com.phatcao.myfootball.dao.entity.UserLeagueEntity;
import com.phatcao.myfootball.dao.repository.UserLeagueRepository;
import com.phatcao.myfootball.service.UserLeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserLeagueServiceImpl implements UserLeagueService
{
	@Resource
	UserLeagueRepository userLeagueRepository;
	@Override
	public List<UserLeagueEntity> getUserLeagueByUserName(String userName)
	{
		return userLeagueRepository.findAllByUserName(userName);
	}

}
