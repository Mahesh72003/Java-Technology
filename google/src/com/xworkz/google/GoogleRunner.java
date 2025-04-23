package com.xworkz.google;

import com.xworkz.google.dto.GoogleDto;

public class GoogleRunner {
    public static void main(String[] args) {

        GoogleDto googleDto = new GoogleDto();
        googleDto.setName("Mahesh A V");
        googleDto.setEmailAddress("Mahesh@example.com");
        googleDto.setPhoneNumber(9876543210L);
        googleDto.setGender("MALE");
        googleDto.setPassword("Mahesh@123");

        System.out.println(googleDto.toString());
    }
}
