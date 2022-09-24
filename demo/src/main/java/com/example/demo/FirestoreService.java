package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FirestoreService {
	
	@Autowired
	private UserRepository firestoreOperations;

	public Mono<User> createUsers() {
	    return firestoreOperations.save(new User("Abid", 29))
	        .then(this.firestoreOperations.save(new User("Khan", 60)));
	}

	public Flux<User> findUsers() {
	    return this.firestoreOperations.findAll();
	}

}
