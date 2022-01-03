package com.portfolio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.models.Project;
import com.portfolio.services.ProjectService;

//Controls the mapping of project API
@RestController
public class ProjectController {

	//Data Fields
	@Autowired
	private ProjectService projectService;
	
	//Methods
	//Get request mapping to get all projects.
	@CrossOrigin
	@GetMapping("/project")
	public ResponseEntity<List<Project>> getAllProject(){
		ResponseEntity<List<Project>> allProject = projectService.getProjects();
		return projectService.getProjects();
	}
}
