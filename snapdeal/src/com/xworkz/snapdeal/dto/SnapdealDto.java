package com.xworkz.snapdeal.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SnapdealDto {
    private String city;
    private String name;
    private String email;
    private long contactNumber;
    private String loginId;

    @Override
    public String toString() {
        return "SnapdealDto: " +
                "\nCity :- " + this.city + "," +
                "\nName :- " + this.name + "," +
                "\nEmail :- " + this.email + "," +
                "\nContact Number :- " + this.contactNumber + "," +
                "\nLogin ID :- " + this.loginId;
    }
}
