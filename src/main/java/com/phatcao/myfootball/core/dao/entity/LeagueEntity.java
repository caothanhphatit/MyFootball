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
@Table(name = "league")
public class LeagueEntity extends CommonEntity implements Serializable
{
	@Column(name = "league_id")
	private int leagueId;

	@Column(name = "league_name")
	private String leagueName;

	@Column(name = "country")
	private String country;

	@Column(name = "type")
	private String type;

	@Column(name = "logo")
	private String logo;

	@Column(name = "flag")
	private String flag;

	@Column(name = "country_code")
	private String countryCode;

	@Column(name = "status")
	private int status;
}
