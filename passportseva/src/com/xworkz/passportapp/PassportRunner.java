package com.xworkz.passportapp;

import com.xworkz.passportapp.constants.Area;
import com.xworkz.passportapp.constants.Location;
import com.xworkz.passportapp.generatepassport.PassportSeva;
import com.xworkz.passportapp.passportdto.PassportDto;

public class PassportRunner {
    public static void main(String[] args) {
        PassportDto passportDto = new PassportDto();
        passportDto.setLocation(Location.postOffice);
        passportDto.setArea(Area.Bengaluru);
        passportDto.setFirstName("mahesh");
        passportDto.setLastName("A V");
        passportDto.setBirthDate("06/7/2003");
        passportDto.setEmail("mahesh@gmail.com");
        passportDto.setEmailSame(true);
        passportDto.setUserId("mahesh@gmail.com");
        passportDto.setPassword("mahesh123");
        passportDto.setConfirmPassword("mahesh123");
        passportDto.setSecurityQuestion("which is your pet name");
        passportDto.setSecurityAnswer("answer");
        passportDto.setCaptcha("AB7123");

        PassportSeva passportSeva = new PassportSeva();
        passportSeva.userRegisterd(passportDto);
        System.out.println(passportDto.toString());
    }
}
