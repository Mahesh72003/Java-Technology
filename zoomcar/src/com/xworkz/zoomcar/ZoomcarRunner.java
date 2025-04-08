package com.xworkz.zoomcar;

import com.xworkz.zoomcar.checkReg.ZoomcarRegCheck;
import com.xworkz.zoomcar.zoomcarDto.ZoomcarDto;
import com.xworkz.zoomcar.constant.Gender;
import com.xworkz.zoomcar.constant.PaymentMethod;

public class ZoomcarRunner {
    public static void main(String[] args) {

        ZoomcarDto zoomcarDto = new ZoomcarDto();
        zoomcarDto.setFirstName("mahesh");
        zoomcarDto.setLastName("A V");
        zoomcarDto.setEmailAddress("mahesh@test.com");
        zoomcarDto.setPhoneNo(890463382L);
        zoomcarDto.setPassword("mahesh@2003");
        zoomcarDto.setGender(Gender.MALE);
        zoomcarDto.setDob("06/07/2001");
        zoomcarDto.setLocation("Bangalore");
        zoomcarDto.setAddress("21 lig rajajinagar");
        zoomcarDto.setDrivingLicenseNumber("DL123456789");
        zoomcarDto.setLicenseExpiryDate("06/07/2025");
        zoomcarDto.setPaymentMethod(PaymentMethod.UPI);


        ZoomcarRegCheck zoomcarRegCheck = new ZoomcarRegCheck();
        zoomcarRegCheck.userRegistered(zoomcarDto);
    }
}
