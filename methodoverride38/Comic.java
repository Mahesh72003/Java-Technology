package com.xworkz.methodoverride38;

public class Comic extends Book {

    @Override
    public void read() {
        System.out.println("You are reading a comic book with illustrations.");
    }

    @Override
    public void open() {
        System.out.println("You open the comic book and start enjoying the colorful pages.");
    }

    @Override
    public void close() {
        System.out.println("You close the comic book after finishing a chapter.");
    }

    @Override
    public void bookmark() {
        System.out.println("You bookmark the page in the comic to continue the next time.");
    }
}