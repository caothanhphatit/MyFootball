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
@Table(name = "match")
public class MatchEntity implements Serializable
{
	@Id
	@Column(name = "match_id", unique = true, nullable = false, insertable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long matchId;

	@Column(name = "league_session_id")
	private long leagueSessionId;

	@Column(name = "code_team_home")
	private int codeTeamHome;

	@Column(name = "code_team_guest")
	private int codeTeamGuest;

	@Column(name ="score_team_home")
	private int scoreTeamHome;

	@Column(name = "score_team_guest")
	private int scoreTeamGuest;

	@Column(name = "location")
	private String location;

	@Column(name = "status")
	private int status;
}
