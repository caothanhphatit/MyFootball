package com.phatcao.myfootball.core.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_league")
public class UserLeagueEntity extends CommonEntity implements Serializable
{
	@Column(name = "user_league_id")
	private long userLeagueId;
	@Column(name = "is_delete")
	private boolean isDelete;
	@Column(name = "user_name")
	protected String userName;
	@Column(name = "league_id")
	protected int leagueId;




}
