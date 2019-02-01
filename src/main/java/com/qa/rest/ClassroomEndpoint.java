package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.ClassroomService;

public class ClassroomEndpoint {

	@Path("/classroom")
	public class AccountEndpoint {
		
		@Inject
		private ClassroomService service;

		@Path("/getAll")
		@GET
		@Produces({ "application/json" })
		public String getAllAccounts() {
			return service.getAllClassrooms();
		}
		
		@Path("/{id}")
		@GET
		@Produces({ "application/json" })
		public String getClassroom(@PathParam("id") Long id) {
			return service.getClassroom(id);
		}

		@Path("/create")
		@POST
		@Produces({ "application/json" })
		public String addAccount(String classroom) {
			return service.createClassroom(classroom);
		}

		@Path("/{id}")
		@DELETE
		@Produces({ "application/json" })
		public String deleteAccount(@PathParam("id") Long id) {
			return service.deleteClassroom(id);
		}
		
		@Path("/{id}")
		@PUT
		@Produces({ "application/json" })
		public String updateAccount(@PathParam("id") Long id, String classroom) {
			return service.updateClassroom(id, classroom);
		}
	}

}
