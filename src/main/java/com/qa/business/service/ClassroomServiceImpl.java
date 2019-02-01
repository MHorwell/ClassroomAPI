package com.qa.business.service;

import javax.inject.Inject;
import javax.transaction.Transactional;
import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import com.qa.persistence.repository.ClassroomRepository;

@Transactional(SUPPORTS)
public class ClassroomServiceImpl implements ClassroomService {
	
	@Inject
	private ClassroomRepository repo;
	
	public String getAllClassrooms() {
		return repo.getAllClassrooms();
	}

	public String getClassroom(Long id) {
		return repo.getClassroom(id);
	}
	
	@Transactional(REQUIRED)
	public String createClassroom(String classroom) {
		return repo.createClassroom(classroom);
	}

	@Transactional(REQUIRED)
	public String deleteClassroom(Long id) {
		return repo.deleteClassroom(id);
	}

	@Transactional(REQUIRED)
	public String updateClassroom(Long id, String classroom) {
		return repo.updateClassroom(id, classroom);
	}

}
