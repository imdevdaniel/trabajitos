package com.platanito.trabajitos.model.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="messages")
public class Messages {

	@Id
	@Column(length=16)
	private Long id;
	
	private String content;
	private Date timestamp;
	@Column(length=16, name="customer_id")
	private Long customerId;
	@Column(length=16, name="gig_worker_id")
	private Long gigWorkerId;
	private String type;
	private String sender;
	private Date viewed;
	
}
