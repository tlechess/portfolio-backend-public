package com.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.models.Email;
import com.portfolio.services.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/contact-form")
	public ResponseEntity<Email> sendEmailMessage(@RequestBody Email email) {
		
		return emailService.sendMessage(email);
	}
}
