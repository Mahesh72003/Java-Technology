package com.xworkz.methodoverride41;

public class Runner {
    public static void main(String[] args) {
        System.out.println("--- Staff Object ---");
        Staff staff = new Staff();
        staff.work();
        staff.report();
        staff.attendMeeting();
        staff.takeBreak();
        staff.info();

        System.out.println("--- Staff Reference, Accountant Object ---");
        Staff accountantRef = new Accountant();
        accountantRef.work();
        accountantRef.report();
        accountantRef.attendMeeting();
        accountantRef.takeBreak();
        accountantRef.info();

        System.out.println("--- Accountant Object ---");
        Accountant accountant = new Accountant();
        accountant.work();
        accountant.report();
        accountant.attendMeeting();
        accountant.takeBreak();
        accountant.info();
    }
}