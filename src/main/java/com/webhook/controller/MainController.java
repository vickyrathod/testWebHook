package com.webhook.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {

	@PostMapping("/add")
	public ResponseEntity<String> putData(@RequestBody String st){
		System.out.println(st);
		
		return ResponseEntity.ok().body(st);
	}
	
}
