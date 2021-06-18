package com.project.onlineAdminisionSystem.service;

import java.util.List;
import java.util.Optional;

import com.project.onlineAdminisionSystem.entity.College;





public interface ICollegeService
{
	public College addCollege(College college);
	public List<College> viewAllCollegeDetails();

	
	public void deleteCollegeById(int collegeId);
	public void deleteCollegeByName(String collegeName);

	public College  updateCollegeDetails(College college);
	public  Optional<College> getCollegeDetailsById(int collegeId);
	public  Optional<College> getCollegeDetailsByName(String collegeName);
	public List<College> getCollegeByProgramName(List<Integer> id);
	public List<College> getCollegeByuniversityName(String universityName);
	
	
	
}
