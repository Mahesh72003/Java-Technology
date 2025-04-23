package com.xworkz.meesho;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MeeshoDto {
    private String location;
    private String username;
    private String password;
    private long phoneNumber;
    private String email;

    @Override
    public String toString() {
        return "MeeshoDto: " +
                "\nLocation :- " + this.location + "," +
                "\nUsername :- " + this.username + "," +
                "\nPassword :- " + this.password + "," +
                "\nPhone Number :- " + this.phoneNumber + "," +
                "\nEmail :- " + this.email;
    }
}
