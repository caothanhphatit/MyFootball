package com.phatcao.myfootball.footballapi.model.response.team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;


/**
 * venue from team
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class VenueInformation implements Serializable {

	private static final long serialVersionUID = -3103650590919905309L;

	private long id;

	private String name;

	private String address;

	private String city;

	private int capacity;

	private String surface;

	private String image;
}
