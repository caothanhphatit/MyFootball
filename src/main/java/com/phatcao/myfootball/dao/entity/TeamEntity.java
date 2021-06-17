package com.phatcao.myfootball.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "team")
public class TeamEntity implements Serializable
{
	@Id
	@Column(name = "code_team", unique = true, nullable = false, insertable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codeTeam;

	@Column(name="name_team")
	private String nameTeam;

	@Column(name = "type")
	private int type;
}
