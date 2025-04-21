package com.xworkz.githubapp.signup;
import com.xworkz.githubapp.userdata.GitHubUserDto;

import java.security.PublicKey;

public class GitHub
{
GitHubUserDto gitHubUserDto;
        public boolean userSignUp(GitHubUserDto user) {
            gitHubUserDto=user;
            return userValidation(user);
        }

        public boolean userValidation(GitHubUserDto user) {
            boolean isEmailValid = false;
            boolean isUserNameValid = false;
            boolean isPasswordValid = false;
            boolean isFullNameValid = false;

            if (user.getEmail() != null && user.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email: Must include '@'.");
            }

            if (user.getUserName() != null && !user.getUserName().isEmpty() && user.getUserName().length() <= 39) {
                isUserNameValid = true;
            } else {
                System.out.println("Invalid Username: Cannot be empty and must be ≤ 39 characters.");
            }

            if (user.getPassword() != null && user.getPassword().length() >= 8) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid Password: Minimum 8 characters required.");
            }

            if (user.getFullName() != null && !user.getFullName().isEmpty()) {
                isFullNameValid = true;
            } else {
                System.out.println("Invalid Full Name: Cannot be empty.");
            }

            return isEmailValid && isUserNameValid && isPasswordValid && isFullNameValid;
        }
        public void getUserDetails(GitHubUserDto gitHubUserDto)
        {
            System.out.println("Full Name: " + this.gitHubUserDto.getFullName());
            System.out.println("Username: " + this.gitHubUserDto.getUserName());
            System.out.println("Email: " + this.gitHubUserDto.getEmail());
            System.out.println("Bio: " + this.gitHubUserDto.getBio());
        }
    }


