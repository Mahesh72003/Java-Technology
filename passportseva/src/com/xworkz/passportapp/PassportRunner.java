package com.xworkz.passportapp;
//process of grouping data into single unit is called encapsulation;

import com.xworkz.passportapp.constants.Area;
import com.xworkz.passportapp.constants.Location;
import com.xworkz.passportapp.generatepassport.PassportSeva;
import com.xworkz.passportapp.passportdto.PassportDto;

public class PassportRunner {
    public static void main(String[] args) {
        PassportDto passportdto=new PassportDto();
        passportdto.setLocation(Location.postOffice);
        passportdto.setArea(Area.Bengaluru);
        passportdto.setFirstName("mahesh");
        passportdto.setLastName("A V");
        passportdto.setBirthDate("06/7/2003");
        passportdto.setEmail("mahesh@gmail.com");
        passportdto.setEmailSame(true);
        passportdto.setUserId("mahesh@gmail.com");
        passportdto.setPassword("mahesh123");
        passportdto.setConfirmPassword("mahesh123");
        passportdto.setSecurityQuestion("which is you pet name");
        passportdto.setSecurityAnswer("answer");
        passportdto.setCaptcha("AB7123");

        PassportSeva passportseva=new PassportSeva();
        passportseva.userRegisterd(passportdto);




    }
}
