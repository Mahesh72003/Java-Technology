package com.xworkz.flipkart.checkReg;

import com.xworkz.flipkart.FlipkartDto.FlipkartDto;

public class FlipkartRegCheck {
FlipkartDto flipkartDto;
    public void userRegistered(FlipkartDto FlipkartDto) {
        boolean isUserValid = userValid(FlipkartDto);
        if (isUserValid) {
            System.out.println("User registration successful!");
            this.flipkartDto=FlipkartDto;
        } else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(FlipkartDto FlipkartDto) {
        boolean isUserValid = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDobValid = false;
        boolean isLocationValid = false;
        boolean isAddressValid = false;
        boolean isPaymentMethodValid = false;

        
        if (FlipkartDto.getName() != null && !FlipkartDto.getName().isEmpty()) {
            isNameValid = true;
        } else {
            System.out.println("Please enter a valid name.");
        }

        
        if (FlipkartDto.getEmailAddress() != null && !FlipkartDto.getEmailAddress().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }

        
        if (FlipkartDto.getPhoneNo() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }

        
        if (FlipkartDto.getPassword() != null && FlipkartDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }

        
        if (FlipkartDto.getGender() != null) {
            isGenderValid = true;
        } else {
            System.out.println("Please select a valid gender.");
        }

        
        if (FlipkartDto.getDob() != null && !FlipkartDto.getDob().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
        }

        
        if (FlipkartDto.getLocation() != null && !FlipkartDto.getLocation().isEmpty()) {
            isLocationValid = true;
        } else {
            System.out.println("Please enter a valid location.");
        }

        
        if (FlipkartDto.getAddress() != null && !FlipkartDto.getAddress().isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Please enter a valid address.");
        }
        
        if (FlipkartDto.getPaymentMethod() != null) {
            isPaymentMethodValid = true;
        } else {
            System.out.println("Please select a valid payment method.");
        }

        
        if (isNameValid && isEmailValid && isPhoneValid && isPasswordValid &&
                isGenderValid && isDobValid && isLocationValid && isAddressValid && isPaymentMethodValid) {
            isUserValid = true;
        }

        return isUserValid;
    }

    public void getUserDetails(FlipkartDto flipkartDto){

         System.out.println("the User Name is " + this.flipkartDto.getName());
        System.out.println("the Email Id is " + this.flipkartDto.getEmailAddress());
        System.out.println("the Phone no is " + this.flipkartDto.getPhoneNo());
        System.out.println("the password is " + this.flipkartDto.getPassword());
        System.out.println("the gender is " + this.flipkartDto.getGender());
        System.out.println("the Dob is " + this.flipkartDto.getDob());
        System.out.println("the location is " + this.flipkartDto.getLocation());
        System.out.println("the address is " + this.flipkartDto.getAddress());
        System.out.println("the mode of payment is " + this.flipkartDto.getPaymentMethod());
}
}
