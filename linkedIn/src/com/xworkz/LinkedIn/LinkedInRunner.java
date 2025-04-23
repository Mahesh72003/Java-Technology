package com.xworkz.LinkedIn;

import com.xworkz.LinkedIn.checkReg.LinkedInRegCheck;
import com.xworkz.LinkedIn.constant.Country;
import com.xworkz.LinkedIn.linkedinDto.LinkedInDto;

public class LinkedInRunner {
    public static void main(String[] args) {
        LinkedInDto linkedInDto = new LinkedInDto();
        linkedInDto.setFirstName("Mahesh");
        linkedInDto.setLastName("A V");
        linkedInDto.setEmailAddress("mahesh@outlook.com");
        linkedInDto.setPassword("mahesh123");
        linkedInDto.setCountry(Country.INDIA);
        linkedInDto.setPhoneNo(94272947013L);
        linkedInDto.setDob("01/01/2003");
        linkedInDto.setJobTitle("Student");
        linkedInDto.setLocation("Banglore");
        linkedInDto.setCaptcha("kkwod63");

        LinkedInRegCheck linkedInRegCheck = new LinkedInRegCheck();
        linkedInRegCheck.userRegistered(linkedInDto);
        System.out.println(linkedInDto.toString());
    }
}
