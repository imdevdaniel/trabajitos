package com.platanito.trabajitos.models.entities;

// Segun Guia
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

// Otros
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name="documents")
public class Document implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length=16)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String image;
	
	@NotEmpty
	private String path;
	
	@NotEmpty
	private String type;
	
	@NotEmpty
	private String value;
	
//	@Column(length=16, name="gig_worker_id")
//	private Long gigWorkerId;
	
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
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
