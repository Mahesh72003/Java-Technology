package com.xworkz.movie.productionhouse;
import com.xworkz.movie.director.Director;
public class ProductionHouse
{
    public int productionHouseId;
    public String productionHouseName;
    public Director directors[];
    public void displayProductionHouseInfo()
    {
        System.out.println("Production House ID: " + productionHouseId);
        System.out.println("Production House Name: " + productionHouseName);
        System.out.println("Directors:");
        for (Director director : directors)
        {
            director.displayDirectorInfo();
        }
    }
}