package com.phatcao.myfootball.core.service;

import com.phatcao.myfootball.core.dao.entity.LeagueEntity;
import com.phatcao.myfootball.core.dto.leauge.LeagueData;
import com.phatcao.myfootball.footballapi.model.response.LeagueResponseModel;
import org.json.JSONException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface LeagueService
{
	 List<LeagueResponseModel> getAllLeagueFromFA() throws JSONException;

	 List<LeagueData> getAllLeague();
	 Page<LeagueData> getAllLeague(Pageable pageable);
	List<LeagueData> getLeaguesByListId(List<Integer> ids);

	LeagueData getLeagueInfoById(Integer leagueId);

    void saveList(List<LeagueEntity> leagueEntities);
}
