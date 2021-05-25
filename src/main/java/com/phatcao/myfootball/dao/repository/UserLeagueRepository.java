package com.phatcao.myfootball.dao.repository;

import com.phatcao.myfootball.dao.entity.UserLeagueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserLeagueRepository extends JpaRepository<UserLeagueEntity, Long>
{
	@Query("select u from UserLeagueEntity u where u.userName= ?1")
	List<UserLeagueEntity> findAllByUserName(String userName);
}
