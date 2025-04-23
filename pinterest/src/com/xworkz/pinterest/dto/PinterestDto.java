package com.xworkz.pinterest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PinterestDto {
    private String area;
    private String name;
    private String email;
    private String username;
    private long phoneNumber;

    @Override
    public String toString() {
        return "PinterestDto: " +
                "\nArea :- " + this.area + "," +
                "\nName :- " + this.name + "," +
                "\nEmail :- " + this.email + "," +
                "\nUsername :- " + this.username + "," +
                "\nPhone Number :- " + this.phoneNumber;
    }
}
