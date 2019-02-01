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
	
    private long classroomId;
	
	public Trainee() {
	}
	
	public Trainee(String name) {
		this.name = name;
	}
	
	public Trainee(String name, long classroomId) {
		this.name = name;
		this.setClassroomId(classroomId);
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

	public long getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(long classroomId) {
		this.classroomId = classroomId;
	}

}
