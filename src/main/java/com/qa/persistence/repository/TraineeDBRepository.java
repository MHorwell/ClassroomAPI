package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Trainee;
import com.qa.util.JSONUtil;


@Default
@Transactional(SUPPORTS)
public class TraineeDBRepository implements TraineeRepository {
	
	private String messageStart = "{\"message\": \"Trainee with id '";

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	JSONUtil util;
	
	public String getAllTrainees() {
		Query query = manager.createQuery("SELECT t FROM Trainee t");
		return util.getJSONForObject(query.getResultList());
	}

	public String getTrainee(Long id) {
		return util.getJSONForObject(findTrainee(id));
	}

	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		Trainee newTrainee = util.getObjectForJSON(trainee, Trainee.class);
		manager.persist(newTrainee);
		return messageStart + newTrainee.getId() + "' has been created\"}";
	}

	@Transactional(REQUIRED)
	public String deleteTrainee(Long id) {
		manager.remove(findTrainee(id));
		return messageStart + id + "' has been deleted\"}";
	}

	@Transactional(REQUIRED)
	public String updateTrainee(Long id, String trainee) {
		deleteTrainee(id);
		createTrainee(trainee);
		return messageStart + id + "' has been updated\"}";
	}
	
	public Trainee findTrainee(Long id) {
		return manager.find(Trainee.class, id);
	}
	

}
