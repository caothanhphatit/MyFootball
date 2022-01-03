package com.phatcao.myfootball.footballapi.model.response.match;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.phatcao.myfootball.footballapi.model.response.team.TeamResponse;
import lombok.Data;

import java.io.Serializable;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchResponseModel implements Serializable {
	private static final long serialVersionUID = 6696667852205881465L;

	/**
	 * match information
	 */
	private Fixture fixture;

	/**
	 * teams of match
	 */
	private TeamResponse teams;

	/**
	 * goals of two teams
	 */
	private Goal goals;

	/**
	 * score of :</br>
	 * half time
	 * full time
	 * extratime
	 * penalty
	 */
	private Score score;

}
