package com.xworkz.steelsystem.steel;
import com.xworkz.steelsystem.material.Material;

public class Steel {

    public Material material[];

    public void displayMaterialInfo()
    {
        for(Material materials : material)
        {
            System.out.println("----------------------------------------------------");
            System.out.println("the Steel id is "+materials.getSteelId());
            System.out.println("the Steel brand name is "+materials.getBrandName());
            System.out.println("the grade of steel is "+materials.getGrade());
            System.out.println("the height of the steel is "+materials.getHeight());
            System.out.println("the length of the steel is "+materials.getLength());
            System.out.println("the width of the steel is "+materials.getWidth());
            System.out.println("the steel Usable Food is "+materials.getisUsableFood());
            System.out.println("----------------------------------------------------");
        }
    }
}
