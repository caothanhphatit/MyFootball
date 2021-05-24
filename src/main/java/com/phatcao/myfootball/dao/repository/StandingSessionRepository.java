package com.phatcao.myfootball.dao.repository;

import com.phatcao.myfootball.dao.entity.StandingSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Repository
public interface StandingSessionRepository extends JpaRepository<StandingSessionEntity,Integer>
{
	List<StandingSessionEntity> getStandingSessionEntitiesByLeagueSessionId(int leagueSessionId);
}
