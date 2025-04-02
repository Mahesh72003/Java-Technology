package com.xworkz.supermarketapp.supermarket;

import com.xworkz.supermarketapp.section.Section;

public class SuperMarket
{
    public int superMarketID;
    public String superMarketName;
    public String superMarketLocation;
    public String superMarketbranches[];
    public Section[] sections;

    public void SuperMarketDisplay()
    {
        System.out.println("");
        System.out.println("the id of Super Market is: "+superMarketID);
        System.out.println("the Name of the Super Market is: "+superMarketName);
        System.out.println("the location of the Super Market is: "+superMarketLocation);
        System.out.print("the branche name are:- ");
        for (String branche : superMarketbranches)
        {
            System.out.print(""+branche+"");
        }
        for (Section section : sections)
        {
            section.sectionDisplay();
        }
        System.out.println("");
    }
}
