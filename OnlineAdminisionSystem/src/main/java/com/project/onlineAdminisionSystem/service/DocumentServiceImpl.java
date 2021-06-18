package com.project.onlineAdminisionSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.Document;
import com.project.onlineAdminisionSystem.repository.IDocumentRepository;
@Service
public class DocumentServiceImpl implements IDocumentService{
@Autowired
private IDocumentRepository repo;
	@Override
	public Document addDocument(Document document) {

		return repo.save(document);
	}

	@Override
	public List<Document> getAllDocument() {
		
		return repo.findAll();
	}

	@Override
	public void deleteDocumentById(int documentId) {
		repo.deleteById(documentId);
		
	}

	@Override
	public Document updateDocument(Document document) {
	
		return repo.save(document);
	}

	@Override
	public Optional<Document> getDocumentById(int documentId) {
		
		return repo.findById(documentId);
	}

}
