package com.portfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.portfolio.models.Email;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender emailSender;
	
	public ResponseEntity<Email> sendMessage(Email email) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom("tylerestes.com@gmail.com");
		message.setTo("tylerestes526@gmail.com");
		message.setSubject(email.getSubject());
		message.setText(bodyBuilder(email).toString());
		
		emailSender.send(message);
		
		return ResponseEntity.ok(email);
	}
	
	public StringBuilder bodyBuilder(Email email) { 
		StringBuilder newBody = new StringBuilder();
		newBody.append("Name: ");
		newBody.append(email.getName());
		newBody.append(" Email: ");
		newBody.append(email.getEmail());
		newBody.append(" ");
		newBody.append(email.getBody());
		
		return newBody;
	}
}
