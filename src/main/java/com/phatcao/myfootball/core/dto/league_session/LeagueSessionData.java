package com.phatcao.myfootball.core.dto.league_session;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeagueSessionData implements Serializable {

	private static final long serialVersionUID = 227197524667793454L;

	private Long id;

	private String name;

	private Date startDay;

	private Date endDay;
}
