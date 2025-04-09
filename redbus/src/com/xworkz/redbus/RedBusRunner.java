package com.xworkz.redbus;

import com.xworkz.redbus.checkReg.RedBusRegCheck;
import com.xworkz.redbus.redbusDto.RedBusDto;
import com.xworkz.redbus.constant.Gender;
import com.xworkz.redbus.constant.PaymentMethod;

public class RedBusRunner {
    public static void main(String[] args) {

        RedBusDto redBusDto = new RedBusDto();
        redBusDto.setFirstName("mahesh");
        redBusDto.setLastName("A V");
        redBusDto.setEmailAddress("mahesh@test.com");
        redBusDto.setPhoneNo(890463382L);
        redBusDto.setPassword("mahesh@2003");
        redBusDto.setGender(Gender.MALE);
        redBusDto.setDob("06/07/2001");
        redBusDto.setLocation("Bangalore");
        redBusDto.setAddress("21 lig rajajinagar");
        redBusDto.setPaymentMethod(PaymentMethod.CREDIT);

        RedBusRegCheck redBusRegCheck = new RedBusRegCheck();
        redBusRegCheck.userRegistered(redBusDto);
        redBusRegCheck.getUserDetails(redBusDto);
    }
}
