package com.xworkz.redbus.redbusDto;

import com.xworkz.redbus.constant.Gender;
import com.xworkz.redbus.constant.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RedBusDto {
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
        return "RedBusDto{" +
                "\nfirstName=" + firstName +
                ", \nlastName=" + lastName +
                ", \nemailAddress=" + emailAddress +
                ", \nphoneNo=" + phoneNo +
                ", \npassword=" + password +
                ", \ngender=" + gender +
                ", \ndob=" + dob +
                ", \nlocation=" + location +
                ", \naddress=" + address +
                ", \npaymentMethod=" + paymentMethod +
                "\n}";
    }
}
