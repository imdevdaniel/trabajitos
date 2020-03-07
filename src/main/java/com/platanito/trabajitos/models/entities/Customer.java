package com.platanito.trabajitos.models.entities;

//Segun Guia
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//Otros
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name="customers")
public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(length=16)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=128, name="first_name")
	@NotEmpty
	private String firstName;
	
	@Column(length=128, name="last_name")
	@NotEmpty
	private String lastName;
	
	@NotEmpty
	private String gender;
	
//	@Column(length=16, name="department_id")
//	private Long departmentId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id", nullable=false)
	private Department department;
	
	@SuppressWarnings("unused")
	private String address;
	
	@SuppressWarnings("unused")
	private String phone;
	
	@SuppressWarnings("unused")
	private String photo;
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String password;
	
}
