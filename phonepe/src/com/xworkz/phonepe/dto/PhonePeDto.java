package com.xworkz.phonepe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PhonePeDto {
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private long bankAccountNumber;
    private String emailAddress;
    private String gender;

    @Override
    public String toString() {
        return "PhonePeDto: " +
                "\nFirst Name :- " + this.firstName + "," +
                "\nLast Name :- " + this.lastName + "," +
                "\nPhone Number :- " + this.phoneNumber + "," +
                "\nBank Account Number :- " + this.bankAccountNumber + "," +
                "\nEmail Address :- " + this.emailAddress + "," +
                "\nGender :- " + this.gender;
    }
}
