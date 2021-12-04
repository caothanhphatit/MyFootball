package com.phatcao.myfootball.core.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "score")
public class ScoreEntity extends CommonEntity
{

	@Column(name = "on_match")
	private int match;

	@Column(name = "time")
	private int time;

	@Column(name = "player")
	private int player;

}
