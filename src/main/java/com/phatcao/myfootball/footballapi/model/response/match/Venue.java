package com.phatcao.myfootball.footballapi.model.response.match;

import lombok.Data;

import java.io.Serializable;


@Data
public class Venue implements Serializable {

	private static final long serialVersionUID = -2959900679629864597L;

	private long id;

	private String name;

	private String city;

	private Status status;

}
