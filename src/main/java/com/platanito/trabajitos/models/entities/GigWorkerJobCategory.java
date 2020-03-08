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
import javax.validation.constraints.NotEmpty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GigWorker getGigWorker() {
		return gigWorker;
	}

	public void setGigWorker(GigWorker gigWorker) {
		this.gigWorker = gigWorker;
	}

	public JobCategory getJobCategory() {
		return jobCategory;
	}

	public void setJobCategory(JobCategory jobCategory) {
		this.jobCategory = jobCategory;
	}

	public Float getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(Float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
}
