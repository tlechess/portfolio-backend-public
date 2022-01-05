package com.portfolio.models;

public class Email {

	//Data Fields 
	private String name;
	private String email;
	private String subject;
	private String body;
	
	//Constructor
	public Email() {}

	public Email(String name, String email, String subject, String body) {
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.body = body;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
}
