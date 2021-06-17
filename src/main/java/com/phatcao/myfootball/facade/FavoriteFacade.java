package com.phatcao.myfootball.facade;

import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.dto.leauge.LeagueData;

import java.util.List;

public interface FavoriteFacade {
    ResponseData addFavoriteLeague( List<LeagueData> leagueData);
}
