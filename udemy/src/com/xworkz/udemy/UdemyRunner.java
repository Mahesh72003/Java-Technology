package com.xworkz.udemy;

import com.xworkz.udemy.dto.UdemyDto;

public class UdemyRunner {
    public static void main(String[] args) {

        UdemyDto udemyDto = new UdemyDto();
        udemyDto.setLocation("Rajajinagar");
        udemyDto.setFullName("Mahesh A V");
        udemyDto.setEmail("mahesh@gmail.com");
        udemyDto.setPhoneNumber(890463382L);
        udemyDto.setPassword("mahesh123");

        System.out.println(udemyDto.toString());
    }
}
