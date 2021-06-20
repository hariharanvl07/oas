package com.project.onlineAdminisionSystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;



@Entity
public class Course 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int courseId;
	@NotNull(message="course name cannot be null")
	private String courseName;
	@NotNull(message="description cannot be null")
	private String description;
	@NotNull(message="eligibility cannot be null")
	private String eligibility;
	//private College college;
@OneToMany(cascade = { CascadeType.ALL })
@JoinColumn(name="CourseId")
	private List< Branch> branches;

private String startDate;
private String endDate;
private long courseFees;




	
	public long getCourseFees() {
	return courseFees;
}
public void setCourseFees(long courseFees) {
	this.courseFees = courseFees;
}
	public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	
	public Course(@NotNull(message = "course name cannot be null") String courseName,
			@NotNull(message = "description cannot be null") String description,
			@NotNull(message = "eligibility cannot be null") String eligibility, List<Branch> branches,
			String startDate, String endDate, long courseFees) {
		super();
		this.courseName = courseName;
		this.description = description;
		this.eligibility = eligibility;
		this.branches = branches;
		this.startDate = startDate;
		this.endDate = endDate;
		this.courseFees = courseFees;
	}
	public Course() {
		super();
	}
	public Course(@NotNull(message = "course name cannot be null") String courseName,
			@NotNull(message = "description cannot be null") String description,
			@NotNull(message = "eligibility cannot be null") String eligibility, List<@Valid Branch> branches,
			String startDate, String endDate) {
		super();
		this.courseName = courseName;
		this.description = description;
		this.eligibility = eligibility;
		this.branches = branches;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	
}
