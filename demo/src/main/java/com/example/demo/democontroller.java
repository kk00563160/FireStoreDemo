package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class democontroller {
	
	@Autowired
	FirestoreService firestoreService;
	
	@GetMapping("/addEntity")
	public Mono<User> addEntity() {
		return firestoreService.createUsers();
	}
	
	@GetMapping("/getAllEntities")
	public Flux<User> getAllEntities() {
		return firestoreService.findUsers();
	}
	
	 @GetMapping("/{id}")
	    public List<String> findAllUsers() {
		 List users = new ArrayList<String>();
		 users.add("karthik");
		 users.add("iniyan");
			return users;
	        
	    }
	
}
