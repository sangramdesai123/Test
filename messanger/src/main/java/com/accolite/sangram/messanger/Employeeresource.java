package com.accolite.sangram.messanger;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("emp")
public class Employeeresource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployee() {
		Employee e1=new Employee();
		e1.setName("sangram");
		e1.setSalary(20);
		
		return e1;
	}
}
