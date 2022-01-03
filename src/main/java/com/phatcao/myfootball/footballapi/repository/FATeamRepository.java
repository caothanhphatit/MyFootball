package com.phatcao.myfootball.footballapi.repository;

import com.phatcao.myfootball.footballapi.model.response.team.TeamResponse;

import java.util.List;


/**
 * call api to get team information
 */
public interface FATeamRepository {

	/**
	 * fetch team following session data
	 *
	 * @return
	 */
	List<TeamResponse> fetchTeamByLeagueAndSession(int leagueId, int sessionYear);

}
