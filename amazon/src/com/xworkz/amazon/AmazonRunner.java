package com.xworkz.amazon;

import com.xworkz.amazon.checkReg.AmazonRegCheck;
import com.xworkz.amazon.amazonDto.AmazonDto;
import com.xworkz.amazon.constant.Gender;
import com.xworkz.amazon.constant.PaymentMethod;

public class AmazonRunner {
    public static void main(String[] args) {

        AmazonDto amazonDto = new AmazonDto();
        amazonDto.setName("Mahesh A V");
        amazonDto.setEmailAddress("mahesh@test.com");
        amazonDto.setPhoneNo(890463382L);
        amazonDto.setPassword("mahesh@2003");
        amazonDto.setGender(Gender.MALE);
        amazonDto.setDob("06/07/2001");
        amazonDto.setLocation("Bangalore");
        amazonDto.setAddress("21 lig rajajinagar");
        amazonDto.setPaymentMethod(PaymentMethod.CREDIT);


        AmazonRegCheck amazonRegCheck = new AmazonRegCheck();
        amazonRegCheck.userRegistered(amazonDto);
        amazonRegCheck.getUserDetails(amazonDto);
    }
}
