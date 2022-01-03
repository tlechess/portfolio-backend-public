package com.portfolio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.models.Skill;
import com.portfolio.services.SkillService;

//Controller for skills
@RestController
public class SkillController {

	//Data Fields 
	@Autowired
	private SkillService skillService;
	
	//Get request for all skills
	@CrossOrigin
	@GetMapping("/skill")
	ResponseEntity<List<Skill>> getAllSkills() {
		return skillService.getSkills();
	}
}
