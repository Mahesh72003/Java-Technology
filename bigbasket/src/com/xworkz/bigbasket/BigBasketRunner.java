package com.xworkz.bigbasket;

import com.xworkz.bigbasket.checkReg.BigBasketRegCheck;
import com.xworkz.bigbasket.bigbasketDto.BigBasketDto;
import com.xworkz.bigbasket.constant.Gender;
import com.xworkz.bigbasket.constant.PaymentMethod;

public class BigBasketRunner {
    public static void main(String[] args) {

        BigBasketDto bigBasketDto = new BigBasketDto();
        bigBasketDto.setFirstName("mahesh");
        bigBasketDto.setLastName("A V");
        bigBasketDto.setEmailAddress("mahesh@test.com");
        bigBasketDto.setPhoneNo(890463382L);
        bigBasketDto.setPassword("mahesh@2003");
        bigBasketDto.setGender(Gender.MALE);
        bigBasketDto.setDob("06/07/2001");
        bigBasketDto.setLocation("Bangalore");
        bigBasketDto.setAddress("21 lig rajajinagar");
        bigBasketDto.setPaymentMethod(PaymentMethod.UPI);

        BigBasketRegCheck bigBasketRegCheck = new BigBasketRegCheck();
        bigBasketRegCheck.userRegistered(bigBasketDto);

        System.out.println(bigBasketDto.toString());
    }
}
