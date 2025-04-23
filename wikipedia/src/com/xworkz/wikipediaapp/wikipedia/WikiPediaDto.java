package com.xworkz.wikipediaapp.wikipedia;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WikiPediaDto {

    private String email;
    private String userName;
    private String userPassword;
    private String retypePassword;
    private String preferredLanguage;

    @Override
    public String toString() {
        return "WikiPediaDto{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", retypePassword='" + retypePassword + '\'' +
                ", preferredLanguage='" + preferredLanguage + '\'' +
                '}';
    }
}
