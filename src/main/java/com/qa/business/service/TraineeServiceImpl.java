package com.qa.business.service;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.qa.persistence.repository.TraineeRepository;

@Transactional(SUPPORTS)
public class TraineeServiceImpl implements TraineeService{
	
	@Inject
	private TraineeRepository repo;
	

	public String getAllTrainees() {
		return repo.getAllTrainees();
	}

	public String getTrainee(Long id) {
		return repo.getTrainee(id);
	}

	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		return repo.createTrainee(trainee);
	}

	@Transactional(REQUIRED)
	public String deleteTrainee(Long id) {
		return repo.deleteTrainee(id);
	}

	@Transactional(REQUIRED)
	public String updateTrainee(Long id, String trainee) {
		return repo.updateTrainee(id, trainee);
	}
	

}
