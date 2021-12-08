package com.phatcao.myfootball.footballapi.repository;

import com.phatcao.myfootball.footballapi.model.response.LeagueResponseModel;
import org.json.JSONException;

import java.util.List;


public interface FALeagueRepository {

 List<LeagueResponseModel> fetchAllLeague() throws JSONException;

}
