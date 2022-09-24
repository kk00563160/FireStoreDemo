package com.example.demo;


import org.springframework.cloud.gcp.data.firestore.Document;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.firestore.annotation.PropertyName;


@Document(collectionName = "usersCollection")
public class User {
	/**
	 * Used to test @PropertyName annotation on a field.
	 */
	@PropertyName("drink")
	public String favoriteDrink;

	@DocumentId
	private String name;

	private Integer age;

	public User() {
	}
	
	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}