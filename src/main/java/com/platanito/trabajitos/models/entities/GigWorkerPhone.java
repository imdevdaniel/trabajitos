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
@Table(name="gig_worker_phones")
public class GigWorkerPhone implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length=16)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String type;
	
	@NotEmpty
	private String value;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gig_worker_id", nullable=false)
	private GigWorker gigWorker;
	
	@SuppressWarnings("unused")
	private Integer erased;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public GigWorker getGigWorker() {
		return gigWorker;
	}

	public void setGigWorker(GigWorker gigWorker) {
		this.gigWorker = gigWorker;
	}

	public Integer getErased() {
		return erased;
	}

	public void setErased(Integer erased) {
		this.erased = erased;
	}
	
}
