package com.xworkz.meesho;

import com.xworkz.meesho.MeeshoDto;

public class MeeshoRunner {
    public static void main(String[] args) {

        MeeshoDto meeshoDto = new MeeshoDto();
        meeshoDto.setLocation("Rajajinagar");
        meeshoDto.setUsername("mahesh@2003");
        meeshoDto.setPassword("mahesh123");
        meeshoDto.setPhoneNumber(890463382L);
        meeshoDto.setEmail("mahesh@gmail.com");

        System.out.println(meeshoDto.toString());
    }
}
