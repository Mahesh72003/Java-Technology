package com.xworkz.paytm.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaytmDto {
    private String name;
    private String emailAddress;
    private long phoneNumber;
    private String password;
    private String paymentMethod;

    @Override
    public String toString() {
        return "PaytmDto: " +
                "\nName :- " + this.name + "," +
                "\nEmail Address :- " + this.emailAddress + "," +
                "\nPhone Number :- " + this.phoneNumber + "," +
                "\nPassword :- " + this.password + "," +
                "\nPayment Method :- " + this.paymentMethod;
    }
}
