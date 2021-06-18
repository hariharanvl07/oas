package com.project.onlineAdminisionSystem.controller;



import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineAdminisionSystem.entity.Document;
import com.project.onlineAdminisionSystem.service.IDocumentService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/Document")

public class DocumentController {
	
	Logger logger = LoggerFactory.getLogger(DocumentController.class);
	
	@Autowired
	private IDocumentService service;


	@PostMapping("/addDocument")
	public Document addDocument(@RequestBody Document Document) {
		
logger.info("addDocument controller started");
logger.info("addDocument controller ended");
		

		return service.addDocument(Document);
	}
	
	
	@PostMapping("/updateDocument/{id}")
	public Document updateDocument(@PathVariable("id")int id,@RequestBody Document Document) {
		logger.info("updateDocument controller started");
		Document doc = service.getDocumentById(id).orElseThrow();
	doc.setDocumentStatus(Document.getDocumentStatus());
	
	logger.info("updateDocument controller ended");
	
	
		
		
		return service.updateDocument(doc);
	}
	
	@DeleteMapping("/deleteDocument/{id}")
	public void deleteDocumentById(@PathVariable("id") int id) {
		logger.info("deleteDocument controller started");
		service.deleteDocumentById(id);
		logger.info("deleteDocument controller ended");
	}
	
@GetMapping("/getAllDocuments")
public List<Document> getAllDocuments() {
	logger.info("getAllDocument controller started");
	logger.info("getAllDocument controller ended");

	return service.getAllDocument();
}
@GetMapping("/getDocumentDetailsById/{id}")
public Optional<Document> getDocumentDetailsById(@PathVariable("id") int id) {
	logger.info("getDocumentById controller started");
	logger.info("getDocumentDetailsById controller ended");

	return service.getDocumentById(id);
}


}