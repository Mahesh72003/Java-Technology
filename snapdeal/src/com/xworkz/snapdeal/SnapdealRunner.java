package com.xworkz.snapdeal;

import com.xworkz.snapdeal.dto.SnapdealDto;

public class SnapdealRunner {
    public static void main(String[] args) {

        SnapdealDto snapdealDto = new SnapdealDto();
        snapdealDto.setCity("Bengaluru");
        snapdealDto.setName("Mahesh A V");
        snapdealDto.setEmail("mahesh@gmail.com");
        snapdealDto.setContactNumber(890463382L);
        snapdealDto.setLoginId("mahesh@2003");

        System.out.println(snapdealDto.toString());
    }
}
