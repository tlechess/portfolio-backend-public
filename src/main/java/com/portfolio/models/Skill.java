package com.portfolio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Model for skills
@Entity
@Table(name = "skills")
public class Skill {

	//Data Fields 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "skill_name")
	private String skillName;
	
	@Column(name = "skill_percentage")
	private String skillPercentage;

	//Constructor
	public Skill() {}

	public Skill(String skillName, String skillPercentage) {
		this.skillName = skillName;
		this.skillPercentage = skillPercentage;
	}

	//Getters and Setters
	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillPercentage() {
		return skillPercentage;
	}

	public void setSkillPercentage(String skillPercentage) {
		this.skillPercentage = skillPercentage;
	}

	public int getId() {
		return id;
	}
}
