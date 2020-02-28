package com.platanito.trabajitos.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="job_categories")
public class JobCategories {

	@Id
	@Column(length=16)
	private Long id;
	
	private String name;
	private String icon;
	private Integer erased;
	
}
