package com.xworkz.hotstar;

import com.xworkz.hotstar.dto.HotstarDto;

public class HotstarRunner {
    public static void main(String[] args) {

        HotstarDto hotstarDto = new HotstarDto();
        hotstarDto.setName("Mahesh A V");
        hotstarDto.setEmailId("mahesh@gmail.com");
        hotstarDto.setPassword("mahesh123");
        hotstarDto.setUserId("mahesh@2003");
        hotstarDto.setLocation("Rajajinagar");

        System.out.println(hotstarDto.toString());
    }
}
