package com.phatcao.myfootball.core.dao.repository;

import com.phatcao.myfootball.core.dao.entity.LeagueEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LeagueRepository extends JpaRepository<LeagueEntity, Integer>
{

	Page<LeagueEntity> findByIsActive(int isActive, Pageable pageable);

	List<LeagueEntity> findByIsActive();
}
