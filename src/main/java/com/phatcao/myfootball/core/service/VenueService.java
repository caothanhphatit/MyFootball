package com.phatcao.myfootball.core.service;

import com.phatcao.myfootball.core.dao.entity.VenueEntity;

import java.util.List;


public interface VenueService {


	boolean saveAll(final List<VenueEntity> entities);

}
