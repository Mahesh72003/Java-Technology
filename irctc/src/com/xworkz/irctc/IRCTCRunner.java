package com.xworkz.irctc;

import com.xworkz.irctc.dto.IRCTCDto;

public class IRCTCRunner {
    public static void main(String[] args) {

        IRCTCDto irctcDto = new IRCTCDto();
        irctcDto.setName("Mahesh A V");
        irctcDto.setEmail("mahesh@gmail.com");
        irctcDto.setUserId("mahesh@2003");
        irctcDto.setPhoneNumber(890463382L);
        irctcDto.setLocation("Rajajinagar");

        System.out.println(irctcDto.toString());
    }
}
