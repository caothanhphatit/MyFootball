package com.phatcao.myfootball.core.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fb_match")
public class MatchEntity extends CommonEntity implements Serializable
{
	@Column(name = "match_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long matchId;

	@Column(name = "league_session_id")
	private long leagueSessionId;

	@Column(name = "code_team_home")
	private String codeTeamHome;

	@Column(name = "code_team_guest")
	private String codeTeamGuest;

	@Column(name = "score_team_home")
	private int scoreTeamHome;

	@Column(name = "score_team_guest")
	private int scoreTeamGuest;

	@Column(name = "location")
	private String location;

	@Column(name = "status")
	private int status;
}
