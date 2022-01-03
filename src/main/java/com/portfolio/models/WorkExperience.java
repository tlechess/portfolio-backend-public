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

@Entity
@Table(name = "work_experiences")
public class WorkExperience {

	//Data Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "job_title")
	private String jobTitle;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "time_period")
	private String timePeriod;
	
	@OneToMany()
	@JoinColumn(name = "work_experiences_id")
	private List<JobDiscription> jobDiscription;

	public WorkExperience() {}

	public WorkExperience(String jobTitle, String location, String timePeriod, List<JobDiscription> jobDiscription) {
		this.jobTitle = jobTitle;
		this.location = location;
		this.timePeriod = timePeriod;
		this.jobDiscription = jobDiscription;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}

	public List<JobDiscription> getJobDiscription() {
		return jobDiscription;
	}

	public void setJobDiscription(List<JobDiscription> jobDiscription) {
		this.jobDiscription = jobDiscription;
	}

	public int getId() {
		return id;
	}
}
