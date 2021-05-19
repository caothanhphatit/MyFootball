package com.phatcao.myfootball.dao.repository;

import com.phatcao.myfootball.dao.entity.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MatchRepository extends JpaRepository<MatchEntity,Long >
{
	@Query("select m from MatchEntity m where m.leagueSessionId = ?1")
	List<MatchEntity> findAllMatchByLeagueId(long leagueId);


}
