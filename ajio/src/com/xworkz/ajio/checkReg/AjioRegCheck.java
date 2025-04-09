package com.xworkz.ajio.checkReg;

import com.xworkz.ajio.ajioDto.AjioDto;

public class AjioRegCheck {

    AjioDto ajioDto;
    public void userRegistered(AjioDto ajioDto) {
        boolean isUserValid = userValid(ajioDto);
        if (isUserValid) {
            this.ajioDto=ajioDto;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(AjioDto ajioDto) {
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


        if (ajioDto.getName() != null && !ajioDto.getName().isEmpty()) {
            isNameValid = true;
        } else {
            System.out.println("Please enter a valid name.");
        }


        if (ajioDto.getEmailAddress() != null && !ajioDto.getEmailAddress().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }


        if (ajioDto.getPhoneNo() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }


        if (ajioDto.getPassword() != null && ajioDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }

        if (ajioDto.getGender() != null) {
            isGenderValid = true;
        } else {
            System.out.println("Please select a valid gender.");
        }


        if (ajioDto.getDob() != null && !ajioDto.getDob().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
        }


        if (ajioDto.getLocation() != null && !ajioDto.getLocation().isEmpty()) {
            isLocationValid = true;
        } else {
            System.out.println("Please enter a valid location.");
        }


        if (ajioDto.getAddress() != null && !ajioDto.getAddress().isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Please enter a valid address.");
        }


        if (ajioDto.getPaymentMethod() != null) {
            isPaymentMethodValid = true;
        } else {
            System.out.println("Please select a valid payment method.");
        }


        if (isNameValid && isEmailValid && isPhoneValid && isPasswordValid && isGenderValid && isDobValid && isLocationValid && isAddressValid && isPaymentMethodValid) {
            isUserValid = true;
        }

        return isUserValid;
    }

    public void getuserDetails(AjioDto dto){
        System.out.println("the User Name is "+this.ajioDto.getName());
        System.out.println("the Email Id is "+this.ajioDto.getEmailAddress());
        System.out.println("the Phone no is "+this.ajioDto.getPhoneNo());
        System.out.println("the password is "+this.ajioDto.getPassword());
        System.out.println("the gender is "+this.ajioDto.getGender());
        System.out.println("the Dob is "+this.ajioDto.getDob());
        System.out.println("the location is "+this.ajioDto.getLocation());
        System.out.println("the address is "+this.ajioDto.getAddress());
        System.out.println("the mode of payment is "+this.ajioDto.getPaymentMethod());
    }

}
