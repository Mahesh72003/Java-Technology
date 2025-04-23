package com.xworkz.flipkart;

import com.xworkz.flipkart.checkReg.FlipkartRegCheck;
import com.xworkz.flipkart.FlipkartDto.FlipkartDto;
import com.xworkz.flipkart.constant.Gender;
import com.xworkz.flipkart.constant.PaymentMethod;

public class FlipkartRunner {
    public static void main(String[] args) {

        FlipkartDto flipkartDto = new FlipkartDto();
        flipkartDto.setName("Mahesh A V");
        flipkartDto.setEmailAddress("mahesh@test.com");
        flipkartDto.setPhoneNo(890463382L);
        flipkartDto.setPassword("mahesh@2003");
        flipkartDto.setGender(Gender.MALE);
        flipkartDto.setDob("06/07/2001");
        flipkartDto.setLocation("Bangalore");
        flipkartDto.setAddress("21 lig rajajinagar");
        flipkartDto.setPaymentMethod(PaymentMethod.CREDIT);

        FlipkartRegCheck flipkartRegCheck = new FlipkartRegCheck();
        flipkartRegCheck.userRegistered(flipkartDto);
        System.out.println(flipkartDto.toString());
    }
}
