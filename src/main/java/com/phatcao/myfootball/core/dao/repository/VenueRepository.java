package com.phatcao.myfootball.core.dao.repository;

import com.phatcao.myfootball.core.dao.entity.VenueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VenueRepository extends JpaRepository<VenueEntity, Long> {

}
