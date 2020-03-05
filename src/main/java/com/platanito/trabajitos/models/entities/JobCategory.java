package com.platanito.trabajitos.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="job_categories")
public class JobCategory {
	
	@Id
	@Column(length=16)
	private Long id;
	
	private String name;
	private String icon;
	private Integer erased;

}
