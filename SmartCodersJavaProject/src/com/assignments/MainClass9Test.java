package com.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainClass9Test {

	public static void main(String[] args) {

		List<Job> jobsList = getTestData();

		getCandidatesOfAllJobsWithMatchingExp(jobsList);

		/*String jobTitle = "Engineer";
		String jobLocationWithHighestSalary = getJobLocationOfHighestSalaryForAJobTitle(jobTitle, jobsList);
		System.out.println(jobLocationWithHighestSalary);*/
	}

	private static List<Job> getTestData() {

		Set<Candidate> candidatesAppliedForJob1 = new HashSet<Candidate>();
		Candidate candidate1ForJob1 = new Candidate(1, "Alex", 5);
		Candidate candidate2ForJob1 = new Candidate(2, "Dave", 2);
		candidatesAppliedForJob1.add(candidate1ForJob1);
		candidatesAppliedForJob1.add(candidate2ForJob1);

		Set<Candidate> candidatesAppliedForJob2 = new HashSet<Candidate>();
		Candidate candidate1ForJob2 = new Candidate(1, "Chris", 4);
		Candidate candidate2ForJob2 = new Candidate(2, "Mark", 2);
		candidatesAppliedForJob2.add(candidate1ForJob2);
		candidatesAppliedForJob2.add(candidate2ForJob2);

		Set<Candidate> candidatesAppliedForJob3 = new HashSet<Candidate>();
		Candidate candidate1ForJob3 = new Candidate(1, "Alex", 7);
		Candidate candidate2ForJob3 = new Candidate(2, "Dave", 6);
		candidatesAppliedForJob3.add(candidate1ForJob3);
		candidatesAppliedForJob3.add(candidate2ForJob3);

		Job job1 = new Job(1, "Engineer", "Chennai", 20000, candidatesAppliedForJob1, 5);
		Job job2 = new Job(2, "Doctor", "Bengaluru", 20000, candidatesAppliedForJob2, 4);
		Job job3 = new Job(3, "Engineer", "US", 10000, candidatesAppliedForJob3, 6);

		List<Job> jobsList = new ArrayList<Job>();
		jobsList.add(job1);
		jobsList.add(job2);
		jobsList.add(job3);
		return jobsList;
	}

	private static String getJobLocationOfHighestSalaryForAJobTitle(String jobTitle, List<Job> jobsList) {
		int highestSalary = 0;
		String jobLocationWithHighestSalary = "";

		Iterator<Job> jobsListItr = jobsList.iterator();
		while (jobsListItr.hasNext()) {
			Job job = jobsListItr.next();
			if (job.getJobTitle().equals(jobTitle)) {
				if (job.getSalary() > highestSalary) {
					highestSalary = job.getSalary();
					jobLocationWithHighestSalary = job.getJobLocation();
				}
			}
		}
		return jobLocationWithHighestSalary;
	}

	// 10. print only the candidates from the list of appliedCandidates whose
	// experience is greater than requiredYearsOfExperience
	private static void getCandidatesOfAllJobsWithMatchingExp(List<Job> jobsList) {
		Iterator<Job> jobsItr=jobsList.iterator();
		
		while(jobsItr.hasNext())
		{
			Job job=jobsItr.next();
			int count=0;
			int requiredYearsOfExp=job.getRequiredYearsOfExperience();
			System.out.println("Candidates who are eligible to attend the interview for the Job - " +job.getJobTitle()+ " are:");
			Iterator<Candidate> candidatesItr=job.getAppliedCandidates().iterator();
			while(candidatesItr.hasNext())
			{
				Candidate candidate=candidatesItr.next();
				if(candidate.getYearsOfExperience()>=requiredYearsOfExp)
				{
					System.out.println(candidate.getCandidateName());
					count++;
				}
			}
			
			if(count==0)
			{
				System.out.println("--Nil--");
			}
		}
	}

}