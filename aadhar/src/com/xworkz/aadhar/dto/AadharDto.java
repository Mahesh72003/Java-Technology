package com.xworkz.aadhar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AadharDto {
    private String name;
    private String aadharNumber;
    private String emailAddress;
    private long phoneNumber;
    private String location;

    @Override
    public String toString() {
        return "AadharDto: " +
                "\nName :- " + this.name + "," +
                "\nAadhar Number :- " + this.aadharNumber + "," +
                "\nEmail Address :- " + this.emailAddress + "," +
                "\nPhone Number :- " + this.phoneNumber + "," +
                "\nLocation :- " + this.location;
    }
}
