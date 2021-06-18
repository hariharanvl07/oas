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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineAdminisionSystem.entity.College;
import com.project.onlineAdminisionSystem.service.ICollegeService;
import com.project.onlineAdminisionSystem.service.IProgramService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/college")

public class CollegeController {

	Logger logger = LoggerFactory.getLogger(CollegeController.class);
	
	@Autowired
	private ICollegeService service;
	
	
	
	@Autowired
	private IProgramService progService;


	@PostMapping("/addCollege")
	public College addCollege(@RequestBody College college) {
			
		
logger.info("addCollege controller started");
logger.info("addCollege controller ended");

		
		return service.addCollege(college);
	}
	
	
	@PutMapping("/updateCollege/{id}")
	public College updateCollege(@PathVariable("id")Integer id,@RequestBody College college) {
		logger.info("updateCollege controller started");
		College clg= service.getCollegeDetailsById(id).orElseThrow();
	clg.setCollegeName(college.getCollegeName());
	clg.setCollegeAddress(college.getCollegeAddress());

	clg.setProgramList(college.getProgramList());
	
	logger.info("updateCollege controller ended");

		
		
		return service.addCollege(clg);
	}
	
	@DeleteMapping("/deleteCollege/{id}")
	public void deleteCollegeById(@PathVariable("id") int id) {
		logger.info("deleteCollege controller started");
		service.deleteCollegeById(id);
		logger.info("deleteCollege controller ended");
	}
	
	
	@DeleteMapping("/deleteCollegeByName/{collegeName}")
	public void deleteCollegeByName(@PathVariable("collegeName") String name) {
		logger.info("deleteCollegeByName controller started");
		service.deleteCollegeByName(name);
		logger.info("deleteCollegeByName controller ended");
	}
	
@GetMapping("/getAllColleges")
public List<College> getAllColleges() {
	logger.info("getAllCollege controller started");
	logger.info("getAllCollege controller ended");
	return service.viewAllCollegeDetails();
	
}


@GetMapping("/getCollegeById/{id}")
public College getCollegeById(@PathVariable("id" )int id) {
	logger.info("getCollegeById controller started");
	logger.info("getCollegeById controller ended");
	return service.getCollegeDetailsById(id).orElseThrow();
}

@GetMapping("/getCollegeByName/{collegeName}")
public Optional<College> getCollegeByName(@PathVariable("collegeName") String name) {
	logger.info("getCollegeByName controller started");
	logger.info("getCollegeByName controller ended");
	return service.getCollegeDetailsByName(name);
}


@GetMapping("/getCollegeByUniversityName/{universityName}")
public List<College> getCollegeByUniversity(@PathVariable("universityName") String pname) {
	logger.info("getCollegeByUniversity controller started");
	

logger.info("getCollegeByUniversity controller ended");
return service.getCollegeByuniversityName(pname);
}


}
