package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int id;
	private String name;
	
	public String toString() {
		return " The ID is " + " : "+  id + " The Name is " + " : " + " "+ name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
