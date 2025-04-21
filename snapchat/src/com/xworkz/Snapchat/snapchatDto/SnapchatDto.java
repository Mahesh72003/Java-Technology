package com.xworkz.Snapchat.snapchatDto;

import com.xworkz.Snapchat.constant.Gender;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SnapchatDto {
    private String firstName;
    private String lastName;
    private String username;
    private String emailAddress;
    private String password;
    private Gender gender;
    private long phoneNo;
    private String dob;
    private String captcha;

}
