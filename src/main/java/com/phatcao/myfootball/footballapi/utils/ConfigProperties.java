package com.phatcao.myfootball.footballapi.utils;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ConfigProperties
{
	@Value("${fb.api.key}")
	private String apiKey;

	@Value("${fb.api.host}")
	private String apiHost;

	@Value("${base.url}")
	private String baseUrl;
}
