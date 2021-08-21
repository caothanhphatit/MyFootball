package com.phatcao.myfootball.integration.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Arrays;

public class FAUtils {

    public HttpHeaders buildHttpHeaders()
    {
        final HttpHeaders headers = new HttpHeaders();
        headers.set(FAConstant.FOOTBALL_API_RAPID_KEY, "e015a232aemsh9abdc95228ddf57p1c9ebajsn99cba329d0ba");
        headers.set(FAConstant.FOOTBALL_API_RAPID_HOST, "api-football-v1.p.rapidapi.com/v3");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}
