package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	
	public Trainee() {
	}
	
	public Trainee(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTraineeName() {
		return this.name;
	}

	public void getTraineeName(String name) {
		this.name = name;
	}

}
