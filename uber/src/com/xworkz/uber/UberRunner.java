package com.xworkz.uber;

import com.xworkz.uber.checkReg.UberRegCheck;
import com.xworkz.uber.uberDto.UberDto;
import com.xworkz.uber.constant.Gender;
import com.xworkz.uber.constant.PaymentMethod;

public class UberRunner {
    public static void main(String[] args) {

        UberDto uberDto = new UberDto();
        uberDto.setFirstName("mahesh");
        uberDto.setLastName("A V");
        uberDto.setEmailAddress("mahesh@test.com");
        uberDto.setPhoneNo(890463382L);
        uberDto.setPassword("mahesh@2003");
        uberDto.setGender(Gender.MALE);
        uberDto.setDob("06/07/2001");
        uberDto.setLocation("Bangalore");
        uberDto.setAddress("21 lig rajajinagar");
        uberDto.setPaymentMethod(PaymentMethod.UPI);
        uberDto.setCaptcha("xyz123");

        UberRegCheck uberRegCheck = new UberRegCheck();
        uberRegCheck.userRegistered(uberDto);


        System.out.println(uberDto);
    }
}
