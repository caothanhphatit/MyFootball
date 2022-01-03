package com.phatcao.myfootball.footballapi.service.impl;

import com.phatcao.myfootball.footballapi.model.response.team.TeamResponse;
import com.phatcao.myfootball.footballapi.repository.FATeamRepository;
import com.phatcao.myfootball.footballapi.service.FATeamService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FATeamServiceImpl implements FATeamService {

	@Autowired
	FATeamRepository teamRepository;

	@Override
	public List<TeamResponse> fetchTeam(@NonNull final int leagueId, @NonNull final int year) {
		return teamRepository.fetchTeamByLeagueAndSession(leagueId, year);
	}
}
