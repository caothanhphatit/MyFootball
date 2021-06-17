package com.phatcao.myfootball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.swing.*;


@EnableJpaRepositories
@SpringBootApplication
public class MyFootballApplication extends SpringBootServletInitializer
{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyFootballApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(MyFootballApplication.class, args);
	}

}
