package com.xworkz.shein;

import com.xworkz.shein.dto.SheinDto;

public class SheinRunner {
    public static void main(String[] args) {

        SheinDto sheinDto = new SheinDto();
        sheinDto.setFullName("Mahesh A V");
        sheinDto.setEmail("mahesh@gmail.com");
        sheinDto.setUserId("mahesh@2003");
        sheinDto.setPassword("mahesh123");
        sheinDto.setLocation("Rajajinagar");

        System.out.println(sheinDto.toString());
    }
}
