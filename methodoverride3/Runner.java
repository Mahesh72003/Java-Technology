package com.xworkz.methodoverride3;

import com.xworkz.methodoverride3.Employee;
import com.xworkz.methodoverride3.Manager;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Employee Object ----");
        Employee employee = new Employee();
        employee.work();
        employee.takeBreak();
        employee.reportToManager();
        employee.attendMeeting();

        System.out.println("\n---- Employee Reference, Manager Object ----");
        Employee employee1 = new Manager();
        employee1.work();
        employee1.takeBreak();
        employee1.reportToManager();
        employee1.attendMeeting();

        System.out.println("\n---- Manager Object ----");
        Manager manager = new Manager();
        manager.work();
        manager.takeBreak();
        manager.reportToManager();
        manager.attendMeeting();
    }
}