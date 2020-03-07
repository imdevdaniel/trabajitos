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
@Table(name="reviews")
public class Review implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length=16)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private Integer score;
	
	private String comment;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agreement_id", nullable=false)
	private Agreement agreement;
	
}
