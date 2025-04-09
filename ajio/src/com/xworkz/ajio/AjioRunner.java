package com.xworkz.ajio;

import com.xworkz.ajio.checkReg.AjioRegCheck;
import com.xworkz.ajio.ajioDto.AjioDto;
import com.xworkz.ajio.constant.Gender;
import com.xworkz.ajio.constant.PaymentMethod;

public class AjioRunner {
    public static void main(String[] args) {

        AjioDto ajioDto = new AjioDto();
        ajioDto.setName("Mahesh A V");
        ajioDto.setEmailAddress("mahesh@test.com");
        ajioDto.setPhoneNo(890463382L);
        ajioDto.setPassword("mahesh@2003");
        ajioDto.setGender(Gender.MALE);
        ajioDto.setDob("06/07/2001");
        ajioDto.setLocation("Bangalore");
        ajioDto.setAddress("21 lig rajajinagar");
        ajioDto.setPaymentMethod(PaymentMethod.UPI);

        AjioRegCheck ajioRegCheck = new AjioRegCheck();
        ajioRegCheck.userRegistered(ajioDto);
        ajioRegCheck.getuserDetails(ajioDto);
    }
}
