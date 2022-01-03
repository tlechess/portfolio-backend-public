package com.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.models.Education;
import com.portfolio.repositories.EducationRepository;

//Implementation of the education controller
@Service
public class EducationService {
	//Data Fields
	@Autowired
	private EducationRepository educationRepository;
	
	//Methods
	//Gets all the educations from database
	public List<Education> getEducations() {
		List<Education> allEducations = educationRepository.findAll();
		return allEducations;
	}
}
