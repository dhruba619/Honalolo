package com.honalolo.dao.impls;

import com.honalolo.dao.Interface.IDbConnection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;


/**
 * 
 * @author dhrubajyotib
 *
 */
public class DbConnection implements IDbConnection {
	private String dbHost;

	private String dbPort;
	
	/* (non-Javadoc)
	 * @see com.honalolo.dao.impls.IDbConnection#getDatabaseConnection(java.lang.String)
	 */
	@Override
	public MongoDatabase getDatabaseConnection(String databaseName){
		MongoClient mongoClient = new MongoClient(this.dbHost,27017);
		MongoDatabase database =  mongoClient.getDatabase(databaseName);
		return database;
		
	}
	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}
	public void setDbPort(String dbPort) {
		this.dbPort = dbPort;
	}


}
