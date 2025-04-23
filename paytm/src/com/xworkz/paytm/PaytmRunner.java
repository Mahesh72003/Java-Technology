package com.xworkz.paytm;

import com.xworkz.paytm.dto.PaytmDto;

public class PaytmRunner {
    public static void main(String[] args) {

        PaytmDto paytmDto = new PaytmDto();
        paytmDto.setName("Mahesh A V");
        paytmDto.setEmailAddress("mahesh@test.com");
        paytmDto.setPhoneNumber(890463382L);
        paytmDto.setPassword("mahesh@2003");
        paytmDto.setPaymentMethod("UPI");

        System.out.println(paytmDto.toString());
    }
}
