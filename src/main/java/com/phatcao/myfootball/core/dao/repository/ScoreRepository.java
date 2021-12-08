package com.phatcao.myfootball.core.dao.repository;

import com.phatcao.myfootball.core.dao.entity.ScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ScoreRepository extends JpaRepository<ScoreEntity , Long >
{

}
