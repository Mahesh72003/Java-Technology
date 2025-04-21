package com.xworkz.methodoverride49;

public class Runner {
    public static void main(String[] args) {
        System.out.println("--- Apparel Object ---");
        Apparel apparel = new Apparel();
        apparel.wear();
        apparel.remove();
        apparel.clean();
        apparel.store();
        apparel.info();

        System.out.println("--- Apparel Reference, Jacket Object ---");
        Apparel jacketRef = new Jacket();
        jacketRef.wear();
        jacketRef.remove();
        jacketRef.clean();
        jacketRef.store();
        jacketRef.info();

        System.out.println("--- Jacket Object ---");
        Jacket jacket = new Jacket();
        jacket.wear();
        jacket.remove();
        jacket.clean();
        jacket.store();
        jacket.info();
    }
}