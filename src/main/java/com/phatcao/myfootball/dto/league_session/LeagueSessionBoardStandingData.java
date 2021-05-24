package com.phatcao.myfootball.dto.league_session;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.phatcao.myfootball.dto.StandingSessionData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeagueSessionBoardStandingData
{
	@JsonProperty("group")
	private String group;
	@JsonProperty("board")
	private List<StandingSessionData> standingSessionData;
}
