package com.platanito.trabajitos.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customers")
public class Customer {

	@Id
	@Column(length=16)
	private Long id;
	
	@Column(length=128, name="first_name")
	private String firstName;
	@Column(length=128, name="last_name")
	private String lastName;
	private String gender;
	@Column(length=16, name="department_id")
	private Long departmentId;
	private String address;
	private String phone;
	private String photo;
	private String email;
	private String password;
	
}
