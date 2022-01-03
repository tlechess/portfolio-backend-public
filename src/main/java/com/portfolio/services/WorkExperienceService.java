package com.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.portfolio.models.WorkExperience;
import com.portfolio.repositories.WorkExperienceRepository;

//Implementation of the of skill controller
@Service
public class WorkExperienceService {

	//Data Fields 
	@Autowired
	private WorkExperienceRepository workExperienceRepository;
	
	//Methods
	//Gets all work Experiences from data base
	public ResponseEntity<List<WorkExperience>> getWorkExperiences() {
		List<WorkExperience> allWorkExperiences = workExperienceRepository.findAll();
		
		return ResponseEntity.ok(allWorkExperiences);
	}
}
