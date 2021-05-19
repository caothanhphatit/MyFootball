package com.phatcao.myfootball.dto.match;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.phatcao.myfootball.dto.ScoreData;
import com.phatcao.myfootball.dto.card.CardData;
import com.phatcao.myfootball.dto.team.TeamData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompleteMatchData extends MatchData implements Serializable
{

	@JsonProperty("score_team_home")
	private int scoreTeamHome;

	@JsonProperty("score_team_guest")
	private int scoreTeamGuest;

	@JsonProperty("score_data")
	private ScoreData scoreData;

	@JsonProperty("card_data")
	private CardData cardData;
}
