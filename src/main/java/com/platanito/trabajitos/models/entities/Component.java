package com.platanito.trabajitos.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="components")
public class Component {
	
	@Id
	@Column(length=16)
	private Long id;
	
	private String title;
	private String name;
	private String description;
	private Integer erased;

}
