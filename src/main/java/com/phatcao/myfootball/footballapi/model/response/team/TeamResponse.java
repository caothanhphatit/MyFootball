package com.phatcao.myfootball.footballapi.model.response.team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamResponse implements Serializable {

	private static final long serialVersionUID = 577421517205686990L;

	private TeamInformation team;

	private VenueInformation venue;

}
