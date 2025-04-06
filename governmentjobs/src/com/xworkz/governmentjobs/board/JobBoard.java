package com.xworkz.governmentjobs.board;

import com.xworkz.governmentjobs.job.GovernmentJob;

public class JobBoard {
    public GovernmentJob[] jobs;

    public void displayJobs() {
        for (GovernmentJob job : jobs) {
            System.out.println("--------------------------------------------------");
            System.out.println("Job ID: " + job.getJobId());
            System.out.println("Title: " + job.getTitle());
            System.out.println("Department: " + job.getDepartment());
            System.out.println("Qualification Required: " + job.getQualificationRequired());
            System.out.println("Salary: " + job.getSalary() + " per month");
            System.out.println("Location: " + job.getLocation());
            System.out.println("Permanent Job: " + job.getIsPermanent());
            System.out.println("State: " + job.getState());
            System.out.println("--------------------------------------------------");
        }
    }
}
