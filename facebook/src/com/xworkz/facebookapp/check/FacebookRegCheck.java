package com.xworkz.facebookapp.check;

import com.xworkz.facebookapp.facebookdto.FacebookDto;

public class FacebookRegCheck {

    public void userRegisterd(FacebookDto facebookDto) {
        boolean isUserValid = userValid(facebookDto);
        if (isUserValid) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(FacebookDto facebookDto) {
        boolean isUserValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isGenderValid = false;
        boolean isLanguageValid = false;
        boolean isMobileValid = false;
        boolean isEmailValid = false;
        boolean isDobValid = false;

        if (facebookDto.getFirstName() != null && !facebookDto.getFirstName().isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Please enter a valid first name.");
        }

        if (facebookDto.getLastName() != null && !facebookDto.getLastName().isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Please enter a valid last name.");
        }

        if (facebookDto.getGender() != null) {
            isGenderValid = true;
        } else {
            System.out.println("Please select a valid gender.");
        }

        if (facebookDto.getLanguage() != null) {
            isLanguageValid = true;
        } else {
            System.out.println("Please select a valid language.");
        }

        if (facebookDto.getMobileNumber() > 0) {
            isMobileValid = true;
        } else {
            System.out.println("Please enter a valid mobile number.");
        }

        if (facebookDto.getEmailAddress() != null && !facebookDto.getEmailAddress().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }

        if (facebookDto.getDob() != null && !facebookDto.getDob().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
        }

        if (isFirstNameValid && isLastNameValid && isGenderValid && isLanguageValid && isMobileValid && isEmailValid && isDobValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
}
