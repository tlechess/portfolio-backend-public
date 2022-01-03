package com.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.portfolio.models.Skill;
import com.portfolio.repositories.SkillRepository;

//Implementation of the of skill controller
@Service
public class SkillService {

	//Data Fields 
	@Autowired
	private SkillRepository skillRepository;
	
	//Methods
	//Gets all of skills from db
	public ResponseEntity<List<Skill>> getSkills(){
		List<Skill> allSkills = skillRepository.findAll();
		
		return ResponseEntity.ok(allSkills);
	}
}
