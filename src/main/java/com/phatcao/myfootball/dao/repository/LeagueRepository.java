package com.phatcao.myfootball.dao.repository;

import com.phatcao.myfootball.dao.entity.LeagueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LeagueRepository extends JpaRepository<LeagueEntity, Long>
{

}
