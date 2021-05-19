package com.phatcao.myfootball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@SpringBootApplication
public class MyFootballApplication
{

	public static void main(String[] args) {
		SpringApplication.run(MyFootballApplication.class, args);
	}

}
