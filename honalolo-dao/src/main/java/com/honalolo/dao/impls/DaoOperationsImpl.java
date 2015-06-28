package com.honalolo.dao.impls;

import java.util.List;

import javax.inject.Inject;

import org.bson.Document;

import com.google.gson.Gson;
import com.honalolo.dao.Interface.IDaoOperations;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DaoOperationsImpl implements IDaoOperations {

	private DbConnection databaseConnection;
	private Gson gson;
	
	@Override
	public boolean saveDocument(Object object, String collectionName) {
		//The database name is to read from a database.properties
		
		try{
		MongoDatabase database = this.databaseConnection.getDatabaseConnection("testdb");
		MongoCollection<Document> collection = database.getCollection(collectionName);
		String jsonData = gson.toJson(object);
		Document document = Document.parse(jsonData);
		collection.insertOne(document);	
		return true;
		}catch (Exception e){
			return false;
		}
	}

	@Override
	public void saveBulkDocuments(List<Object> object) {
		// TODO Auto-generated method stub

	}

	@Override
	public String findDocuments(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDocument(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBulkDocuments(List<Object> object) {
		// TODO Auto-generated method stub

	}
	
	
	public void setDatabaseConnection(DbConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	public void setGson(Gson gson) {
		this.gson = gson;
	}

}
