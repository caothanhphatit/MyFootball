package com.phatcao.myfootball.core.dto.score;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreData
{
	private long scoreId;

	private long playerId;

	private long time;
}
