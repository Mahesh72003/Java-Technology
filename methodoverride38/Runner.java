package com.xworkz.methodoverride38;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Book Object ----");
        Book book = new Book();
        book.read();
        book.open();
        book.close();
        book.bookmark();

        System.out.println("\n---- Book Reference, Comic Object ----");
        Book book1 = new Comic();
        book1.read();
        book1.open();
        book1.close();
        book1.bookmark();

        System.out.println("\n---- Comic Object ----");
        Comic comic = new Comic();
        comic.read();
        comic.open();
        comic.close();
        comic.bookmark();
    }
}