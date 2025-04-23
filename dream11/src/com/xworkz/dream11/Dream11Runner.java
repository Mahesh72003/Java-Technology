package com.xworkz.dream11;

import com.xworkz.dream11.dto.Dream11Dto;

public class Dream11Runner {
    public static void main(String[] args) {

        Dream11Dto dream11Dto = new Dream11Dto();
        dream11Dto.setFullName("Mahesh A V");
        dream11Dto.setEmail("mahesh@gmail.com");
        dream11Dto.setUserId("mahesh@2003");
        dream11Dto.setPhoneNumber(890463382L);
        dream11Dto.setLocation("Rajajinagar");

        System.out.println(dream11Dto.toString());
    }
}
