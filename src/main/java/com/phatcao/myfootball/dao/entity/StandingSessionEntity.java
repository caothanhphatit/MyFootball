package com.phatcao.myfootball.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "standing_session")
public class StandingSessionEntity implements Serializable
{

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "match_play")
	private int matchPlay;

	@Column(name = "win")
	private int win;

	@Column(name = "draw")
	private int draw;

	@Column(name = "lost")
	private int lost;

	@Column(name = "goal_score")
	private int goalScore;

	@Column(name = "goal_against")
	private int goalAgainst;

	@Column(name = "goal_different")
	private int goalDifferent;

	@Column(name = "points")
	private int points;

	@Column(name= "league_session_id")
	protected int leagueSessionId;

	@Column(name = "group_id")
	protected int groupId;

	@Column(name = "code_team")
	private int codeTeam;



}
