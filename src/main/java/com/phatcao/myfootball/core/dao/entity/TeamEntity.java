package com.phatcao.myfootball.core.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "team")
public class TeamEntity extends CommonEntity implements Serializable {

	private static final long serialVersionUID = 8840001756156328683L;

	@Column(name = "code_team")
	private String codeTeam;

	@Column(name = "name_team")
	private String nameTeam;

	@Column(name = "founded")
	private String founded;

	@Column(name = "type")
	private int type;

	@Column(name = "logo")
	private String logo;

	@Column(name = "venue")
	private long venue;
}
