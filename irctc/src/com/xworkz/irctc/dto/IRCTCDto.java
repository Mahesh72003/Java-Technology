package com.xworkz.irctc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IRCTCDto {
    private String name;
    private String email;
    private String userId;
    private long phoneNumber;
    private String location;

    @Override
    public String toString() {
        return "IRCTCDto: " +
                "\nName :- " + this.name + "," +
                "\nEmail :- " + this.email + "," +
                "\nUser ID :- " + this.userId + "," +
                "\nPhone Number :- " + this.phoneNumber + "," +
                "\nLocation :- " + this.location;
    }
}
