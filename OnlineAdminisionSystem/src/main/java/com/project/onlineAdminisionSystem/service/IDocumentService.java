package com.project.onlineAdminisionSystem.service;

import java.util.List;
import java.util.Optional;

import com.project.onlineAdminisionSystem.entity.Document;

public interface IDocumentService
{
	public Document addDocument(Document document);
	public List<Document> getAllDocument();


	public void deleteDocumentById(int documentId);

	public Document  updateDocument(Document document);
	public  Optional<Document> getDocumentById(int documentId);
	

	
	
}
