package com.platanito.trabajitos.models.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="gig_workers")
public class GigWorker {

	@Id
	@Column(length=16)
	private Long id;
	
	@Column(length=128, name="first_name")
	private String firstName;
	@Column(length=128, name="last_name")
	private String lastName;
	private String gender;
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	@Column(length=16, name="department_id")
	private Long departmentId;
	private String address;
	private String states;
	private String email;
	private String password;
	private String photo;
	private Integer erased;
	
}
