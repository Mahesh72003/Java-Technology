package com.xworkz.shein.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SheinDto {
    private String fullName;
    private String email;
    private String userId;
    private String password;
    private String location;

    @Override
    public String toString() {
        return "SheinDto: " +
                "\nFull Name :- " + this.fullName + "," +
                "\nEmail :- " + this.email + "," +
                "\nUser ID :- " + this.userId + "," +
                "\nPassword :- " + this.password + "," +
                "\nLocation :- " + this.location;
    }
}
