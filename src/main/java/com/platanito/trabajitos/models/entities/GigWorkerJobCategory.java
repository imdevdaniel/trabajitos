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
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="gig_worker_job_category")
public class GigWorkerJobCategory implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length=16)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@Column(length=16, name="gig_worker_id")
//	private Long gigWorkerId;
//	
//	@Column(length=16, name="job_category_id")
//	private Long jobCategoryId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gig_worker_id", nullable=false)
	private GigWorker gigWorker;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_category_id", nullable=false)
	private JobCategory jobCategory;
	
	@NotEmpty
	@Column(name="hourly_rate")
	private Float hourlyRate;
	
}
