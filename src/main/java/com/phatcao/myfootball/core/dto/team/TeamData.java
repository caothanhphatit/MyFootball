package com.phatcao.myfootball.core.dto.team;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamData
{
		@JsonProperty("code_team")
		private String codeTeam;

		@JsonProperty("image")
		private String image;

		@JsonProperty("name")
		private String name;

		@JsonProperty("score")
		private Integer score;
}
