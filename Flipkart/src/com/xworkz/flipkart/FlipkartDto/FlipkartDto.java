package com.xworkz.flipkart.FlipkartDto;

import com.xworkz.flipkart.constant.Gender;
import com.xworkz.flipkart.constant.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Getter
@@Setter
public class FlipkartDto {
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
