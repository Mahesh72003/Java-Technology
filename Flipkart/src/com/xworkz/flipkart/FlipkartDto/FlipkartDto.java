package com.xworkz.flipkart.FlipkartDto;

import com.xworkz.flipkart.constant.Gender;
import com.xworkz.flipkart.constant.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

    @Override
    public String toString() {
        return "FlipkartDto: " +
                "\nName: " + this.name + "," +
                "\nEmail Address: " + this.emailAddress + "," +
                "\nPhone No: " + this.phoneNo + "," +
                "\nPassword: " + this.password + "," +
                "\nGender: " + this.gender + "," +
                "\nDOB: " + this.dob + "," +
                "\nLocation: " + this.location + "," +
                "\nAddress: " + this.address + "," +
                "\nPayment Method: " + this.paymentMethod;
    }
}
