package com.xworkz.redbus.redbusDto;

import com.xworkz.redbus.constant.Gender;
import com.xworkz.redbus.constant.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RedBusDto {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private long phoneNo;
    private String password;
    private Gender gender;
    private String dob;
    private String location;
    private String address;
    private PaymentMethod paymentMethod;
}
