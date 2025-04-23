package com.xworkz.coursera.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CourseraDto {
    private String name;
    private String emailId;
    private String userId;
    private String password;
    private String location;

    @Override
    public String toString() {
        return "CourseraDto: " +
                "\nName :- " + this.name + "," +
                "\nEmail ID :- " + this.emailId + "," +
                "\nUser ID :- " + this.userId + "," +
                "\nPassword :- " + this.password + "," +
                "\nLocation :- " + this.location;
    }
}
