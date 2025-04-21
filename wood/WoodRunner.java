package com.xworkz.wood;

import com.xworkz.wood.table.Table;
import com.xworkz.wood.wood.Wood;

public class WoodRunner {
    public static void main(String[] any) {


        Wood wood = new Wood();
        wood.validateWoodDetails();
        wood.getWoodInfo();
        wood.woodType();
        wood.uses();
        wood.treatment();


        Table table = new Table();
        table.validateWoodDetails();
        table.getWoodInfo();
        table.tableDesign();
        table.tableSize();
        table.tableLegs();
        table.tableFinish();


        Wood polymorphicWood = new Table();
        polymorphicWood.validateWoodDetails();
        polymorphicWood.getWoodInfo();
        polymorphicWood.woodType();
        polymorphicWood.uses();
        polymorphicWood.treatment();
    }
}
