package com.platanito.trabajitos.models.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="reviews")
public class Review {

	@Id
	@Column(length=16)
	private Long id;
	
	private Integer score;
	private String comment;
	private Date date;
	@Column(length=16, name="agreement_id")
	private Long agreementId;
	
}
