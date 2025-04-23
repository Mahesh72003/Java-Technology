package com.xworkz.quora.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QuoraDto {
    private String fullName;
    private String emailId;
    private String userId;
    private String location;
    private String password;

    @Override
    public String toString() {
        return "QuoraDto: " +
                "\nFull Name :- " + this.fullName + "," +
                "\nEmail ID :- " + this.emailId + "," +
                "\nUser ID :- " + this.userId + "," +
                "\nLocation :- " + this.location + "," +
                "\nPassword :- " + this.password;
    }
}
