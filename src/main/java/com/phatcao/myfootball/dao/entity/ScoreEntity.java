package com.phatcao.myfootball.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "score")
public class ScoreEntity
{
	@Id
	@Column(name = "score_id")
	private long scoreId;

	@Column(name = "match")
	private int match;

	@Column(name = "time")
	private int time;

	@Column(name = "player")
	private int player;

}
