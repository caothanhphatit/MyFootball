package com.phatcao.myfootball.dao.repository;

import com.phatcao.myfootball.dao.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepository extends JpaRepository<CardEntity, String>
{
}
