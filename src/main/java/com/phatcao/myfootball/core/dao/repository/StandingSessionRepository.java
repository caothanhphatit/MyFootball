package com.phatcao.myfootball.core.dao.repository;

import com.phatcao.myfootball.core.dao.entity.StandingSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StandingSessionRepository extends JpaRepository<StandingSessionEntity, Integer>
{
	List<StandingSessionEntity> getStandingSessionEntitiesByLeagueSessionId(int leagueSessionId);
}
