package com.phatcao.myfootball.core.service.impl;

import com.phatcao.myfootball.core.dao.entity.VenueEntity;
import com.phatcao.myfootball.core.dao.repository.VenueRepository;
import com.phatcao.myfootball.core.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;


@Service
public class VenueServiceImpl implements VenueService {


	@Autowired
	VenueRepository repository;

	@Override
	public boolean saveAll(final List<VenueEntity> entities) {
		return !CollectionUtils.isEmpty(repository.saveAll(entities));
	}

}
