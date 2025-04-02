package com.xworkz.supermarketapp;

import com.xworkz.supermarketapp.product.Product;
import com.xworkz.supermarketapp.section.Section;
import com.xworkz.supermarketapp.supermarket.SuperMarket;

public class SuperMarketRunner
{
    public static void main(String anything[])
    {
    String superMarketbranches[]={"Basaveswar Nagar ","Kurubarahalli ","Bhashyam Circle ","Annapureshwari ","Jayanagar "};
    String productIngredeintsforPotatoChips[]={"Potato ", "Salt ", "Vegetable Oil ", "Sugar ", "Flavoring "};
    String productIngredeintsforNachos[]={"Corn Flour ", "Salt ", "Vegetable Oil ", "Cheese Powder ", "Paprika"};
    String productIngredeintsforSamosa[]={"Wheat Flour ", "Potato ", "Green Chili ", "Garam Masala ", "Salt ", "Oil"};
    //Product class
    Product[] products = new Product[3];
    Product products1=new Product();
    products1.productId=001;
    products1.productname="Potato Chips";
    products1.productIngredeints= productIngredeintsforPotatoChips;
    products1.productPrice=23.5;
    products[0]=products1;

    Product products2=new Product();
    products2.productId=002;
    products2.productname="Nachos";
    products2.productIngredeints= productIngredeintsforNachos;
    products2.productPrice=50.0;
    products[1]=products2;

    Product products3=new Product();
    products3.productId=003;
    products3.productname="Samosa";
    products3.productIngredeints= productIngredeintsforSamosa;
    products3.productPrice=20.0;
    products[2]=products3;




    // Section class
    Section[] sections = new Section[1];
    Section section1 = new Section();
    section1.sectionId = 01;
    section1.sectionName = "Snacks section";
    section1.product = products;
    sections[0] = section1;


    SuperMarket superMarket1 =new SuperMarket();
    superMarket1.superMarketID=1;
    superMarket1.superMarketName="More Super Market";
    superMarket1.superMarketLocation="Basaveswar Nagar";
    superMarket1.superMarketbranches=superMarketbranches;
    superMarket1.sections=sections;
    superMarket1.SuperMarketDisplay();




    }
}
