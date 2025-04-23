package com.xworkz.google.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GoogleDto {
    private String name;
    private String emailAddress;
    private long phoneNumber;
    private String gender;
    private String password;

    @Override
    public String toString() {
        return "GoogleDto: " +
                "\nName :- " + this.name + "," +
                "\nEmail Address :- " + this.emailAddress + "," +
                "\nPhone Number :- " + this.phoneNumber + "," +
                "\nGender :- " + this.gender + "," +
                "\nPassword :- " + this.password;
    }
}
