package com.phatcao.myfootball.core.dto.leauge;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.phatcao.myfootball.core.dto.country.CountryData;
import com.phatcao.myfootball.core.dto.league_session.LeagueSessionData;
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
	@JsonProperty("flag")
	private String flag;
	@JsonProperty("logo")
	private String logo;

}
