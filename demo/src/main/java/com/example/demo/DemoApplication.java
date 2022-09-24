package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gcp.data.firestore.repository.config.EnableReactiveFirestoreRepositories;

//import com.google.cloud.spring.data.firestore.repository.config.EnableReactiveFirestoreRepositories;

@SpringBootApplication
@EnableReactiveFirestoreRepositories
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hellow Spring Boot");
	}

}
