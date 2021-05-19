package com.phatcao.myfootball.dao.repository;

import com.phatcao.myfootball.dao.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeamRepository extends JpaRepository<TeamEntity, Integer>
{

}
