package com.phatcao.myfootball.footballapi.repository.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.phatcao.myfootball.footballapi.conmon.FAConstant;
import com.phatcao.myfootball.footballapi.model.response.LeagueResponseModel;
import com.phatcao.myfootball.footballapi.repository.FALeagueRepository;
import com.phatcao.myfootball.footballapi.utils.FARequestAPI;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class FALeagueRepositoryImpl implements FALeagueRepository
{

    @Value("${base.url}")
    private String BASE_URL;

    @Autowired
    FARequestAPI faRequestAPI;
    @Override
    public List<LeagueResponseModel> fetchAllLeague()  {
        String url = BASE_URL + FAConstant.URL.LEAGUES;
        JSONObject jsonObject = faRequestAPI.getMethod(url);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            if (jsonObject != null) {
                // get data from jsonObject
                final JSONArray jsonArray = jsonObject.getJSONArray("response");
                    final List<LeagueResponseModel> listLeague = objectMapper
                            .readValue(jsonArray.toString(), new TypeReference<>() {
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
