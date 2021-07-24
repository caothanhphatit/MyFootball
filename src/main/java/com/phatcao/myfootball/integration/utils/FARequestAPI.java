package com.phatcao.myfootball.integration.utils;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class FARequestAPI {

    private static HttpEntity<?> getHttpEntity()
    {
        final FAUtils faUtils = new FAUtils();
        return new HttpEntity<>(faUtils.buildHttpHeaders());
    }

    private static HttpEntity<?> getHttpEntity(final Object body)
    {
        final FAUtils faUtils = new FAUtils();
        return new HttpEntity<>(body, faUtils.buildHttpHeaders());
    }

    public static JSONObject getMethod(final String url)
    {
        final JSONObject result;
        final RestTemplate restTemplate = new RestTemplate();
        try
        {
            final ResponseEntity<?> responseEntity = restTemplate.exchange(url, HttpMethod.GET, getHttpEntity(), String.class);
            if (responseEntity.getStatusCode() == HttpStatus.OK)
            {
                result = new JSONObject(responseEntity.getBody().toString());
                return result;
            }
        }
        catch (final Exception e)
        {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public static JSONObject postMethod(final String url, final Object body) throws JSONException {
        final JSONObject result;
        final RestTemplate restTemplate = new RestTemplate();
        try
        {
            final ResponseEntity<?> responseEntity = restTemplate.exchange(url, HttpMethod.POST, getHttpEntity(body), String.class);
            if (responseEntity.getStatusCode() == HttpStatus.CREATED)
            {
                result = new JSONObject(responseEntity.getBody().toString());
                return result;
            }
        }
        catch (final Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        return null;
    }

    public static boolean deleteMethod(final String url)
    {
        final RestTemplate restTemplate = new RestTemplate();
        try
        {
            final ResponseEntity<?> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, getHttpEntity(), String.class);
            if (responseEntity.getStatusCode() == HttpStatus.NO_CONTENT)
                return true;
            return false;
        }
        catch (final Exception e)
        {
            e.printStackTrace();
            throw e;
        }
    }

    public static JSONObject putMethod(final String url, final Map<String, Object> body) throws JSONException {
        final JSONObject result;
        final RestTemplate restTemplate = new RestTemplate();
        try
        {
            final ResponseEntity<?> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, getHttpEntity(body), String.class);
            if (responseEntity.getStatusCode() == HttpStatus.OK)
            {
                result = new JSONObject(responseEntity.getBody().toString());
                return result;
            }
        }
        catch (final Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        return null;
    }
}
