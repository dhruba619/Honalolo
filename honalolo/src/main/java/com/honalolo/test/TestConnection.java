package com.honalolo.test;

import org.bson.BsonDocument;
import org.bson.Document;
import org.eclipse.jetty.util.ajax.JSON;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.Gson;
import com.honalolo.dao.Interface.IDbConnection;
import com.honalolo.dao.impls.DbConnection;
import com.honalolo.model.userModels.UserDataModel;
import com.honalolo.model.userModels.UserDataModel.UserType;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class TestConnection {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		IDbConnection connection = appContext.getBean(DbConnection.class);
	
		MongoDatabase db = connection.getDatabaseConnection("testdb");
		MongoIterable<String> iterable = db.listCollectionNames();
		 
		for(String coll : iterable){
			System.out.println(coll);
		}
		MongoCollection<Document> cursor = db.getCollection("inventory");
		FindIterable<Document> cursor2 = cursor.find();
		for(Document doc : cursor2){
			System.out.println(doc);
		}
		
		UserDataModel dataObject = new UserDataModel();
		dataObject.setAbout_user("The User is veryGood");
		dataObject.setFirstName("Dhrubajyoti");
		dataObject.setLastName("Bhattacharjee");
		dataObject.setMiddleName("DJ619");
		dataObject.setUserType(UserType.DOCTOR);
		
		Gson gson = new Gson();
		
		String jsonData = gson.toJson(dataObject);
		System.out.println(jsonData);
		Document doc = Document.parse(jsonData);
		cursor.insertOne(doc);
	
		
		
	}

}
