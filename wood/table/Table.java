package com.xworkz.wood.table;

import com.xworkz.wood.wood.Wood;

public class Table extends Wood {

    @Override
    public void validateWoodDetails() {
        System.out.println("Table: A piece of furniture made from wood, typically used for working or eating.");
    }

    public void tableDesign() {
        System.out.println("This table has a modern design with a wooden top and metal legs.");
    }

    public void tableSize() {
        System.out.println("This table is 5 feet in length and 3 feet in width.");
    }

    public void tableLegs() {
        System.out.println("The table has four sturdy wooden legs.");
    }

    public void tableFinish() {
        System.out.println("The table has a smooth, glossy finish.");
    }
}
