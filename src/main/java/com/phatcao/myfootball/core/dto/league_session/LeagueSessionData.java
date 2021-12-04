package com.phatcao.myfootball.core.dto.league_session;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeagueSessionData
{
	private Long id;
	private String name;
	private Date startDay;
	private Date endDay;
}
