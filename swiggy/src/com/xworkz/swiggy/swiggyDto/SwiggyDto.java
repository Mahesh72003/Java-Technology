package com.xworkz.swiggy.swiggyDto;

import com.xworkz.swiggy.constant.Gender;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SwiggyDto {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private long phoneNo;
    private String password;
    private Gender gender;  // Gender enum
    private String dob;
    private String location;
    private String address;


}
