package com.phatcao.myfootball.dto.leauge;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.phatcao.myfootball.dto.country.CountryData;
import com.phatcao.myfootball.dto.league_session.LeagueSessionData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeagueData implements Serializable
{
	@JsonProperty("league_id")
	private int leagueId;
	@JsonProperty("league_name")
	private String leagueName;
	@JsonProperty("country")
	private CountryData country;
	@JsonProperty("league_session")
	private List<LeagueSessionData> leagueSessionData;

}
