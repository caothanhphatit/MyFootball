package com.phatcao.myfootball.footballapi.facade;

import com.phatcao.myfootball.core.dto.common.ResponseData;
import com.phatcao.myfootball.footballapi.DTO.request.FetchTeamRequest;
import org.springframework.http.ResponseEntity;


public interface FATeamFacade {

	ResponseEntity<ResponseData> fetchTeam(FetchTeamRequest fetchTeamRequest);

}
