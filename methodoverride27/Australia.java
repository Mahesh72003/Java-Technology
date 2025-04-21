package com.xworkz.methodoverride27;

public class Australia extends Country {

    @Override
    public void name() {
        System.out.println("The name of the country is Australia.");
    }

    @Override
    public void population() {
        System.out.println("Australia has a population of around 25 million.");
    }

    @Override
    public void language() {
        System.out.println("The official language of Australia is English.");
    }

    @Override
    public void economy() {
        System.out.println("Australia has a mixed-market economy.");
    }
}