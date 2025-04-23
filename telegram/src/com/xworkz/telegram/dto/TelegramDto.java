package com.xworkz.telegram.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TelegramDto {
    private String name;
    private String username;
    private long phoneNumber;
    private String password;
    private String location;

    @Override
    public String toString() {
        return "TelegramDto: " +
                "\nName :- " + this.name + "," +
                "\nUsername :- " + this.username + "," +
                "\nPhone Number :- " + this.phoneNumber + "," +
                "\nPassword :- " + this.password + "," +
                "\nLocation :- " + this.location;
    }
}
