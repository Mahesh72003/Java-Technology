package com.xworkz.jiomart.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JioMartDto {
    private String fullName;
    private String emailAddress;
    private long phoneNumber;
    private String userId;
    private String location;

    @Override
    public String toString() {
        return "JioMartDto: " +
                "\nFull Name :- " + this.fullName + "," +
                "\nEmail Address :- " + this.emailAddress + "," +
                "\nPhone Number :- " + this.phoneNumber + "," +
                "\nUser ID :- " + this.userId + "," +
                "\nLocation :- " + this.location;
    }
}
