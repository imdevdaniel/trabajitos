package com.platanito.trabajitos.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {

	@Id
	@Column(length=16)
	private Long id;
	
	private String name;
	private String email;
	private String password;
	@Column(length=16, name="role_id")
	private Long roleId;
	private Integer erased;
	@Column(length=16, name="erased_by")
	private Long erasedBy;
	
}
