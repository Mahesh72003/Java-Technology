package com.xworkz.zomato.zomatoDto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ZomatoDto {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private long phoneNo;
    private String password;
    private String dob;
    private String location;
    private String address;

    @Override
    public String toString() {
        return "ZomatoDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNo=" + phoneNo +
                ", password='" + password + '\'' +
                ", dob='" + dob + '\'' +
                ", location='" + location + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
