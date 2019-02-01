package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Classroom;
import com.qa.util.JSONUtil;

@Default
@Transactional(SUPPORTS)
public class ClassroomDBRepository implements ClassroomRepository{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	JSONUtil util;

	public String getAllClassrooms() {
		Query query = manager.createQuery("SELECT c FROM Classroom c");
		return util.getJSONForObject(query.getResultList());
	}

	public String getClassroom(Long id) {
		return util.getJSONForObject(findClassroom(id));
	}

	@Transactional(REQUIRED)
	public String createClassroom(String classroom) {
		Classroom newClassroom = util.getObjectForJSON(classroom, Classroom.class);
		manager.persist(newClassroom);
		return "{\"message\": \"Classroom with id '" + newClassroom.getId() + "' has been created\"}";
		
	}

	@Transactional(REQUIRED)
	public String deleteClassroom(Long id) {
		manager.remove(findClassroom(id));
		return "{\"message\": \"Classroom with id '" + id + "' has been deleted\"}";
	}

	@Transactional(REQUIRED)
	public String updateClassroom(Long id, String classroom) {
		deleteClassroom(id);
		createClassroom(classroom);
		return "{\"message\": \"Classroom with id '" + id + "' has been updated\"}";
	}
	
	public Classroom findClassroom(Long id) {
		return manager.find(Classroom.class, id);
	}

	public String addTrainee(Long id, Long traineeID) {
		// TODO Auto-generated method stub
		return null;
	}

	public String removeTrainee(Long id, Long traineeID) {
		// TODO Auto-generated method stub
		return null;
	}

}
