package com.phatcao.myfootball.footballapi.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueResponseModel implements Serializable
{

	private LeagueInfoResponseModel league;
	private CountryResponseModel country;
	private List<SeasonResponseModel> seasons;

	public LeagueInfoResponseModel getLeague()
	{
		return league;
	}

	public void setLeague(LeagueInfoResponseModel league)
	{
		this.league = league;
	}

	public CountryResponseModel getCountry()
	{
		return country;
	}

	public void setCountry(CountryResponseModel country)
	{
		this.country = country;
	}

	public List<SeasonResponseModel> getSeasons()
	{
		return seasons;
	}

	public void setSeasons(List<SeasonResponseModel> seasons)
	{
		this.seasons = seasons;
	}

}
