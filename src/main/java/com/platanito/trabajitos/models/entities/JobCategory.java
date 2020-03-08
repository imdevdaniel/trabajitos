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
@Table(name="job_categories")
public class JobCategory implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length=16)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String icon;
	
	@Column(name="erased")
	private Integer erased;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getErased() {
		return erased;
	}

	public void setErased(Integer erased) {
		this.erased = erased;
	}

}
