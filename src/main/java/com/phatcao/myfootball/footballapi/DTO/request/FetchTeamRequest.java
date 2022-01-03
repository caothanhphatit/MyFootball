package com.phatcao.myfootball.footballapi.DTO.request;

import lombok.Data;

import java.io.Serializable;


@Data
public class FetchTeamRequest implements Serializable {

	private static final long serialVersionUID = -4368846684347688678L;

	private int leagueId;

	private int sessionYear;
}
