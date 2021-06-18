package com.project.onlineAdminisionSystem.validation;

import org.springframework.stereotype.Component;

import com.project.onlineAdminisionSystem.entity.University;
@Component
public class collegeValidation {
	public boolean validateCollege(University university) {
		
	;
		
		if (university.getCollegeList() == null) {
			return false;
		}
	return true;
	}

}
