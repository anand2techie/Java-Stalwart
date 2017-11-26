package com.assignments;

public class Candidate {
	
	public Candidate(int candidateId,String candidateName,int yearsOfExperience) {
		// TODO Auto-generated constructor stub
		this.candidateId=candidateId;
		this.candidateName=candidateName;
		this.yearsOfExperience=yearsOfExperience;
	}

	private int candidateId;
	private String candidateName;
	private int yearsOfExperience;

	
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this.candidateId == ((Candidate) obj).getCandidateId()) {
			return true;
		} else {
			return false;
		}
	}
}
