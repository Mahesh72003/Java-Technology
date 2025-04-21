package com.xworkz.methodoverride31;

public class Drums extends Tool {

    @Override
    public void useTool() {
        System.out.println("Drums are being played in a band.");
    }

    @Override
    public void storeTool() {
        System.out.println("Drums are stored carefully to avoid damage.");
    }

    @Override
    public void maintainTool() {
        System.out.println("Drums are tuned and cleaned for better sound quality.");
    }

    @Override
    public void displayTool() {
        System.out.println("Drums are displayed in a music studio.");
    }
}