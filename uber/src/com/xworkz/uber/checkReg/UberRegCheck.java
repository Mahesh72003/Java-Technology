package com.xworkz.uber.checkReg;

import com.xworkz.uber.uberDto.UberDto;

public class UberRegCheck {
    UberDto uberDto;
    public void userRegistered(UberDto uberDto) {
        boolean isUserValid = userValid(uberDto);
        if (isUserValid) {
            this.uberDto=uberDto;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(UberDto uberDto) {
        boolean isUserValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDobValid = false;
        boolean isLocationValid = false;
        boolean isAddressValid = false;
        boolean isPaymentMethodValid = false;
        boolean isCaptchaValid = false;


        if (uberDto.getFirstName() != null && !uberDto.getFirstName().isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Please enter a valid first name.");
        }

        if (uberDto.getLastName() != null && !uberDto.getLastName().isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Please enter a valid last name.");
        }

        if (uberDto.getEmailAddress() != null && !uberDto.getEmailAddress().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }

        if (uberDto.getPhoneNo() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }

        if (uberDto.getPassword() != null && uberDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }


        if (uberDto.getGender() != null) {
            isGenderValid = true;
        } else {
            System.out.println("Please select a valid gender.");
        }

        if (uberDto.getDob() != null && !uberDto.getDob().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
        }


        if (uberDto.getLocation() != null && !uberDto.getLocation().isEmpty()) {
            isLocationValid = true;
        } else {
            System.out.println("Please enter a valid location.");
        }


        if (uberDto.getAddress() != null && !uberDto.getAddress().isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Please enter a valid address.");
        }

        if (uberDto.getPaymentMethod() != null) {
            isPaymentMethodValid = true;
        } else {
            System.out.println("Please select a valid payment method.");
        }

        if (uberDto.getCaptcha() != null && !uberDto.getCaptcha().isEmpty()) {
            isCaptchaValid = true;
        } else {
            System.out.println("Please enter a valid captcha.");
        }


        if (isFirstNameValid && isLastNameValid && isEmailValid && isPhoneValid && isPasswordValid &&
                isGenderValid && isDobValid && isLocationValid && isAddressValid && isPaymentMethodValid &&
                isCaptchaValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
    public void getUserDetails(UberDto uberDto) {
        System.out.println("Uber User Details:");
        System.out.println("First Name: " + this.uberDto.getFirstName());
        System.out.println("Last Name: " + this.uberDto.getLastName());
        System.out.println("Email Address: " + this.uberDto.getEmailAddress());
        System.out.println("Phone Number: " + this.uberDto.getPhoneNo());
        System.out.println("Password: " + this.uberDto.getPassword());
        System.out.println("Gender: " + this.uberDto.getGender());
        System.out.println("Date of Birth: " + this.uberDto.getDob());
        System.out.println("Location: " + this.uberDto.getLocation());
        System.out.println("Address: " + this.uberDto.getAddress());
        System.out.println("Payment Method: " + this.uberDto.getPaymentMethod());
        System.out.println("Captcha: " + this.uberDto.getCaptcha());
    }
}
