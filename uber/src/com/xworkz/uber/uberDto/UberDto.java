package com.xworkz.uber.uberDto;

import com.xworkz.uber.constant.Gender;
import com.xworkz.uber.constant.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UberDto {
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
    private String captcha;

    @Override
    public String toString() {
        return "UberDto{\n" +
                "firstName=" + firstName + "\n" +
                "lastName=" + lastName + "\n" +
                "emailAddress=" + emailAddress + "\n" +
                "phoneNo=" + phoneNo + "\n" +
                "password=" + password + "\n" +
                "gender=" + gender + "\n" +
                "dob=" + dob + "\n" +
                "location=" + location + "\n" +
                "address=" + address + "\n" +
                "paymentMethod=" + paymentMethod + "\n" +
                "captcha=" + captcha + "\n" +
                '}';
    }
}
