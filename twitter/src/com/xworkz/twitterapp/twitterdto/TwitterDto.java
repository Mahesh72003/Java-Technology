package com.xworkz.twitterapp.twitterdto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TwitterDto {
    private String firstName;
    private String lastName;
    private String username;
    private String emailId;
    private String password;
    private long phoneNumber;
    private String captcha;

    @Override
    public String toString() {
        return "TwitterDto: " +
                "\nfirstName :- " + this.firstName + "," +
                "\nlastName :- " + this.lastName + "," +
                "\nusername :- " + this.username + "," +
                "\nemailId :- " + this.emailId + "," +
                "\npassword :- " + this.password + "," +
                "\nphoneNumber :- " + this.phoneNumber + "," +
                "\ncaptcha :- " + this.captcha + ",";
    }
}
