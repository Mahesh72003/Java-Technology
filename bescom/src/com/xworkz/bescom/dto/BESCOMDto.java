package com.xworkz.bescom.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BESCOMDto {
    private String name;
    private String emailAddress;
    private String password;
    private String userId;
    private String location;

    @Override
    public String toString() {
        return "BESCOMDto: " +
                "\nName :- " + this.name + "," +
                "\nEmail Address :- " + this.emailAddress + "," +
                "\nPassword :- " + this.password + "," +
                "\nUser ID :- " + this.userId + "," +
                "\nLocation :- " + this.location;
    }
}
