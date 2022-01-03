package com.portfolio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Model for project urls
@Entity
@Table(name="project_urls")
public class ProjectUrls {
	//Data Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "imgurl")
	private String imgUrl;
	@Column(name = "domain_url")
	private String domainUrl;
	@Column(name = "frontend_url")
	private String frontendUrl;
	
	//Constructor
	public ProjectUrls() {
		super();
	}

	public ProjectUrls(String imgUrl, String domainUrl, String frontendUrl) {
		this.imgUrl = imgUrl;
		this.domainUrl = domainUrl;
		this.frontendUrl = frontendUrl;
	}

	//Getters And Setters
	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDomainUrl() {
		return domainUrl;
	}

	public void setDomainUrl(String domainUrl) {
		this.domainUrl = domainUrl;
	}

	public String getFrontendUrl() {
		return frontendUrl;
	}

	public void setFrontendUrl(String frontendUrl) {
		this.frontendUrl = frontendUrl;
	}

	public int getId() {
		return id;
	}
}
