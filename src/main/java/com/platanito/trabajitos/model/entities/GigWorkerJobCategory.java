package com.platanito.trabajitos.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="gig_worker_job_category")
public class GigWorkerJobCategory {

	@Id
	@Column(length=16)
	private Long id;
	
	@Column(length=16, name="gig_worker_id")
	private Long gigWorkerId;
	@Column(length=16, name="job_category_id")
	private Long jobCategoryId;
	@Column(name="hourly_rate")
	private Float hourlyRate;
	
}
