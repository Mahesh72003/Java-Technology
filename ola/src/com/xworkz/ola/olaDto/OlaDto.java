package com.xworkz.ola.olaDto;

import com.xworkz.ola.constant.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OlaDto {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private long phoneNo;
    private String password;
    private String dob;
    private String location;
    private String address;
    private PaymentMethod paymentMethod;
    private String captcha;

    @Override
    public String toString() {
        return "OlaDto: " +
                "\nFirst Name: " + this.firstName + "," +
                "\nLast Name: " + this.lastName + "," +
                "\nEmail Address: " + this.emailAddress + "," +
                "\nPhone No: " + this.phoneNo + "," +
                "\nPassword: " + this.password + "," +
                "\nDOB: " + this.dob + "," +
                "\nLocation: " + this.location + "," +
                "\nAddress: " + this.address + "," +
                "\nPayment Method: " + this.paymentMethod + "," +
                "\nCaptcha: " + this.captcha;
    }
}
