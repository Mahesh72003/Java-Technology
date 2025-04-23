package com.xworkz.LinkedIn.linkedinDto;

import com.xworkz.LinkedIn.constant.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
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

    @Override
    public String toString() {
        return "LinkedInDto: " +
                "\nFirst Name: " + this.firstName + "," +
                "\nLast Name: " + this.lastName + "," +
                "\nEmail Address: " + this.emailAddress + "," +
                "\nPassword: " + this.password + "," +
                "\nCountry: " + this.country + "," +
                "\nPhone No: " + this.phoneNo + "," +
                "\nDOB: " + this.dob + "," +
                "\nJob Title: " + this.jobTitle + "," +
                "\nLocation: " + this.location + "," +
                "\nCaptcha: " + this.captcha;
    }
}
