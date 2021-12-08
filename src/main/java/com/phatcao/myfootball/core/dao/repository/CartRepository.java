package com.phatcao.myfootball.core.dao.repository;

import com.phatcao.myfootball.core.dao.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepository extends JpaRepository<CardEntity, String>
{
}
