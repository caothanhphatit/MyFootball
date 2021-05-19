package com.phatcao.myfootball.controller;

import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.facade.HomeFacade;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/home")
public class HomeController
{
	@Resource
	HomeFacade homeFacade;

	@GetMapping("/index")
	public ResponseEntity<?> getHome()
	{
		ResponseData result = homeFacade.getHomePage();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
