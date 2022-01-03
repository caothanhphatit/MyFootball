package com.phatcao.myfootball.footballapi.model.response.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * status of match
 */
@Data
public class Status implements Serializable {

	private static final long serialVersionUID = -555914791915866892L;

	@JsonProperty(value = "long")
	private String longs;

	@JsonProperty(value = "short")
	private String shorts;
}
