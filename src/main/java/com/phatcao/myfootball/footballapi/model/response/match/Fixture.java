package com.phatcao.myfootball.footballapi.model.response.match;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fixture implements Serializable {

	private static final long serialVersionUID = -8186632542196609647L;

	private long id;

	private String referee;

	private String date;

	private String timezone;

	/**
	 * time the match
	 */
	private String timestamp;

	/**
	 * place to face to face
	 */
	private Venue venue;
}
