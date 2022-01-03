package com.phatcao.myfootball.footballapi.utils;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Objects;


@Component
public class FARequestAPI {

	@Autowired
	private FootballApiUtil footballApiUtil;

	private HttpEntity<?> getHttpEntity() {

		return new HttpEntity<>(footballApiUtil.buildHttpHeaders());
	}

	private HttpEntity<?> getHttpEntity(final Object body) {
		return new HttpEntity<>(body, footballApiUtil.buildHttpHeaders());
	}

	public JSONObject getMethod(final String url) {
		final JSONObject result;
		final RestTemplate restTemplate = new RestTemplate();
		try {
			final ResponseEntity<?> responseEntity = restTemplate.exchange(url, HttpMethod.GET, getHttpEntity(), String.class);
			if (responseEntity.getStatusCode() == HttpStatus.OK && Objects.nonNull(responseEntity.getBody())) {
				result = new JSONObject(responseEntity.getBody().toString());
				return result;
			}
		}
		catch (final Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	public JSONObject postMethod(final String url, final Object body) throws JSONException {
		final JSONObject result;
		final RestTemplate restTemplate = new RestTemplate();
		try {
			final ResponseEntity<?> responseEntity = restTemplate.exchange(url, HttpMethod.POST, getHttpEntity(body), String.class);
			if (responseEntity.getStatusCode() == HttpStatus.CREATED && Objects.nonNull(responseEntity.getBody())) {
				result = new JSONObject(responseEntity.getBody().toString());
				return result;
			}
		}
		catch (final Exception e) {
			e.printStackTrace();
			throw e;
		}
		return null;
	}

	public boolean deleteMethod(final String url) {
		final RestTemplate restTemplate = new RestTemplate();
		try {
			final ResponseEntity<?> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, getHttpEntity(), String.class);
			if (responseEntity.getStatusCode() == HttpStatus.NO_CONTENT) {
				return true;
			}
			return false;
		}
		catch (final Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public JSONObject putMethod(final String url, final Map<String, Object> body) throws JSONException {
		final JSONObject result;
		final RestTemplate restTemplate = new RestTemplate();
		try {
			final ResponseEntity<?> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, getHttpEntity(body), String.class);
			if (responseEntity.getStatusCode() == HttpStatus.OK && Objects.nonNull(responseEntity.getBody())) {
				result = new JSONObject(responseEntity.getBody().toString());
				return result;
			}
		}
		catch (final Exception e) {
			e.printStackTrace();
			throw e;
		}
		return null;
	}
}
