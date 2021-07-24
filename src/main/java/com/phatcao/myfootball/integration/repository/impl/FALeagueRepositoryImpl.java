package com.phatcao.myfootball.integration.repository.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.phatcao.myfootball.dao.repository.LeagueRepository;
import com.phatcao.myfootball.integration.model.response.LeagueInfoResponseModel;
import com.phatcao.myfootball.integration.model.response.LeagueResponseModel;
import com.phatcao.myfootball.integration.repository.FALeagueRepository;
import com.phatcao.myfootball.integration.utils.FAConstant;
import com.phatcao.myfootball.integration.utils.FARequestAPI;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FALeagueRepositoryImpl implements FALeagueRepository {

    @Override
    public List<LeagueResponseModel> fetchAllLeague()  {
        String url = FAConstant.BASE_URL + FAConstant.URL.LEAGUES;
        JSONObject jsonObject = FARequestAPI.getMethod(url);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            if (jsonObject != null) {
                // get data from jsonObject
                final JSONArray jsonArray = jsonObject.getJSONArray("response");

                    final List<LeagueResponseModel> listLeague = objectMapper
                            .readValue(jsonArray.toString(), new TypeReference<List<LeagueResponseModel>>() {
                            });
                    return listLeague;
            }
        }
        catch (final Exception e){
            throw new RuntimeException(e);
            }
        return null;
    }



}
