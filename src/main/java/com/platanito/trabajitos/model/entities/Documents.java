package com.platanito.trabajitos.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="documents")
public class Documents {

	@Id
	@Column(length=16)
	private Long id;
	
	private String image;
	private String path;
	private String type;
	private String value;
	@Column(length=16, name="gig_worker_id")
	private Long gigWorkerId;
	private Integer erased;
	
}
