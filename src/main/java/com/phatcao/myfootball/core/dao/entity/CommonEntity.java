package com.phatcao.myfootball.core.dao.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;


@Setter
@Getter
@MappedSuperclass
public abstract class CommonEntity
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "create_date", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createDate;

	@Column(name = "update_date")
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date updateDate;

	@Column(name = "is_active")
	private int isActive;

	@Column(name = "is_deleted")
	private int isDeleted;
}
