package com.xworkz.hotstar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HotstarDto {
    private String name;
    private String emailId;
    private String password;
    private String userId;
    private String location;

    @Override
    public String toString() {
        return "HotstarDto: " +
                "\nName :- " + this.name + "," +
                "\nEmail ID :- " + this.emailId + "," +
                "\nPassword :- " + this.password + "," +
                "\nUser ID :- " + this.userId + "," +
                "\nLocation :- " + this.location;
    }
}
