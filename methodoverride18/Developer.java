package com.xworkz.methodoverride18;

public class Developer extends Designer {

    @Override
    public void design() {
        System.out.println("Developer is implementing the design into code.");
    }

    @Override
    public void plan() {
        System.out.println("Developer is planning the system architecture and modules.");
    }

    @Override
    public void review() {
        System.out.println("Developer is reviewing the code for bugs and improvements.");
    }

    @Override
    public void present() {
        System.out.println("Developer is presenting the working application to stakeholders.");
    }
}