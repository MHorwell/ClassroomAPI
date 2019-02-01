package com.qa.persistence.repository;

public interface ClassroomRepository {
	
	String getAllClassrooms();
	
	String getClassroom(Long id);
	
	String createClassroom(String classroom);
	
	String deleteClassroom(Long id);
	
	String updateClassroom(String classroom);
	
	String addTrainee(Long id, Long traineeID);
	
	String removeTrainee(Long id, Long traineeID);
	
}
