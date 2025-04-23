package com.xworkz.walmartapp.walmart;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WalMartDto {
    private String emailId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String passWord;

    @Override
    public String toString() {
        return "WalMartDto{" +
                "emailId='" + emailId + '\n' +
                ", firstName='" + firstName + '\n' +
                ", lastName='" + lastName + '\n' +
                ", phoneNumber='" + phoneNumber + '\n' +
                ", passWord='" + passWord + '\n' +
                '}';
    }
}
