package com.phatcao.myfootball.core.dto.home;

import com.phatcao.myfootball.core.dto.leauge.LeagueData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomeData implements Serializable
{
	LeagueData leagueData;

}
