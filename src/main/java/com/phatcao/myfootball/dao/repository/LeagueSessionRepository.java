package com.phatcao.myfootball.dao.repository;

import com.phatcao.myfootball.dao.entity.LeagueSessionEntity;
import com.phatcao.myfootball.dto.league_session.LeagueSessionData;
import com.phatcao.myfootball.service.impl.LeagueSessionServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.web.authentication.preauth.j2ee.J2eePreAuthenticatedProcessingFilter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeagueSessionRepository extends JpaRepository<LeagueSessionEntity, Integer>
{
//	@Query("select m from LeagueSessionEntity m where m.leagueId = ?1")
//	List<LeagueSessionEntity> findByLeagueId(Integer leagueId);

	List<LeagueSessionEntity> findLeagueSessionEntitiesByLeagueId(int leagueId);
}
