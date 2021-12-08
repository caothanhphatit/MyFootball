package com.phatcao.myfootball.core.dto.leauge;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.phatcao.myfootball.core.dto.match.CompleteMatchData;
import com.phatcao.myfootball.core.dto.match.IncomingMatchData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeagueMatchData extends LeagueData implements Serializable
{

	@JsonProperty ("incoming_matches")
	List<IncomingMatchData> incomingMatchList;

	@JsonProperty ("complete_matches")
	List<CompleteMatchData> completeMatchDataList;

}
