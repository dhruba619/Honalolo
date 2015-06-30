package com.honalolo.service.impl;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;

import com.honalolo.dao.impls.DaoOperationsImpl;
import com.honalolo.model.userModels.UserDataModel;
import com.honalolo.service.inteface.IHonaloloDoctorService;
import com.honalolo.service.utility.HonaloloUtility;

/**
 * 
 * @author dhrubajyotib
 *
 */
public class HonaloloDoctorServiceImpl implements IHonaloloDoctorService {

	
	private DaoOperationsImpl daoOperations;
	private HonaloloUtility utility;
	
	
	/**
	 * 
	 */
	public Response saveDoctorInformation(HttpServletRequest request,UserDataModel doctorData) {
		return this.utility.buildServiceResponse(this.daoOperations.saveDocument(doctorData, "inventory"));
	}
	
	
	public void setDaoOperations(DaoOperationsImpl daoOperations) {
		this.daoOperations = daoOperations;
	}

	public void setUtility(HonaloloUtility utility) {
		this.utility = utility;
	}

}
