package com.qa.business.service;

public interface ClassroomService {
	
	String getAllClassrooms();
	
	String getClassroom(Long id);
	
	String createClassroom(String classroom);
	
	String deleteClassroom(Long id);
	
	String updateClassroom(Long id, String classroom);
	
	String addTrainee(Long id, Long traineeID);
	
	String removeTrainee(Long id, Long traineeID);
	

}
