package com.xworkz.LinkedIn.checkReg;

import com.xworkz.LinkedIn.linkedinDto.LinkedInDto;
import com.xworkz.LinkedIn.constant.Country;

public class LinkedInRegCheck {
LinkedInDto linkedInDto;
    public void userRegistered(LinkedInDto linkedInDto) {
        boolean isUserValid = userValid(linkedInDto);
        if (isUserValid) {
            this.linkedInDto=linkedInDto;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(LinkedInDto linkedInDto) {
        boolean isUserValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isCountryValid = false;
        boolean isPhoneValid = false;
        boolean isDobValid = false;
        boolean isJobTitleValid = false;
        boolean isLocationValid = false;
        boolean isCaptchaValid = false;


        if (linkedInDto.getFirstName() != null && !linkedInDto.getFirstName().isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Please enter a valid first name.");
        }


        if (linkedInDto.getLastName() != null && !linkedInDto.getLastName().isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Please enter a valid last name.");
        }


        if (linkedInDto.getEmailAddress() != null && !linkedInDto.getEmailAddress().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }


        if (linkedInDto.getPassword() != null && linkedInDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }


        if (linkedInDto.getCountry() != null) {
            isCountryValid = true;
        } else {
            System.out.println("Please select a valid country.");
        }


        if (linkedInDto.getPhoneNo() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }


        if (linkedInDto.getDob() != null && !linkedInDto.getDob().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
        }


        if (linkedInDto.getJobTitle() != null && !linkedInDto.getJobTitle().isEmpty()) {
            isJobTitleValid = true;
        } else {
            System.out.println("Please enter a valid job title.");
        }


        if (linkedInDto.getLocation() != null && !linkedInDto.getLocation().isEmpty()) {
            isLocationValid = true;
        } else {
            System.out.println("Please enter a valid location.");
        }


        if (linkedInDto.getCaptcha() != null && !linkedInDto.getCaptcha().isEmpty()) {
            isCaptchaValid = true;
        } else {
            System.out.println("Please enter a valid captcha.");
        }


        if (isFirstNameValid && isLastNameValid && isEmailValid && isPasswordValid && isCountryValid && isPhoneValid && isDobValid && isJobTitleValid && isLocationValid && isCaptchaValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
    public void getUserDetails(LinkedInDto linkedInDto) {
        System.out.println("LinkedIn User Details:");
        System.out.println("First Name: " + this.linkedInDto.getFirstName());
        System.out.println("Last Name: " + this.linkedInDto.getLastName());
        System.out.println("Email Address: " + this.linkedInDto.getEmailAddress());
        System.out.println("Job Title: " + this.linkedInDto.getJobTitle());
        System.out.println("Phone Number: " + this.linkedInDto.getPhoneNo());
        System.out.println("Date of Birth: " + this.linkedInDto.getDob());
        System.out.println("Country: " + this.linkedInDto.getCountry());
        System.out.println("Location: " + this.linkedInDto.getLocation());
        System.out.println("Captcha: " + this.linkedInDto.getCaptcha());
    }
}
