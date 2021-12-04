package com.phatcao.myfootball.core.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "card")
public class CardEntity implements Serializable
{
	@Id
	@Column(name = "id_card")
	private String cardId;

	@Column(name = "matchs")
	private int match;

	@Column(name = "player")
	private int player;

	@Column(name = "card_type")
	private int type;

	@Column(name = "time")
	private int time;

}
