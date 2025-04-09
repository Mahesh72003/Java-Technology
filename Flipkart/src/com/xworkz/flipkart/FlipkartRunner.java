package com.xworkz.flipkart;

import com.xworkz.flipkart.checkReg.FlipkartRegCheck;
import com.xworkz.flipkart.FlipkartDto.FlipkartDto;
import com.xworkz.flipkart.constant.Gender;
import com.xworkz.flipkart.constant.PaymentMethod;

public class FlipkartRunner {
    public static void main(String[] args) {

        FlipkartDto FlipkartDto = new FlipkartDto();
        FlipkartDto.setName("Mahesh A V");
        FlipkartDto.setEmailAddress("mahesh@test.com");
        FlipkartDto.setPhoneNo(890463382L);
        FlipkartDto.setPassword("mahesh@2003");
        FlipkartDto.setGender(Gender.MALE);
        FlipkartDto.setDob("06/07/2001");
        FlipkartDto.setLocation("Bangalore");
        FlipkartDto.setAddress("21 lig rajajinagar");
        FlipkartDto.setPaymentMethod(PaymentMethod.CREDIT);


        FlipkartRegCheck FlipkartRegCheck = new FlipkartRegCheck();
        FlipkartRegCheck.userRegistered(FlipkartDto);
        FlipkartRegCheck.getUserDetails(FlipkartDto);
    }
}
