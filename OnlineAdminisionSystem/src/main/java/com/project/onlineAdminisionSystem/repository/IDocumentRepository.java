package com.project.onlineAdminisionSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onlineAdminisionSystem.entity.Document;

public interface IDocumentRepository extends JpaRepository<Document , Integer>
{

	

}
