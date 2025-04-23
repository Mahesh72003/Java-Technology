package com.xworkz.nykaaapp.nykaa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NykaaDto {
    private String emailId;
    private String name;
    private String mobileNumber;
    private String passWord;

    @Override
    public String toString() {
        return "NykaaDto: " +
                "\nEmail ID: " + this.emailId + "," +
                "\nName: " + this.name + "," +
                "\nMobile Number: " + this.mobileNumber + "," +
                "\nPassword: " + this.passWord;
    }
}
