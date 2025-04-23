package com.xworkz.zeptoapp.userdata;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ZeptoUserDto {

    private String email;
    private String phoneNumber;
    private String password;
    private String name;
    private String address;

    @Override
    public String toString() {
        return "ZeptoUserDto{" +
                "email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
