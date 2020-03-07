package com.platanito.trabajitos.models.entities;

// Segun Guia
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

// otros
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="agreements")
public class Agreement implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length=16)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@Column(length=16, name="customer_id")
//	private Long customerId;
//	
//	@Column(length=16, name="gig_worker_id")
//	private Long gigWorkerId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id", nullable=false)
	private Customer customer;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gig_worker_id", nullable=false)
	private GigWorker gigWorker;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date;
	
	@Column(name="state")
	private String state;

}
