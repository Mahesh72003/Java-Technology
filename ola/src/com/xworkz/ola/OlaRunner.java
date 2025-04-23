package com.xworkz.ola;

import com.xworkz.ola.checkReg.OlaRegCheck;
import com.xworkz.ola.olaDto.OlaDto;
import com.xworkz.ola.constant.PaymentMethod;

public class OlaRunner {
    public static void main(String[] args) {

        OlaDto olaDto = new OlaDto();
        olaDto.setFirstName("mahesh");
        olaDto.setLastName("A V");
        olaDto.setEmailAddress("mahesh@test.com");
        olaDto.setPhoneNo(890463382L);
        olaDto.setPassword("mahesh@2003");
        olaDto.setDob("06/07/2001");
        olaDto.setLocation("Bangalore");
        olaDto.setAddress("21 lig rajajinagar");
        olaDto.setPaymentMethod(PaymentMethod.CREDIT);
        olaDto.setCaptcha("xyz123");

        OlaRegCheck olaRegCheck = new OlaRegCheck();
        olaRegCheck.userRegistered(olaDto);
        System.out.println(olaDto.toString());
    }
}
