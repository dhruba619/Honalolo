package com.honalolo.dao.Interface;

import com.mongodb.client.MongoDatabase;

public interface IDbConnection {

	/**
	 * 
	 * @param databaseName
	 * @return
	 */
	public abstract MongoDatabase getDatabaseConnection(String databaseName);

}