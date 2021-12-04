package com.phatcao.myfootball.core.facade;

import com.phatcao.myfootball.core.dto.common.ResponseData;
import com.phatcao.myfootball.core.dto.leauge.LeagueData;

import java.util.List;

public interface FavoriteFacade {
    ResponseData addFavoriteLeague( List<LeagueData> leagueData);
}
