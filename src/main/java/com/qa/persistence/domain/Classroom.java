package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String trainer;
	
	private List<Trainee> traineeList;
	
	public Classroom() {
	}
	
	public Classroom(String trainer, List<Trainee> traineeList) {
		this.trainer = trainer;
		this.traineeList = traineeList;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

}
