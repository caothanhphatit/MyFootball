package com.phatcao.myfootball.facade.impl;

import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.dto.leauge.LeagueData;
import com.phatcao.myfootball.facade.FavoriteFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FavoriteFacadeImpl implements FavoriteFacade {
    @Override
    public ResponseData addFavoriteLeague( List<LeagueData> leagueData) {
        return null;
    }
}
