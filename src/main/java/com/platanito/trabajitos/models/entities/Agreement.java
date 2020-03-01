package com.platanito.trabajitos.models.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="agreements")
public class Agreement {
	
	@Id
	@Column(length=16)
	private Long id;
	
	@Column(length=16, name="customer_id")
	private Long customerId;
	@Column(length=16, name="gig_worker_id")
	private Long gigWorkerId;
	private Date date;
	private String state;

}
