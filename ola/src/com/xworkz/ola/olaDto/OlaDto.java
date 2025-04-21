package com.xworkz.ola.olaDto;

import com.xworkz.ola.constant.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class OlaDto {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private long phoneNo;
    private String password;
    private String dob;
    private String location;
    private String address;
    private PaymentMethod paymentMethod;
    private String captcha;

}
