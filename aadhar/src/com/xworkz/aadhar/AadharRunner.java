package com.xworkz.aadhar;

import com.xworkz.aadhar.dto.AadharDto;

public class AadharRunner {
    public static void main(String[] args) {

        AadharDto aadharDto = new AadharDto();
        aadharDto.setName("Mahesh A V");
        aadharDto.setAadharNumber("1234 5678 9012");
        aadharDto.setEmailAddress("mahesh@test.com");
        aadharDto.setPhoneNumber(890463382L);
        aadharDto.setLocation("Rajajinagar");

        System.out.println(aadharDto.toString());
    }
}
