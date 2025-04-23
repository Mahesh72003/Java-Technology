package com.xworkz.slack.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SlackDto {
    private String area;
    private String fullName;
    private String emailAddress;
    private String password;
    private String userId;

    @Override
    public String toString() {
        return "SlackDto: " +
                "\nArea :- " + this.area + "," +
                "\nFull Name :- " + this.fullName + "," +
                "\nEmail Address :- " + this.emailAddress + "," +
                "\nPassword :- " + this.password + "," +
                "\nUser ID :- " + this.userId;
    }
}
