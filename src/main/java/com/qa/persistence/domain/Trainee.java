package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String traineeName;
	
	public Trainee() {
	}
	
	public Trainee(String traineeName) {
		this.traineeName = traineeName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTraineeName() {
		return this.traineeName;
	}

	public void getTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

}
