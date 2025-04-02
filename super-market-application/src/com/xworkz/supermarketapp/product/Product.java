package com.xworkz.supermarketapp.product;

public class Product
{
    public int productId;
    public String productname;
    public String[] productIngredeints;
    public double productPrice;

    public void productDisplay()
    {
        System.out.println("");
        System.out.println("The Product id is :"+productId);
        System.out.println("The Product name is :"+productname);
        System.out.print("the list of Ingredeints are :- ");
        for(String Ingredeints : productIngredeints)
        {
            System.out.print(""+Ingredeints+"");
        }
        System.out.println("\nthe Price of the Product is: "+productPrice);
        System.out.println("");
    }

}
