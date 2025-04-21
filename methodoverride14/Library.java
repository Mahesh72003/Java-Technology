package com.xworkz.methodoverride14;

public class Library extends Building {

    @Override
    public void construct() {
        System.out.println("Library is being constructed with bookshelves and reading areas.");
    }

    @Override
    public void renovate() {
        System.out.println("Library is being renovated with updated technology and better seating.");
    }

    @Override
    public void maintain() {
        System.out.println("Library is maintained by organizing books and keeping reading spaces clean.");
    }

    @Override
    public void use() {
        System.out.println("Library is used by people for reading, studying, and borrowing books.");
    }
}