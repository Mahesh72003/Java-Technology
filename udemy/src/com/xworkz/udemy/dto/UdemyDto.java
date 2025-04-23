package com.xworkz.udemy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UdemyDto {
    private String location;
    private String fullName;
    private String email;
    private long phoneNumber;
    private String password;

    @Override
    public String toString() {
        return "UdemyDto: " +
                "\nLocation :- " + this.location + "," +
                "\nFull Name :- " + this.fullName + "," +
                "\nEmail :- " + this.email + "," +
                "\nPhone Number :- " + this.phoneNumber + "," +
                "\nPassword :- " + this.password;
    }
}
