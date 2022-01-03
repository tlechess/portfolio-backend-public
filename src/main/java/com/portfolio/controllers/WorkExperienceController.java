package com.portfolio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.models.WorkExperience;
import com.portfolio.services.WorkExperienceService;

//Controls the mapping of work experience API
@RestController
public class WorkExperienceController {

	@Autowired
	private WorkExperienceService workExperienceService;
	
	@CrossOrigin
	@GetMapping("/workeperience")
	ResponseEntity<List<WorkExperience>> getAllWorkExperience() {
		return workExperienceService.getWorkExperiences();
	}
}
