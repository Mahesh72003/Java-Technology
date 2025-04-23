package com.xworkz.zomato;

import com.xworkz.zomato.checkReg.ZomatoRegCheck;
import com.xworkz.zomato.zomatoDto.ZomatoDto;

public class ZomatoRunner {
    public static void main(String[] args) {

        ZomatoDto zomatoDto = new ZomatoDto();
        zomatoDto.setFirstName("mahesh");
        zomatoDto.setLastName("A V");
        zomatoDto.setEmailAddress("mahesh@test.com");
        zomatoDto.setPhoneNo(890463382L);
        zomatoDto.setPassword("mahesh@2003");
        zomatoDto.setDob("06/07/2001");
        zomatoDto.setLocation("Bangalore");
        zomatoDto.setAddress("21 lig rajajinagar");


        ZomatoRegCheck zomatoRegCheck = new ZomatoRegCheck();
        zomatoRegCheck.userRegistered(zomatoDto);
        System.out.println(zomatoDto.toString());
    }
}
