package com.xworkz.facebookapp.facebookdto;

import com.xworkz.facebookapp.constant.Gender;
import com.xworkz.facebookapp.constant.Language;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class FacebookDto {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Language language;
    private long mobileNumber;
    private String emailAddress;
    private String Dob;
}
