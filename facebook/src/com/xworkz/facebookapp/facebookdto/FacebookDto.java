package com.xworkz.facebookapp.facebookdto;

import com.xworkz.facebookapp.constant.Gender;
import com.xworkz.facebookapp.constant.Language;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
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

    @Override
    public String toString() {
        return "FacebookDto: " +
                "\nFirst Name: " + this.firstName + "," +
                "\nLast Name: " + this.lastName + "," +
                "\nGender: " + this.gender + "," +
                "\nLanguage: " + this.language + "," +
                "\nMobile Number: " + this.mobileNumber + "," +
                "\nEmail Address: " + this.emailAddress + "," +
                "\nDOB: " + this.Dob;
    }
}
