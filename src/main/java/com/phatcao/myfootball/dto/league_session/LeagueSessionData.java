package com.phatcao.myfootball.dto.league_session;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DateTimeException;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeagueSessionData
{
	private int id;
	private String name;
	private Date startDay;
	private Date endDay;
}
