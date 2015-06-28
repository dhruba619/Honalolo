package com.honalolo.dao.impls;

import java.util.List;

import javax.inject.Inject;

import com.honalolo.dao.Interface.IDaoOperations;

public class DaoOperationsImpl implements IDaoOperations {

	@Inject
	private DbConnection databaseConnection;
	
	@Override
	public void saveDocument(Object object) {
		// TODO Auto-generated method stub

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

}
