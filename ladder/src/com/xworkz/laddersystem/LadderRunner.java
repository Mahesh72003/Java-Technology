package com.xworkz.laddersystem;

import com.xworkz.laddersystem.ladder.Ladder;
import com.xworkz.laddersystem.model.LadderInfo;

public class LadderRunner {
    public static void main(String[] args) {
        LadderInfo[] ladderInfos = new LadderInfo[5];

        LadderInfo ladder1 = new LadderInfo();
        ladder1.setLadderId(1);
        ladder1.setMaterial("Aluminum");
        ladder1.setHeight(12);   
        ladder1.setPrice(2500.75);   
        ladder1.setType("Step Ladder");
        ladder1.setWeight(8.5);   
        ladder1.setMaxLoad(150);   
        ladderInfos[0] = ladder1;

        LadderInfo ladder2 = new LadderInfo();
        ladder2.setLadderId(2);
        ladder2.setMaterial("Steel");
        ladder2.setHeight(10);   
        ladder2.setPrice(1800.50);   
        ladder2.setType("Extension Ladder");
        ladder2.setWeight(12.0);   
        ladder2.setMaxLoad(200);   
        ladderInfos[1] = ladder2;

        LadderInfo ladder3 = new LadderInfo();
        ladder3.setLadderId(3);
        ladder3.setMaterial("Wood");
        ladder3.setHeight(8);   
        ladder3.setPrice(1200.00);   
        ladder3.setType("Step Ladder");
        ladder3.setWeight(6.0);   
        ladder3.setMaxLoad(100);   
        ladderInfos[2] = ladder3;

        LadderInfo ladder4 = new LadderInfo();
        ladder4.setLadderId(4);
        ladder4.setMaterial("Fiberglass");
        ladder4.setHeight(14);   
        ladder4.setPrice(3000.00);   
        ladder4.setType("Extension Ladder");
        ladder4.setWeight(9.0);   
        ladder4.setMaxLoad(175);   
        ladderInfos[3] = ladder4;

        LadderInfo ladder5 = new LadderInfo();
        ladder5.setLadderId(5);
        ladder5.setMaterial("Aluminum");
        ladder5.setHeight(16);   
        ladder5.setPrice(3500.25);   
        ladder5.setType("Step Ladder");
        ladder5.setWeight(10.0);   
        ladder5.setMaxLoad(180);   
        ladderInfos[4] = ladder5;

        Ladder ladder = new Ladder();
        ladder.ladderInfos = ladderInfos;
        ladder.displayLadderInfo();
    }
}
