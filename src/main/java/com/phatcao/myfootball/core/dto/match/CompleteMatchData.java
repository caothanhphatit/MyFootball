package com.phatcao.myfootball.core.dto.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.phatcao.myfootball.core.dto.card.CardData;
import com.phatcao.myfootball.core.dto.score.ScoreData;
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
