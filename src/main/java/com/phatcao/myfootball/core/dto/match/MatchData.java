package com.phatcao.myfootball.core.dto.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.phatcao.myfootball.core.dto.team.TeamData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchData implements Serializable
{
	@JsonProperty("match_id")
	private long matchId;

	@JsonProperty("home")
	private TeamData home;

	@JsonProperty ("guest")
	private TeamData guest;

	@JsonProperty("location")
	private int location;
}
