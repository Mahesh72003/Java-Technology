package com.xworkz.bescom;

import com.xworkz.bescom.dto.BESCOMDto;

public class BESCOMRunner {
    public static void main(String[] args) {

        BESCOMDto bescomDto = new BESCOMDto();
        bescomDto.setName("Mahesh A V");
        bescomDto.setEmailAddress("mahesh@gmail.com");
        bescomDto.setPassword("mahesh123");
        bescomDto.setUserId("mahesh@2003");
        bescomDto.setLocation("Rajajinagar");

        System.out.println(bescomDto.toString());
    }
}
