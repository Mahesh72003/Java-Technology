package com.xworkz.governmentjobs;

import com.xworkz.governmentjobs.job.GovernmentJob;
import com.xworkz.governmentjobs.board.JobBoard;

public class GovernmentJobsRunner {
    public static void main(String[] args) {
        GovernmentJob[] jobs = new GovernmentJob[5];

        GovernmentJob jobs1 = new GovernmentJob();
        jobs1.setJobId(1);
        jobs1.setTitle("IAS Officer");
        jobs1.setDepartment("Administrative Services");
        jobs1.setQualificationRequired("Graduation");
        jobs1.setSalary(56100.00);
        jobs1.setLocation("Bangalore");
        jobs1.setIsPermanent(true);
        jobs1.setState("Karnataka");
        jobs[0] = jobs1;

        GovernmentJob jobs2 = new GovernmentJob();
        jobs2.setJobId(2);
        jobs2.setTitle("Assistant Professor");
        jobs2.setDepartment("Higher Education");
        jobs2.setQualificationRequired("Post Graduation + NET");
        jobs2.setSalary(57700.00);
        jobs2.setLocation("Mysore");
        jobs2.setIsPermanent(true);
        jobs2.setState("Karnataka");
        jobs[1] = jobs2;

        GovernmentJob jobs3 = new GovernmentJob();
        jobs3.setJobId(3);
        jobs3.setTitle("Bank PO");
        jobs3.setDepartment("Banking");
        jobs3.setQualificationRequired("Graduation");
        jobs3.setSalary(45000.00);
        jobs3.setLocation("Mumbai");
        jobs3.setIsPermanent(true);
        jobs3.setState("Maharashtra");
        jobs[2] = jobs3;

        GovernmentJob jobs4 = new GovernmentJob();
        jobs4.setJobId(4);
        jobs4.setTitle("Police Sub-Inspector");
        jobs4.setDepartment("Home Affairs");
        jobs4.setQualificationRequired("Graduation + Physical Test");
        jobs4.setSalary(37900.00);
        jobs4.setLocation("Chennai");
        jobs4.setIsPermanent(true);
        jobs4.setState("Tamil Nadu");
        jobs[3] = jobs4;

        GovernmentJob jobs5 = new GovernmentJob();
        jobs5.setJobId(5);
        jobs5.setTitle("Junior Engineer");
        jobs5.setDepartment("PWD");
        jobs5.setQualificationRequired("Diploma in Civil Engineering");
        jobs5.setSalary(35400.00);
        jobs5.setLocation("Hyderabad");
        jobs5.setIsPermanent(true);
        jobs5.setState("Telangana");
        jobs[4] = jobs5;

        JobBoard board = new JobBoard();
        board.jobs = jobs;
        board.displayJobs();
    }
}
