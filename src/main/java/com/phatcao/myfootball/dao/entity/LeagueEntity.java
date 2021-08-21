package com.phatcao.myfootball.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

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
	private int leagueId;

	@Column(name="league_name")
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
