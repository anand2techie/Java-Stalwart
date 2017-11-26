package com.assignments;

import java.util.HashSet;
import java.util.Set;

public class Job {
	
	Job(int jobId,String jobTitle,String jobLocation,int salary,Set<Candidate> appliedCandidates,int requiredYearsOfExperience)
	{
		this.jobId=jobId;
		this.jobTitle=jobTitle;
		this.jobLocation=jobLocation;
		this.salary=salary;
		this.appliedCandidates=appliedCandidates;
		this.requiredYearsOfExperience=requiredYearsOfExperience;
	}

	private int jobId;
	private String jobDescription;
	private String jobTitle;
	private String jobLocation;
	private int salary;
	private Set<Candidate> appliedCandidates=new HashSet<Candidate>();
	private int requiredYearsOfExperience;
	
	
	public int getRequiredYearsOfExperience() {
		return requiredYearsOfExperience;
	}
	public void setRequiredYearsOfExperience(int requiredYearsOfExperience) {
		this.requiredYearsOfExperience = requiredYearsOfExperience;
	}
	public Set<Candidate> getAppliedCandidates() {
		return appliedCandidates;
	}
	public void setAppliedCandidates(Set<Candidate> appliedCandidates) {
		this.appliedCandidates = appliedCandidates;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	
	
}
