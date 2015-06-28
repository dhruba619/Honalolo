package com.honalolo.service.inteface;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("weather")
public interface IHonaloloWeatherService {
	@Deprecated
	@GET
	@Path("/getWeather")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public abstract Response getWeatherByCity(@QueryParam("cityName") String cityName );

}
