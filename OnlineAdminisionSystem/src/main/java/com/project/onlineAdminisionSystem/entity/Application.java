package com.project.onlineAdminisionSystem.entity;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//import com.project.onlineAdminisionSystem.entity.ProgramScheduled;

@Entity
public class Application
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer applicationId;
	
//	@NotNull(message = "Applicant Name cannot be null")
	private String applicantFullName;
	
	//@NotNull(message = "DateofBirth cannot be null")
	private String dateOfBirth;
	
	//@NotNull(message = "HighestQualification cannot be null")
	private String highestQualification;
	//@NotNull(message = "Final percentage cannot be null")
	private double finalYearPercentage;
	private String goals;
	
	//@NotNull(message = "Email Id cannot be null")
	private String emailId;
	//private ProgramScheduled schedule;
	private String applicationStatus;//Applied/ScheduleForInterview/InterViewCompleted/ApplicationAccepted/ApplicationRejected
	private LocalDate dateOfInterview;
	private String applicantInterviewFeedback;
	
	
	@OneToOne
	private College college;
	@OneToOne
	private University university;
	@OneToOne
	private Branch branch;
	@OneToOne
	private Course course;
	@OneToOne
	private Program program;
	
	@OneToOne(cascade = { CascadeType.ALL })
	private Payment payment;
	
	

	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	public Integer getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}
	public String getApplicantFullName() {
		return applicantFullName;
	}
	public void setApplicantFullName(String applicantFullName) {
		this.applicantFullName = applicantFullName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public double getFinalYearPercentage() {
		return finalYearPercentage;
	}
	public void setFinalYearPercentage(double finalYearPercentage) {
		this.finalYearPercentage = finalYearPercentage;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	//public ProgramScheduled getSchedule() {
		//return schedule;}
	//public void setSchedule(ProgramScheduled schedule) {
		//this.schedule = schedule;}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public LocalDate getDateOfInterview() {
		return dateOfInterview;
	}
	public void setDateOfInterview(LocalDate dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}
	public String getApplicantInterviewFeedback() {
		return applicantInterviewFeedback;
	}
	public void setApplicantInterviewFeedback(String applicantInterviewFeedback) {
		this.applicantInterviewFeedback = applicantInterviewFeedback;
	}
	
//   public Application(Integer applicationId, String applicantFullName, LocalDate dateOfBirth, String highestQualification, double finalYearPercentage, String goals, String emailId, ProgramScheduled schedule, String applicationStatus, LocalDate dateOfInterview, String applicantInterviewFeedback)
//	{
//		super();
//		this.applicationId = applicationId;
//		this.applicantFullName = applicantFullName;
//		this.dateOfBirth = dateOfBirth;
//		this.highestQualification = highestQualification;
//		this.finalYearPercentage = finalYearPercentage;
//		this.goals =goals;
//		this.emailId= emailId;
//		this.schedule= schedule;
//		this.applicationStatus= applicationStatus;
//		this.dateOfInterview= dateOfInterview;
//		this.applicantInterviewFeedback= applicantInterviewFeedback;
//	}
	
	
	
	public Application() {
		super();
	}
public Application(@NotNull(message = "Applicant Name cannot be null") String applicantFullName,
		@NotNull(message = "DateofBirth cannot be null") String dateOfBirth,
		@NotNull(message = "HighestQualification cannot be null") String highestQualification,
		@NotNull(message = "Final percentage cannot be null") double finalYearPercentage, String goals,
		@NotNull(message = "Email Id cannot be null") String emailId, String applicationStatus,
		LocalDate dateOfInterview, String applicantInterviewFeedback, College college, University university,
		Branch branch, Course course, Program program, Payment payment) {
	super();
	this.applicantFullName = applicantFullName;
	this.dateOfBirth = dateOfBirth;
	this.highestQualification = highestQualification;
	this.finalYearPercentage = finalYearPercentage;
	this.goals = goals;
	this.emailId = emailId;
	this.applicationStatus = applicationStatus;
	this.dateOfInterview = dateOfInterview;
	this.applicantInterviewFeedback = applicantInterviewFeedback;
	this.college = college;
	this.university = university;
	this.branch = branch;
	this.course = course;
	this.program = program;
	this.payment = payment;
}
public Application(Integer applicationId, String applicantFullName, String dateOfBirth, String highestQualification,
		double finalYearPercentage, String goals, String emailId, String applicationStatus, LocalDate dateOfInterview,
		String applicantInterviewFeedback, College college, University university, Branch branch, Course course,
		Program program) {
	super();
	this.applicationId = applicationId;
	this.applicantFullName = applicantFullName;
	this.dateOfBirth = dateOfBirth;
	this.highestQualification = highestQualification;
	this.finalYearPercentage = finalYearPercentage;
	this.goals = goals;
	this.emailId = emailId;
	this.applicationStatus = applicationStatus;
	this.dateOfInterview = dateOfInterview;
	this.applicantInterviewFeedback = applicantInterviewFeedback;
	this.college = college;
	this.university = university;
	this.branch = branch;
	this.course = course;
	this.program = program;
}
	
	
}
