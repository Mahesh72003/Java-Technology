package com.xworkz.twitterapp.checkreg;

import com.xworkz.twitterapp.twitterdto.TwitterDto;

public class TwitterRegCheck {

    public void userRegistered(TwitterDto twitterDto) {
        boolean isUserValid = userValid(twitterDto);
        if (isUserValid) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(TwitterDto twitterDto) {
        boolean isUserValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isUsernameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPhoneValid = false;
        boolean isCaptchaValid = false;


        if (twitterDto.getFirstName() != null && !twitterDto.getFirstName().isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Please enter a valid first name.");
        }


        if (twitterDto.getLastName() != null && !twitterDto.getLastName().isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Please enter a valid last name.");
        }


        if (twitterDto.getUsername() != null && !twitterDto.getUsername().isEmpty()) {
            isUsernameValid = true;
        } else {
            System.out.println("Please enter a valid username");
        }


        if (twitterDto.getEmailId() != null && !twitterDto.getEmailId().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }


        if (twitterDto.getPassword() != null && twitterDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }


        if (twitterDto.getPhoneNumber() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }


        if (twitterDto.getCaptcha() != null && !twitterDto.getCaptcha().isEmpty()) {
            isCaptchaValid = true;
        } else {
            System.out.println("Please enter a valid captcha.");
        }


        if (isFirstNameValid && isLastNameValid && isUsernameValid && isEmailValid && isPasswordValid && isPhoneValid && isCaptchaValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
}
