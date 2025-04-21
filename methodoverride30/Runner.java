package com.xworkz.methodoverride30;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Item Object ----");
        Item item = new Item();
        item.use();
        item.clean();
        item.store();
        item.display();

        System.out.println("\n---- Item Reference, Chair Object ----");
        Item item1 = new Chair();
        item1.use();
        item1.clean();
        item1.store();
        item1.display();

        System.out.println("\n---- Chair Object ----");
        Chair chair = new Chair();
        chair.use();
        chair.clean();
        chair.store();
        chair.display();
    }
}