package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.qa.business.service.TraineeService;

@Path("/trainee")
public class TraineeEndpoint {

	@Inject
	private TraineeService service;

	@Path("/getAll")
	@GET
	@Produces({ "application/json" })
	public String getAllAccounts() {
		return service.getAllTrainees();
	}

	@Path("/{id}")
	@GET
	@Produces({ "application/json" })
	public String getClassroom(@PathParam("id") Long id) {
		return service.getTrainee(id);
	}

	@Path("/create")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String trainee) {
		return service.createTrainee(trainee);
	}

	@Path("/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") Long id) {
		return service.deleteTrainee(id);
	}

	@Path("/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateAccount(@PathParam("id") Long id, String trainee) {
		return service.updateTrainee(id, trainee);
	}
}
