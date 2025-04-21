package com.xworkz.methodoverride3;

public class Manager extends Employee {

    @Override
    public void work() {
        System.out.println("Manager is overseeing the team and working on strategic goals.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Manager is taking a short break after reviewing reports.");
    }

    @Override
    public void reportToManager() {
        System.out.println("Manager doesn't report to anyone, but oversees the employees.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager is leading the meeting and making decisions.");
    }
}