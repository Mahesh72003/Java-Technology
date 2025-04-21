package com.xworkz.ajio.ajioDto;

import com.xworkz.ajio.constant.Gender;
import com.xworkz.ajio.constant.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AjioDto
{
    private String name;
    private String emailAddress;
    private long phoneNo;
    private String password;
    private Gender gender;
    private String dob;
    private String location;
    private String address;
    private PaymentMethod paymentMethod;


}
