package com.xworkz.steelsystem;

import com.xworkz.steelsystem.material.Material;
import com.xworkz.steelsystem.steel.Steel;
public class SteelRunner {
public static void main(String anuthing[])
{
    Material[] materials = new Material[5];

    Material material1 = new Material();
    material1.setSteelId(1);
    material1.setBrandName("Rambo");
    material1.setGrade("A36");
    material1.setHeight(2.5);
    material1.setWidth(3.5);
    material1.setLength(20);
    material1.setsUsableFood(false);
    materials[0]=material1;


    Material material2 = new Material();
    material2.setSteelId(2);
    material2.setBrandName("Tata");
    material2.setGrade("IS 2062");
    material2.setHeight(3.0);
    material2.setWidth(4.0);
    material2.setLength(25);
    material2.setsUsableFood(true);
    materials[1] = material2;

    Material material3 = new Material();
    material3.setSteelId(3);
    material3.setBrandName("Sail");
    material3.setGrade("Fe410W");
    material3.setHeight(2.8);
    material3.setWidth(3.2);
    material3.setLength(22);
    material3.setsUsableFood(false);
    materials[2] = material3;

    Material material4 = new Material();
    material4.setSteelId(4);
    material4.setBrandName("JSW");
    material4.setGrade("IS 11599");
    material4.setHeight(3.2);
    material4.setWidth(4.2);
    material4.setLength(30);
    material4.setsUsableFood(false);
    materials[3] = material4;

    Material material5 = new Material();
    material5.setSteelId(5);
    material5.setBrandName("Essar");
    material5.setGrade("IS 1875");
    material5.setHeight(3.1);
    material5.setWidth(3.6);
    material5.setLength(28);
    material5.setsUsableFood(false);
    materials[4]=material5;





    Steel steel = new Steel();
    steel.material=materials;
    steel.displayMaterialInfo();




}


}
