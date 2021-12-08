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
@Table(name = "player")
public class PlayerEntity extends CommonEntity implements Serializable
{
	@Column(name = "player_id", unique = true, nullable = false, insertable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leagueSessionId;

	@Column(name = "player_name")
	private String playerName;

	@Column(name = "code_team_current")
	private int codeTeamCurrent;

	@Column(name = "national_team")
	private int nationalTeam;

}
