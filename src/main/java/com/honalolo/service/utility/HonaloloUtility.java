package com.honalolo.service.utility;

import java.util.HashMap;
import java.util.Map.Entry;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;



/**
 * 
 * @author dhruba619
 *
 */
public class HonaloloUtility {
	
	public static final Logger logger = Logger.getLogger(HonaloloUtility.class);
	private ResponseBuilder responseBuilder;
	
	/**
	 * 
	 * @param object
	 * @return
	 * Builds the response for http requests.
	 */
	public Response buildServiceResponse(Object object){
		logger.debug("Building the Webservice response");
		this.responseBuilder = Response.ok();
		this.responseBuilder.entity(object);

		return this.responseBuilder.build();		
	}
	
	
	/**
	 * 
	 * Method to call external web services.
	 * @param serverPath
	 * @param serviceName
	 * @param params
	 * @return
	 */
	public String callWebServices(String serverPath, String serviceName, HashMap<String, String> params){
		
		
		logger.info("Calling Service --> "+serverPath+serviceName);
		WebClient webClient =null;
		webClient = WebClient.create(serverPath);
		if(null !=params){
			for(Entry<?,?> entry : params.entrySet()){
				webClient.query(entry.getKey().toString(), entry.getValue().toString());
			}
		}
		webClient.path(serviceName);
		Response response = webClient.get();
		
		return response.getEntity().toString();
	}
	


}
