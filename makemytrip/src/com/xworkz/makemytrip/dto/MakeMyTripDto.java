package com.xworkz.makemytrip.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MakeMyTripDto {
    private String name;
    private String email;
    private String password;
    private String userId;
    private String location;

    @Override
    public String toString() {
        return "MakeMyTripDto: " +
                "\nName :- " + this.name + "," +
                "\nEmail :- " + this.email + "," +
                "\nPassword :- " + this.password + "," +
                "\nUser ID :- " + this.userId + "," +
                "\nLocation :- " + this.location;
    }
}
