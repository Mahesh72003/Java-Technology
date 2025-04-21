package com.xworkz.LinkedIn.linkedinDto;

import com.xworkz.LinkedIn.constant.Country;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LinkedInDto {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private Country country;
    private long phoneNo;
    private String dob;
    private String jobTitle;
    private String location;
    private String captcha;
}
