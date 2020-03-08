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
@Table(name="components")
public class Component implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length=16)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getErased() {
		return erased;
	}

	public void setErased(Integer erased) {
		this.erased = erased;
	}

	@NotEmpty
	private String title;
	
	@NotEmpty
	private String name;
	
	@SuppressWarnings("unused")
	private String description;
	
	@SuppressWarnings("unused")
	private Integer erased;

}
