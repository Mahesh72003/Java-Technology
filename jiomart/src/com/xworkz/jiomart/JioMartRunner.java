package com.xworkz.jiomart;

import com.xworkz.jiomart.dto.JioMartDto;

public class JioMartRunner {
    public static void main(String[] args) {

        JioMartDto jioMartDto = new JioMartDto();
        jioMartDto.setFullName("Mahesh A V");
        jioMartDto.setEmailAddress("mahesh@gmail.com");
        jioMartDto.setPhoneNumber(890463382L);
        jioMartDto.setUserId("mahesh@2003");
        jioMartDto.setLocation("Rajajinagar");

        System.out.println(jioMartDto.toString());
    }
}
