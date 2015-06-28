package com.honalolo.dao.Interface;

import java.util.List;

public interface IDaoOperations {
	
	public abstract boolean saveDocument(Object object,String collectionName);
	
	public abstract void saveBulkDocuments(List<Object> object);
	
	public abstract String findDocuments(String query);
	
	public abstract void updateDocument(Object object);
	
	public abstract void updateBulkDocuments(List<Object> object);

}
