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
@Table(name = "league_session")
public class LeagueSessionEntity extends CommonEntity implements Serializable
{
	@Column(name = "leagueId")
	private int leagueId;

	@Column(name = "league_session_name")
	private String leagueSessionName;

	@Column(name = "start_day")
	private String startDay;

	@Column(name = "end_day")
	private String endDay;

	@Column (name = "year")
	private int year;

}
