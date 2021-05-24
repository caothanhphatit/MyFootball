package com.phatcao.myfootball.dto;

import com.phatcao.myfootball.dto.team.TeamData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StandingSessionData implements Serializable
{
	private TeamData team ;
	private int matchPlay;
	private int win;
	private int draw;
	private int lost;
	private int goalScore;
	private int goalAgainst;
	private int goalDiff;
	private int point;

}
