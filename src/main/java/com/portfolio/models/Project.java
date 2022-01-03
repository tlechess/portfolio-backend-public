package com.portfolio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="projects")
public class Project {

	//Data Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "project_name")
	private String projectName;
	@Column(name = "project_category")
	private String projectCategory;
	@Column(name = "cliant")
	private String cliant;
	
	@OneToOne
	@JoinColumn(name = "project_url_id")
	private ProjectUrls projectUrls;
	
	public ProjectUrls getProjectUrls() {
		return projectUrls;
	}

	public void setProjectUrls(ProjectUrls projectUrls) {
		this.projectUrls = projectUrls;
	}

	//Constructors
	public Project() {}

	public Project(String projectName, String projectCategory, String cliant) {
		this.projectName = projectName;
		this.projectCategory = projectCategory;
		this.cliant = cliant;
	}

	//Getters And Setters
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectCategory() {
		return projectCategory;
	}

	public void setProjectCategory(String projectCategory) {
		this.projectCategory = projectCategory;
	}

	public String getCliant() {
		return cliant;
	}

	public void setCliant(String cliant) {
		this.cliant = cliant;
	}

	public int getId() {
		return id;
	}
	
}
