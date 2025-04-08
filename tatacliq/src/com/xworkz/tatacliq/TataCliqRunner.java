package com.xworkz.tatacliq;

import com.xworkz.tatacliq.checkReg.TataCliqRegCheck;
import com.xworkz.tatacliq.tatacliqDto.TataCliqDto;
import com.xworkz.tatacliq.constant.Gender;
import com.xworkz.tatacliq.constant.PaymentMethod;

public class TataCliqRunner {
    public static void main(String[] args) {

        TataCliqDto tataCliqDto = new TataCliqDto();
        tataCliqDto.setName("Mahesh A V");
        tataCliqDto.setEmailAddress("mahesh@test.com");
        tataCliqDto.setPhoneNo(890463382L);
        tataCliqDto.setPassword("mahesh@2003");
        tataCliqDto.setGender(Gender.MALE);
        tataCliqDto.setDob("06/07/2001");
        tataCliqDto.setLocation("Bangalore");
        tataCliqDto.setBillingAddress("jp nager");
        tataCliqDto.setShippingAddress("21 lig rajajinagar");
        tataCliqDto.setPaymentMethod(PaymentMethod.CREDIT);

        TataCliqRegCheck tataCliqRegCheck = new TataCliqRegCheck();
        tataCliqRegCheck.userRegistered(tataCliqDto);
    }
}
