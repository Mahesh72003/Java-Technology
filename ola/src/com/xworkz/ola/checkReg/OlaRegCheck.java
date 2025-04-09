package com.xworkz.ola.checkReg;

import com.xworkz.ola.olaDto.OlaDto;

public class OlaRegCheck {
OlaDto olaDto;
    public void userRegistered(OlaDto olaDto) {
        boolean isUserValid = userValid(olaDto);
        if (isUserValid) {
            this.olaDto=olaDto;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(OlaDto olaDto) {
        boolean isUserValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isPasswordValid = false;
        boolean isDobValid = false;
        boolean isLocationValid = false;
        boolean isAddressValid = false;
        boolean isPaymentMethodValid = false;
        boolean isCaptchaValid = false;


        if (olaDto.getFirstName() != null && !olaDto.getFirstName().isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Please enter a valid first name.");
        }


        if (olaDto.getLastName() != null && !olaDto.getLastName().isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Please enter a valid last name.");
        }


        if (olaDto.getEmailAddress() != null && !olaDto.getEmailAddress().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }


        if (olaDto.getPhoneNo() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }


        if (olaDto.getPassword() != null && olaDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }


        if (olaDto.getDob() != null && !olaDto.getDob().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
        }


        if (olaDto.getLocation() != null && !olaDto.getLocation().isEmpty()) {
            isLocationValid = true;
        } else {
            System.out.println("Please enter a valid location.");
        }


        if (olaDto.getAddress() != null && !olaDto.getAddress().isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Please enter a valid address.");
        }


        if (olaDto.getPaymentMethod() != null) {
            isPaymentMethodValid = true;
        } else {
            System.out.println("Please select a valid payment method.");
        }


        if (olaDto.getCaptcha() != null && !olaDto.getCaptcha().isEmpty()) {
            isCaptchaValid = true;
        } else {
            System.out.println("Please enter a valid captcha.");
        }


        if (isFirstNameValid && isLastNameValid && isEmailValid && isPhoneValid && isPasswordValid &&
                isDobValid && isLocationValid && isAddressValid && isPaymentMethodValid && isCaptchaValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
    public void getUserDetails(OlaDto olaDto) {
        System.out.println("Ola User Details:");
        System.out.println("First Name: " + this.olaDto.getFirstName());
        System.out.println("Last Name: " + this.olaDto.getLastName());
        System.out.println("Email Address: " + this.olaDto.getEmailAddress());
        System.out.println("Phone Number: " + this.olaDto.getPhoneNo());
        System.out.println("Password: " + this.olaDto.getPassword());
        System.out.println("Date of Birth: " + this.olaDto.getDob());
        System.out.println("Location: " + this.olaDto.getLocation());
        System.out.println("Address: " + this.olaDto.getAddress());
        System.out.println("Payment Method: " + this.olaDto.getPaymentMethod());
        System.out.println("Captcha: " + this.olaDto.getCaptcha());
    }

}
