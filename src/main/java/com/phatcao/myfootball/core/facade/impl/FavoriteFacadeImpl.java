package com.phatcao.myfootball.core.facade.impl;

import com.phatcao.myfootball.core.dto.common.ResponseData;
import com.phatcao.myfootball.core.dto.leauge.LeagueData;
import com.phatcao.myfootball.core.facade.FavoriteFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FavoriteFacadeImpl implements FavoriteFacade {


    @Override
    public ResponseData addFavoriteLeague( List<LeagueData> leagueData) {
        return null;
    }
}
