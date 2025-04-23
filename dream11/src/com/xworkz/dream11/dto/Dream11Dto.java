package com.xworkz.dream11.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Dream11Dto {
    private String fullName;
    private String email;
    private String userId;
    private long phoneNumber;
    private String location;

    @Override
    public String toString() {
        return "Dream11Dto: " +
                "\nFull Name :- " + this.fullName + "," +
                "\nEmail :- " + this.email + "," +
                "\nUser ID :- " + this.userId + "," +
                "\nPhone Number :- " + this.phoneNumber + "," +
                "\nLocation :- " + this.location;
    }
}
