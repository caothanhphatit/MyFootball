package com.phatcao.myfootball.core.dao.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@Table(name = "venue")
@Entity
public class VenueEntity extends CommonEntity implements Serializable {

	private static final long serialVersionUID = -3204110569507510801L;

	private String address;

	private int capacity;

	private String city;

	private String image;

	private String name;

	private String photo;

	private String surface;

}
