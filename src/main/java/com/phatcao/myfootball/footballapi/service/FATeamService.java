package com.phatcao.myfootball.footballapi.service;

import com.phatcao.myfootball.footballapi.model.response.team.TeamResponse;
import lombok.NonNull;

import java.util.List;


public interface FATeamService {

	List<TeamResponse> fetchTeam(@NonNull int leagueId, @NonNull int year);

}
