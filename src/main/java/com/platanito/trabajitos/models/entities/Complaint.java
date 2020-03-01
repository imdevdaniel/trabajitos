package com.platanito.trabajitos.models.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="complaints")
public class Complaint {
	
	@Id
	@Column(length=16)
	private Long id;
	
	@Column(length=16, name="agreement_id")
	private Long agreementId;
	private Date date;
	private String comment;
	private Date viewed;

}
