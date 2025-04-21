package com.xworkz.organ;

import com.xworkz.organ.Heart.Heart;
import com.xworkz.organ.organ.Organ;

public class OrganRunner {
    public static void main(String[] args) {


        Organ organ = new Organ();
        organ.validateOrganDetails();
        organ.getOrganInfo();
        organ.maintainHealth();
        organ.repairDamage();
        organ.regulateFunction();
        organ.respondToStimuli();


        Organ ref = new Heart();
        ref.validateOrganDetails();
        ref.getOrganInfo();
        ref.maintainHealth();
        ref.repairDamage();
        ref.regulateFunction();


        Heart heart = new Heart();
        heart.validateOrganDetails();
        heart.getOrganInfo();
        heart.maintainHealth();
        heart.repairDamage();
        heart.regulateFunction();
        heart.pumpBlood();
    }
}
