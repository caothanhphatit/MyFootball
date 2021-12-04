package com.phatcao.myfootball.core.dto.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseData
{
	@JsonProperty("success")
	private boolean success;
	@JsonProperty("message")
	private String message;
	@JsonProperty("data")
	private Object data;
}
