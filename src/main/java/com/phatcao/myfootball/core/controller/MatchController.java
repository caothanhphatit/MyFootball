package com.phatcao.myfootball.core.controller;

import com.phatcao.myfootball.core.dto.common.ResponseData;
import com.phatcao.myfootball.core.facade.MatchFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MatchController
{

	@Autowired
	MatchFacade matchFacade;

	@GetMapping("match/{id}/info")
	public ResponseEntity getInfoMatch(@PathVariable String id){
		ResponseData data ;
		try{
			if(id == null ) return null;
			long matchId = Long.parseLong(id);

			  data =matchFacade.getMatchInfoByMatchId(matchId);

		}
		catch (Exception e)
		{
			data = new ResponseData(false, e.getMessage() , null );
		}
		return new ResponseEntity(data, HttpStatus.OK);
	}
}
