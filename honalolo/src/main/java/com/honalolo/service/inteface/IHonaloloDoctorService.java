package com.honalolo.service.inteface;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.honalolo.model.userModels.UserDataModel;

@Path("doctor")
public interface IHonaloloDoctorService {
	
	@POST
	@Path("saveDoctor")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public abstract Response saveDoctorInformation(@Context HttpServletRequest request, UserDataModel doctorData);
}
