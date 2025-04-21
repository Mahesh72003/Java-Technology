package com.xworkz.bigbasket.bigbasketDto;

import com.xworkz.bigbasket.constant.Gender;
import com.xworkz.bigbasket.constant.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BigBasketDto {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private long phoneNo;
    private String password;
    private Gender gender;  // Gender enum
    private String dob;
    private String location;
    private String address;
    private PaymentMethod paymentMethod;  // Payment method enum


}
