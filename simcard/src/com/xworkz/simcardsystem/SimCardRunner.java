package com.xworkz.simcardsystem;

import com.xworkz.simcardsystem.simcard.SimCard;
import com.xworkz.simcardsystem.model.SimCardInfo;

public class SimCardRunner {
    public static void main(String[] args) {
        SimCardInfo[] simCardInfos = new SimCardInfo[5];

        SimCardInfo simCard1 = new SimCardInfo();
        simCard1.setSimCardId(1);
        simCard1.setBrand("Airtel");
        simCard1.setType("Prepaid");
        simCard1.setDataLimit(1.5);   
        simCard1.setValidity(28);   
        simCard1.setPrice(199.99);   
        simCard1.setIs5GSupported(false);
        simCard1.setCustomerCareNumber("121");
        simCardInfos[0] = simCard1;

        SimCardInfo simCard2 = new SimCardInfo();
        simCard2.setSimCardId(2);
        simCard2.setBrand("Jio");
        simCard2.setType("Postpaid");
        simCard2.setDataLimit(3.0);   
        simCard2.setValidity(30);   
        simCard2.setPrice(299.99);   
        simCard2.setIs5GSupported(true);
        simCard2.setCustomerCareNumber("199");
        simCardInfos[1] = simCard2;

        SimCardInfo simCard3 = new SimCardInfo();
        simCard3.setSimCardId(3);
        simCard3.setBrand("Vodafone");
        simCard3.setType("Prepaid");
        simCard3.setDataLimit(2.5);   
        simCard3.setValidity(21);   
        simCard3.setPrice(179.99);   
        simCard3.setIs5GSupported(false);
        simCard3.setCustomerCareNumber("199");
        simCardInfos[2] = simCard3;

        SimCardInfo simCard4 = new SimCardInfo();
        simCard4.setSimCardId(4);
        simCard4.setBrand("BSNL");
        simCard4.setType("Prepaid");
        simCard4.setDataLimit(1.0);   
        simCard4.setValidity(30);   
        simCard4.setPrice(149.99);   
        simCard4.setIs5GSupported(false);
        simCard4.setCustomerCareNumber("1503");
        simCardInfos[3] = simCard4;

        SimCardInfo simCard5 = new SimCardInfo();
        simCard5.setSimCardId(5);
        simCard5.setBrand("Idea");
        simCard5.setType("Postpaid");
        simCard5.setDataLimit(4.0);   
        simCard5.setValidity(31);   
        simCard5.setPrice(349.99);   
        simCard5.setIs5GSupported(true);
        simCard5.setCustomerCareNumber("198");
        simCardInfos[4] = simCard5;

        SimCard simCard = new SimCard();
        simCard.simCardInfos = simCardInfos;
        simCard.displaySimCardInfo();
    }
}
