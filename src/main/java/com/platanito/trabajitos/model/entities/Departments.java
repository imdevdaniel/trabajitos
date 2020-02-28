package com.platanito.trabajitos.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="departments")
public class Departments {

	@Id
	@Column(length=16)
	private Long id;
	
	private String name;
	private Integer erased;
	
	
}
