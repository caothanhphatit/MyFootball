package com.phatcao.myfootball.dto.leauge;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.phatcao.myfootball.dto.country.CountryData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeagueData implements Serializable
{
	@JsonProperty("league_id")
	private int leagueId;
	@JsonProperty("league_name")
	private int leagueName;
	@JsonProperty("country")
	private CountryData country;
}
