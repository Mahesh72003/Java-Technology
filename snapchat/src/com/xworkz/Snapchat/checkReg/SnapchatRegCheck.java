package com.xworkz.Snapchat.checkReg;

import com.xworkz.Snapchat.snapchatDto.SnapchatDto;


public class SnapchatRegCheck {
SnapchatDto snapchatDto;
    public void userRegistered(SnapchatDto snapchatDto) {
        boolean isUserValid = userValid(snapchatDto);
        if (isUserValid) {
            this.snapchatDto=snapchatDto;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(SnapchatDto snapchatDto) {
        boolean isUserValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isUsernameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isPhoneValid = false;
        boolean isDobValid = false;
        boolean isCaptchaValid = false;


        if (snapchatDto.getFirstName() != null && !snapchatDto.getFirstName().isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Please enter a valid first name.");
        }


        if (snapchatDto.getLastName() != null && !snapchatDto.getLastName().isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Please enter a valid last name.");
        }


        if (snapchatDto.getUsername() != null && !snapchatDto.getUsername().isEmpty()) {
            isUsernameValid = true;
        } else {
            System.out.println("Please enter a valid username.");
        }


        if (snapchatDto.getEmailAddress() != null && !snapchatDto.getEmailAddress().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }


        if (snapchatDto.getPassword() != null && snapchatDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }


        if (snapchatDto.getGender() != null) {
            isGenderValid = true;
        } else {
            System.out.println("Please select a valid gender.");
        }


        if (snapchatDto.getPhoneNo() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }


        if (snapchatDto.getDob() != null && !snapchatDto.getDob().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
        }


        if (snapchatDto.getCaptcha() != null && !snapchatDto.getCaptcha().isEmpty()) {
            isCaptchaValid = true;
        } else {
            System.out.println("Please enter a valid captcha.");
        }


        if (isFirstNameValid && isLastNameValid && isUsernameValid && isEmailValid && isPasswordValid && isGenderValid && isPhoneValid && isDobValid && isCaptchaValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
    public void getUserDetails(SnapchatDto snapchatDto) {
        System.out.println("Snapchat User Details:");
        System.out.println("First Name: " + this.snapchatDto.getFirstName());
        System.out.println("Last Name: " + this.snapchatDto.getLastName());
        System.out.println("Username: " + this.snapchatDto.getUsername());
        System.out.println("Email Address: " + this.snapchatDto.getEmailAddress());
        System.out.println("Password: " + this.snapchatDto.getPassword());
        System.out.println("Gender: " + this.snapchatDto.getGender());
        System.out.println("Phone Number: " + this.snapchatDto.getPhoneNo());
        System.out.println("Date of Birth: " + this.snapchatDto.getDob());
        System.out.println("Captcha: " + this.snapchatDto.getCaptcha());
    }
}
