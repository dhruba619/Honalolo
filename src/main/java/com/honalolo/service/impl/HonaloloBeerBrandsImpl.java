package com.honalolo.service.impl;

import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.honalolo.service.inteface.IHonaloloBeerBrands;
import com.honalolo.service.utility.HonaloloUtility;

public class HonaloloBeerBrandsImpl implements IHonaloloBeerBrands {
	
	
	private HonaloloUtility utility;
	 public static final Logger logger= Logger.getLogger(HonaloloBeerBrandsImpl.class);
	
	public void setUtility(HonaloloUtility utility) {
		this.utility = utility;
	}


	/*
	 * Default No-Arg Constructor
	 */
	public HonaloloBeerBrandsImpl(){
		
	}
	

	public Response getBeerBrands(String type) {
		logger.debug("Creating response String");
		String responseString = "{\"Heineken\":\"Heineken is one of the best beer brands across the world. It can be regarded as a pale lager variety that has 5% alcohol. It has been in existence since 1873 and is manufactured by a Dutch company named Heineken International. It is made from barley malts, purified water, yeast, and hops. The beer is also pretty famous in US, Middle East, and Australia and is processed in 71 countries around the world.\",\"Budweiser\":\"Budweiser too has 5% alcohol content. It is an American type of lager that is produced by Anheuser-Busch InBev, which is a major Brazilian-Belgian beer organization. The brand was introduced by Adolphus Busch during 1876. It comprises 30% rice along with barley malt, and hops and is one of the top sellers in the US. It is produced globally and available as both packaged and draught. It is rather light and less bitter, which is why it is regarded as refreshment by users.\" }";
		return this.utility.buildServiceResponse(responseString);


	}

}
