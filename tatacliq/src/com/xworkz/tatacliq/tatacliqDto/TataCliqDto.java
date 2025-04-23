package com.xworkz.tatacliq.tatacliqDto;

import com.xworkz.tatacliq.constant.Gender;
import com.xworkz.tatacliq.constant.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TataCliqDto {
    private String name;
    private String emailAddress;
    private long phoneNo;
    private String password;
    private Gender gender;
    private String dob;
    private String location;
    private String billingAddress;
    private String shippingAddress;
    private PaymentMethod paymentMethod;

    @Override
    public String toString() {
        return "TataCliqDto: " +
                "\nname :- " + this.name + "," +
                "\nemailAddress :- " + this.emailAddress + "," +
                "\nphoneNo :- " + this.phoneNo + "," +
                "\npassword :- " + this.password + "," +
                "\ngender :- " + this.gender + "," +
                "\ndob :- " + this.dob + "," +
                "\nlocation :- " + this.location + "," +
                "\nbillingAddress :- " + this.billingAddress + "," +
                "\nshippingAddress :- " + this.shippingAddress + "," +
                "\npaymentMethod :- " + this.paymentMethod + ",";
    }
}
