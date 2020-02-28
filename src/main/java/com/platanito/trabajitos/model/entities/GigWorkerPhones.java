package com.platanito.trabajitos.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="gig_worker_phones")
public class GigWorkerPhones {
	
	@Id
	@Column(length=16)
	private Long id;
	
	private String type;
	private String value;
	private Long gigWorkerId;
	private Integer erased;

}
