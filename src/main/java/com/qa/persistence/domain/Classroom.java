package com.qa.persistence.domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classroom {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String trainer;
	
	@OneToMany
	private Collection<Trainee> trainees;
	
	public Classroom() {
	}
	
	public Classroom(String trainer, Collection<Trainee> trainees) {
		this.trainer = trainer;
		this.setTrainees(trainees);
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

	public Collection<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(Collection<Trainee> trainees) {
		this.trainees = trainees;
	}

}
