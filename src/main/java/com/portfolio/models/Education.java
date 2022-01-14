package com.portfolio.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Model for education
@Entity
@Table(name="education")
public class Education {

	//Data fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "date_attended")
	private String dateAttended;
	
	@Column(name = "details")
	private String details;
	
	@OneToMany()
	@JoinColumn(name = "education_id")
	private List<EducationDetails> educationDetails;
	
	//Constructor
	public Education() {}
	public Education(String schoolName, String location, String dateAttended, String details, 
			List<EducationDetails> educationDetials) {
		this.schoolName = schoolName;
		this.location = location;
		this.dateAttended = dateAttended;
		this.details = details;
		this.educationDetails = educationDetials;
	}
	
	//Getters and setters
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getDateAttended() {
		return dateAttended;
	}
	
	public void setDateAttended(String dateAttended) {
		this.dateAttended = dateAttended;
	}
	
	public String getDetails() {
		return details;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}
	
	public int getId() {
		return id;
	}
	
	public List<EducationDetails> getEducationDetails() {
		return educationDetails;
	}
	
	public void setEducationDetails(List<EducationDetails> educationDetails) {
		this.educationDetails = educationDetails;
	}
}

