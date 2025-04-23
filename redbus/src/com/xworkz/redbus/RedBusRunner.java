package com.xworkz.redbus;

import com.xworkz.redbus.checkReg.RedBusRegCheck;
import com.xworkz.redbus.redbusDto.RedBusDto;
import com.xworkz.redbus.constant.Gender;
import com.xworkz.redbus.constant.PaymentMethod;

public class RedBusRunner {
    public static void main(String[] args) {

        // Using AllArgsConstructor to create an instance
        RedBusDto redBusDto = new RedBusDto(
                "mahesh", "A V", "mahesh@test.com", 890463382L,
                "mahesh@2003", Gender.MALE, "06/07/2001",
                "Bangalore", "21 lig rajajinagar", PaymentMethod.CREDIT
        );

        RedBusRegCheck redBusRegCheck = new RedBusRegCheck();
        redBusRegCheck.userRegistered(redBusDto);
        System.out.println(redBusDto.toString());
    }
}
