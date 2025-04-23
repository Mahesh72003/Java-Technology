package com.xworkz.myntra.myntraDto;

import com.xworkz.myntra.constant.Gender;
import com.xworkz.myntra.constant.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MyntraDto {
    private String name;
    private String emailAddress;
    private long phoneNo;
    private String password;
    private int age;
    private Gender gender;
    private String dob;
    private String location;
    private String address;
    private PaymentMethod paymentMethod;

    @Override
    public String toString() {
        return "MyntraDto: " +
                "\nName: " + this.name + "," +
                "\nEmail Address: " + this.emailAddress + "," +
                "\nPhone No: " + this.phoneNo + "," +
                "\nPassword: " + this.password + "," +
                "\nAge: " + this.age + "," +
                "\nGender: " + this.gender + "," +
                "\nDOB: " + this.dob + "," +
                "\nLocation: " + this.location + "," +
                "\nAddress: " + this.address + "," +
                "\nPayment Method: " + this.paymentMethod;
    }
}
