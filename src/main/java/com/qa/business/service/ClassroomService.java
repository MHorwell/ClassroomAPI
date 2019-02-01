package com.qa.business.service;

public interface ClassroomService {
	
	String getAllClassrooms();
	
	String getClassroom(Long id);
	
	String createClassroom(String classroom);
	
	String deleteClassroom(Long id);
	
	String updateClassroom(Long id, String classroom);
	

}
