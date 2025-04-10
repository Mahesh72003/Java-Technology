package com.xworkz.organ;

import com.xworkz.organ.Heart.Heart;
import com.xworkz.organ.organ.Organ;

public class OrganRunner {
    public static void main(String any[]) {

        Organ organ = new Organ();
        organ.validateOrganDetails();
        organ.getOrganInfo();


        Heart heart = new Heart();
        heart.validateOrganDetails();
        heart.getOrganInfo();
    }

}
