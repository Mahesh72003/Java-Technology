package com.xworkz.wikipediaapp.login;

import com.xworkz.wikipediaapp.wikipedia.WikiPediaDto;
public class WikipediaLogIn {
WikiPediaDto wikiPediaDto;
        public boolean processLogin(WikiPediaDto data) {

            boolean isLoggedIn = false;

            boolean isUserInfoCorrect = checkUserDetails(data);
            if (isUserInfoCorrect) {
                this.wikiPediaDto=data;
                isLoggedIn = true;
                System.out.println("Login Successful!");
            } else {
                System.out.println("Login Failed. Please verify your information.");
            }

            return isLoggedIn;
        }

        public boolean checkUserDetails(WikiPediaDto data) {
            boolean isValidUser = false;

            boolean emailOk = false;
            boolean nameOk = false;
            boolean passOk = false;
            boolean confirmPassOk = false;
            boolean langOk = false;

            String email = data.getEmail();
            if (email != null && !email.isEmpty() && email.contains("@")) {
                emailOk = true;
            } else {
                System.out.println("Invalid email address");
            }

            String name = data.getUserName();
            if (name != null && !name.isEmpty() && name.length() >= 4) {
                nameOk = true;
            } else {
                System.out.println("Invalid username");
            }

            String password = data.getUserPassword();
            if (password != null && !password.isEmpty() && password.length() >= 6) {
                passOk = true;
            } else {
                System.out.println("Password too short");
            }

            String retype = data.getRetypePassword();
            if (retype != null && !retype.isEmpty() && retype.equals(password)) {
                confirmPassOk = true;
            } else {
                System.out.println("Passwords do not match");
            }

            String language = data.getPreferredLanguage();
            if (language != null && !language.isEmpty()) {
                langOk = true;
            } else {
                System.out.println("Language not selected");
            }

            if (emailOk && nameOk && passOk && confirmPassOk && langOk) {
                isValidUser = true;
            }

            return isValidUser;
        }
   public void displayUserDetails(WikiPediaDto wikiUser) {
        System.out.println("User Details:");
        System.out.println("Email: " + this.wikiPediaDto.getEmail());
        System.out.println("Username: " + this.wikiPediaDto.getUserName());
        System.out.println("Preferred Language: " + this.wikiPediaDto.getPreferredLanguage());
    }
    }


