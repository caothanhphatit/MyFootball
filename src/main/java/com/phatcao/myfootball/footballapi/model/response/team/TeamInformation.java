package com.phatcao.myfootball.footballapi.model.response.team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamInformation implements Serializable {

	private static final long serialVersionUID = -8023688757053108119L;

	private long id;

	private String name;

	private String country;

	private String founded;

	private boolean national;

	private String logo;


}
