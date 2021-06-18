package com.project.onlineAdminisionSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int documentId;
	private String documentUrl;
	private String email;
	private String documentStatus;
	
	
	public int getDocumentId() {
		return documentId;
	}
	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}
	public String getDocumentUrl() {
		return documentUrl;
	}
	public void setDocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	public String getDocumentStatus() {
		return documentStatus;
	}
	public void setDocumentStatus(String documentStatus) {
		this.documentStatus = documentStatus;
	}
	public Document(String documentUrl, String email, int applicationId) {
		super();
		this.documentUrl = documentUrl;
		this.email = email;
		
	}
	
	
	public Document(String documentUrl, String email, String documentStatus) {
		super();
		this.documentUrl = documentUrl;
		this.email = email;
		this.documentStatus = documentStatus;
	}
	public Document() {
		super();
	}
	
	
	
}
