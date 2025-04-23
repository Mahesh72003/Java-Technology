package com.xworkz.ubereatsapp.userdata;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UberEatsUserDto {

    private String email;
    private String phoneNumber;
    private String password;
    private String fullName;
    private String deliveryAddress;

    @Override
    public String toString() {
        return "UberEatsUserDto{" +
                "email='" + email + '\n' +
                ", phoneNumber='" + phoneNumber + '\n' +
                ", fullName='" + fullName + '\n' +
                ", deliveryAddress='" + deliveryAddress + '\n' +
                '}';
    }
}
