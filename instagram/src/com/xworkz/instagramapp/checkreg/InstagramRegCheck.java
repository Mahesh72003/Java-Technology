package com.xworkz.instagramapp.checkreg;

import com.xworkz.instagramapp.instagramdto.InstagramDto;

public class InstagramRegCheck {

    public void userRegisterd(InstagramDto instagramDto) {
        boolean isUserValid = userValid(instagramDto);
        if (isUserValid) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(InstagramDto instagramDto) {
        boolean isUserValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isUsernameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPhoneValid = false;
        boolean isDobValid = false;


        if (instagramDto.getFirstName() != null && !instagramDto.getFirstName().isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Please enter a valid first name.");
        }


        if (instagramDto.getLastName() != null && !instagramDto.getLastName().isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Please enter a valid last name.");
        }


        if (instagramDto.getUsername() != null && !instagramDto.getUsername().isEmpty()) {
            isUsernameValid = true;
        } else {
            System.out.println("Please enter a valid username.");
        }


        if (instagramDto.getEmail() != null && !instagramDto.getEmail().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }


        if (instagramDto.getPassword() != null && instagramDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }


        if (instagramDto.getPhoneNumber() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }


        if (instagramDto.getDob() != null && !instagramDto.getDob().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
        }


        if (isFirstNameValid && isLastNameValid && isUsernameValid && isEmailValid && isPasswordValid && isPhoneValid && isDobValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
}
