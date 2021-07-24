package com.phatcao.myfootball.integration.repository;

import com.phatcao.myfootball.integration.model.response.LeagueResponseModel;
import org.json.JSONException;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface FALeagueRepository {

 List<LeagueResponseModel> fetchAllLeague() throws JSONException;




}
