package com.honalolo.service.impl;

import java.util.HashMap;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import com.honalolo.service.inteface.IHonaloloWeatherService;
import com.honalolo.service.utility.HonaloloUtility;

public class HonaloloWeatherServiceImpl implements IHonaloloWeatherService {

	private HonaloloUtility utility;

	public void setUtility(HonaloloUtility utility) {
		this.utility = utility;
	}

	public Response getWeatherByCity(String cityName) {
		String responseString;

		String apiServerPath = "http://api.openweathermap.org/data/2.5/";
		String serviceName = "weather";
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("q", cityName);
		try{
			responseString = this.utility.callWebServices(apiServerPath, serviceName, params);
		}
		catch (Exception e){
			throw new WebApplicationException(202);
		}
		return this.utility.buildServiceResponse(responseString);
	}

}
