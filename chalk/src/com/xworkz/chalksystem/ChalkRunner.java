package com.xworkz.chalksystem;

import com.xworkz.chalksystem.chalk.Chalk;
import com.xworkz.chalksystem.model.ChalkInfo;

public class ChalkRunner {
    public static void main(String[] args) {
        ChalkInfo[] chalkInfos = new ChalkInfo[5];

        ChalkInfo chalk1 = new ChalkInfo();
        chalk1.setChalkId(1);
        chalk1.setBrand("Natraj");
        chalk1.setColor("White");
        chalk1.setLength(5.0);
        chalk1.setWidth(1.0);
        chalk1.setWeight(20.5);  
        chalk1.setIsDustless(true);
        chalkInfos[0] = chalk1;

        ChalkInfo chalk2 = new ChalkInfo();
        chalk2.setChalkId(2);
        chalk2.setBrand("Camel");
        chalk2.setColor("Yellow");
        chalk2.setLength(4.5);
        chalk2.setWidth(1.2);
        chalk2.setWeight(18.0);  
        chalk2.setIsDustless(true);
        chalkInfos[1] = chalk2;

        ChalkInfo chalk3 = new ChalkInfo();
        chalk3.setChalkId(3);
        chalk3.setBrand("Classmate");
        chalk3.setColor("Green");
        chalk3.setLength(4.8);
        chalk3.setWidth(1.1);
        chalk3.setWeight(22.5);  
        chalk3.setIsDustless(false);
        chalkInfos[2] = chalk3;

        ChalkInfo chalk4 = new ChalkInfo();
        chalk4.setChalkId(4);
        chalk4.setBrand("Hindustan");
        chalk4.setColor("White");
        chalk4.setLength(5.2);
        chalk4.setWidth(1.0);
        chalk4.setWeight(19.0);  
        chalk4.setIsDustless(true);
        chalkInfos[3] = chalk4;

        ChalkInfo chalk5 = new ChalkInfo();
        chalk5.setChalkId(5);
        chalk5.setBrand("Apsara");
        chalk5.setColor("White");
        chalk5.setLength(5.0);
        chalk5.setWidth(1.0);
        chalk5.setWeight(21.0);  
        chalk5.setIsDustless(false);
        chalkInfos[4] = chalk5;

        Chalk chalk = new Chalk();
        chalk.chalkInfos = chalkInfos;
        chalk.displayChalkInfo();
    }
}
