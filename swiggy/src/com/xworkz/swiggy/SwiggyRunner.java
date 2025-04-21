package com.xworkz.swiggy;

import com.xworkz.swiggy.checkReg.SwiggyRegCheck;
import com.xworkz.swiggy.swiggyDto.SwiggyDto;
import com.xworkz.swiggy.constant.Gender;

public class SwiggyRunner {
    public static void main(String[] args) {

        SwiggyDto swiggyDto = new SwiggyDto();
        swiggyDto.setFirstName("mahesh");
        swiggyDto.setLastName("A V");
        swiggyDto.setEmailAddress("mahesh@test.com");
        swiggyDto.setPhoneNo(890463382L);
        swiggyDto.setPassword("mahesh@2003");
        swiggyDto.setGender(Gender.MALE);
        swiggyDto.setDob("06/07/2001");
        swiggyDto.setLocation("Bangalore");
        swiggyDto.setAddress("21 lig rajajinagar");

        SwiggyRegCheck swiggyRegCheck = new SwiggyRegCheck();
        swiggyRegCheck.userRegistered(swiggyDto);
    }
}
