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
@Table(name = "league_session")
public class LeagueSessionEntity implements Serializable
{
	@Id
	@Column(name = "league_session_id", unique = true, nullable = false, insertable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leagueSessionId;

	@Column(name = "leagueId")
	private int leagueId;

	@Column(name = "league_session_name")
	private String leagueSessionName;

	@Column(name = "start_day")
	private long startDay;

	@Column(name = "end_day")
	private long endDay;

}
