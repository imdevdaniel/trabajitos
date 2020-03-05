package com.platanito.trabajitos.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="roles")
public class Role {

	@Id
	@Column(length=16)
	private Long id;
	
	private String title;
	private String description;
	private Integer erased;
	@Column(length=16, name="erased_by")
	private Long erasedBy;
	
}
