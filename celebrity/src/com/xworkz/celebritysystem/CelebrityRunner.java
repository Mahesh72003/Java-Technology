package com.xworkz.celebritysystem;

import com.xworkz.celebritysystem.celebrity.Celebrity;
import com.xworkz.celebritysystem.manager.CelebrityManager;

public class CelebrityRunner {
    public static void main(String[] args) {
        Celebrity[] celebrities = new Celebrity[5];

        Celebrity  celebrity1 = new Celebrity();
         celebrity1.setCelebrityId(101);
         celebrity1.setName("Yash");
         celebrity1.setProfession("Actor");
         celebrity1.setAge(38);
         celebrity1.setNationality("Indian");
         celebrity1.setIsActive(true);
         celebrity1.setNetWorth(70.0);
         celebrity1.setLanguageIndustry("Kannada");
        celebrities[0] =  celebrity1;

        Celebrity  celebrity2 = new Celebrity();
         celebrity2.setCelebrityId(102);
         celebrity2.setName("Rashmika Mandanna");
         celebrity2.setProfession("Actress");
         celebrity2.setAge(28);
         celebrity2.setNationality("Indian");
         celebrity2.setIsActive(true);
         celebrity2.setNetWorth(50.5);
         celebrity2.setLanguageIndustry("Kannada/Telugu/Hindi");
        celebrities[1] =  celebrity2;

        Celebrity  celebrity3 = new Celebrity();
         celebrity3.setCelebrityId(103);
         celebrity3.setName("Shah Rukh Khan");
         celebrity3.setProfession("Actor");
         celebrity3.setAge(58);
         celebrity3.setNationality("Indian");
         celebrity3.setIsActive(true);
         celebrity3.setNetWorth(630.0);
         celebrity3.setLanguageIndustry("Hindi");
        celebrities[2] =  celebrity3;

        Celebrity  celebrity4 = new Celebrity();
         celebrity4.setCelebrityId(104);
         celebrity4.setName("Virat Kohli");
         celebrity4.setProfession("Cricketer");
         celebrity4.setAge(36);
         celebrity4.setNationality("Indian");
         celebrity4.setIsActive(true);
         celebrity4.setNetWorth(1050.0);
         celebrity4.setLanguageIndustry("Sports");
        celebrities[3] =  celebrity4;

        Celebrity  celebrity5 = new Celebrity();
         celebrity5.setCelebrityId(105);
         celebrity5.setName("A. R. Rahman");
         celebrity5.setProfession("Music Composer");
         celebrity5.setAge(57);
         celebrity5.setNationality("Indian");
         celebrity5.setIsActive(true);
         celebrity5.setNetWorth(600.0);
         celebrity5.setLanguageIndustry("Tamil/Hindi/International");
        celebrities[4] =  celebrity5;

        CelebrityManager manager = new CelebrityManager();
        manager.celebrities = celebrities;
        manager.displayCelebrityInfo();
    }
}
