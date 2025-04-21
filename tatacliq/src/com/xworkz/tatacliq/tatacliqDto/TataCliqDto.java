package com.xworkz.tatacliq.tatacliqDto;

import com.xworkz.tatacliq.constant.Gender;
import com.xworkz.tatacliq.constant.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TataCliqDto {
    private String name;
    private String emailAddress;
    private long phoneNo;
    private String password;
    private Gender gender;
    private String dob;
    private String location;
    private String billingAddress;
    private String shippingAddress;
    private PaymentMethod paymentMethod;


}
