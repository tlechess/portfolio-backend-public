package com.portfolio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_discription")
public class JobDiscription {
	//Data Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "discription")
	private String discription;
	
	//Constructors
	public JobDiscription() {}

	public JobDiscription(String discription) {
		this.discription = discription;
	}

	//Getters and Setters
	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public int getId() {
		return id;
	}
		
}
