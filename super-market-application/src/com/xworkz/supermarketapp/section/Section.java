package com.xworkz.supermarketapp.section;
import com.xworkz.supermarketapp.product.Product;

public class Section
{
    public int sectionId;
    public String sectionName;
    public Product[] product;

    public void sectionDisplay()
    {
        System.out.println("\n");
        System.out.println("The section id is: "+sectionId);
        System.out.println("The the name of section is: "+sectionName);
        System.out.println("the list of product are their: ");
        for(Product products : product)
        {
            products.productDisplay();
        }
        System.out.println("");
    }
}
