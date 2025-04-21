package com.xworkz.myntra.myntraDto;

import com.xworkz.myntra.constant.Gender;
import com.xworkz.myntra.constant.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class MyntraDto {
    private String name;
    private String emailAddress;
    private long phoneNo;
    private String password;
    private int age;
    private Gender gender;
    private String dob;
    private String location;
    private String address;
    private PaymentMethod paymentMethod;


}
