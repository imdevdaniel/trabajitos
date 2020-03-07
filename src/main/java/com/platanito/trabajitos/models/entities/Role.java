package com.platanito.trabajitos.models.entities;

//Segun Guia
import javax.persistence.Entity;
//Otros
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name="roles")
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length=16)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String title;
	
	@SuppressWarnings("unused")
	private String description;
	
	@SuppressWarnings("unused")
	private Integer erased;
	
	@Column(length=16, name="erased_by")
	private Long erasedBy;
	
}
