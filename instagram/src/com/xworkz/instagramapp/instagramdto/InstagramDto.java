package com.xworkz.instagramapp.instagramdto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InstagramDto {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String dob;
    private long phoneNumber;

    @Override
    public String toString() {
        return "InstagramDto: " +
                "\nFirst Name: " + this.firstName + "," +
                "\nLast Name: " + this.lastName + "," +
                "\nUsername: " + this.username + "," +
                "\nEmail: " + this.email + "," +
                "\nPassword: " + this.password + "," +
                "\nDOB: " + this.dob + "," +
                "\nPhone Number: " + this.phoneNumber;
    }
}
