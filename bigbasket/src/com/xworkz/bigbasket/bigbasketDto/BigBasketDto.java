package com.xworkz.bigbasket.bigbasketDto;

import com.xworkz.bigbasket.constant.Gender;
import com.xworkz.bigbasket.constant.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BigBasketDto {
    private String firstName;
    private String lastName;
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
        return "BigBasketDto: " +
                "\nfirstName: " + this.firstName + "," +
                "\nlastName: " + this.lastName + "," +
                "\nemailAddress: " + this.emailAddress + "," +
                "\nphoneNo: " + this.phoneNo + "," +
                "\npassword: " + this.password + "," +
                "\ngender: " + this.gender + "," +
                "\ndob: " + this.dob + "," +
                "\nlocation: " + this.location + "," +
                "\naddress: " + this.address + "," +
                "\npaymentMethod: " + this.paymentMethod + ",";
    }
}
