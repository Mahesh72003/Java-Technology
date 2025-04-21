package com.xworkz.methodoverride41;

public class Accountant extends Staff {
    @Override
    public void work() {
        System.out.println("Accountant is managing financial records.");
    }

    @Override
    public void report() {
        System.out.println("Accountant is preparing financial statements.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Accountant is attending a budget meeting.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Accountant is taking a coffee break.");
    }

    @Override
    public void info() {
        System.out.println("This is a finance department accountant.");
    }
}