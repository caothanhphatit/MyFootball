package com.phatcao.myfootball.core.util.converter;

import com.phatcao.myfootball.core.dao.entity.MatchEntity;
import com.phatcao.myfootball.core.dto.match.CompleteMatchData;
import com.phatcao.myfootball.core.dto.match.IncomingMatchData;
import com.phatcao.myfootball.core.dto.match.MatchData;

import java.util.List;


public interface MatchConverter
{
	MatchData convertEntityToData(MatchEntity source);

	List<MatchData> convertEntitiesToDataList(List<MatchEntity> sources);

	IncomingMatchData convertEntityToIncomingMatchData(MatchEntity source);

	CompleteMatchData convertEntityToCompleteMatchData(MatchEntity m);
}
