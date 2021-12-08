package com.phatcao.myfootball.core.dao.repository;

import com.phatcao.myfootball.core.dao.entity.LeagueSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LeagueSessionRepository extends JpaRepository<LeagueSessionEntity, Integer>
{
	//	@Query("select m from LeagueSessionEntity m where m.leagueId = ?1")
	//	List<LeagueSessionEntity> findByLeagueId(Integer leagueId);

	List<LeagueSessionEntity> findLeagueSessionEntitiesByLeagueId(int leagueId);
}
