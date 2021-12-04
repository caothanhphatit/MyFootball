package com.phatcao.myfootball.core.dao.repository;

import com.phatcao.myfootball.core.dao.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeamRepository extends JpaRepository<TeamEntity, String>
{

}
