package com.platanito.trabajitos.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="permissions")
public class Permission {

	@Id
	@Column(length=16)
	private Long id;
	
	private String type;
	@Column(length=16, name="role_id")
	private Long roleId;
	@Column(length=16, name="component_id")
	private Long componentId;
	
}
