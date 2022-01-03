package com.portfolio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.models.Education;
import com.portfolio.services.EducationService;

//Controls the mapping of education API
@RestController
public class EducationController {

	//Data Fields
	@Autowired
	private EducationService educationService;
	
	//Methods
	//Get request to get all education
	@CrossOrigin
	@GetMapping("/education")
	public List<Education> getAllEducation(){
		return educationService.getEducations();
	}
}
