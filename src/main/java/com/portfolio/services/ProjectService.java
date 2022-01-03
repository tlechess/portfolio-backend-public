package com.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.portfolio.models.Project;
import com.portfolio.repositories.ProjectRepository;

//Implementation of the education controller
@Service
public class ProjectService {

	//Data Fields 
	@Autowired
	private ProjectRepository projectRepository;
	
	//Methods
	//Gets all projects from data base. 
	public ResponseEntity<List<Project>> getProjects() {
		List<Project> allProject = projectRepository.findAll();
		
		return ResponseEntity.ok(allProject);
	}
}
