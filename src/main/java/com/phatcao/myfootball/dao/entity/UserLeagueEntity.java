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
@Table(name = "user_league")
public class UserLeagueEntity
{

		@Id
		@Column (name = "user_league_id")
		private long userLeagueId;
		@Column (name = "is_delete")
		private boolean isDelete ;
		@Column(name= "user_name")
		protected String userName;
		@Column(name = "league_id")
		protected int leagueId;




}
