package com.xworkz.wood;

import com.xworkz.wood.table.Table;
import com.xworkz.wood.wood.Wood;

public class WoodRunner {
    public static void main(String any[]) {

        Wood wood = new Wood();
        wood.validateWoodDetails();
        wood.getWoodInfo();

        Table table = new Table();
        table.validateWoodDetails();
        table.getWoodInfo();


    }


}
