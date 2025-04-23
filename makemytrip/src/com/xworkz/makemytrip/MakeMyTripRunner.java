package com.xworkz.makemytrip;

import com.xworkz.makemytrip.dto.MakeMyTripDto;

public class MakeMyTripRunner {
    public static void main(String[] args) {

        MakeMyTripDto makeMyTripDto = new MakeMyTripDto();
        makeMyTripDto.setName("Mahesh A V");
        makeMyTripDto.setEmail("mahesh@gmail.com");
        makeMyTripDto.setPassword("mahesh123");
        makeMyTripDto.setUserId("mahesh@2003");
        makeMyTripDto.setLocation("Rajajinagar");

        System.out.println(makeMyTripDto.toString());
    }
}
