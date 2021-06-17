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
@Table(name = "league")
public class LeagueEntity implements Serializable
{
	@Id
	@Column(name = "league_id", unique = true, nullable = false, insertable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leagueId;

	@Column(name="league_name")
	private String leagueName;

	@Column(name = "country")
	private int country;

	@Column(name = "status")
	private int status;
}
