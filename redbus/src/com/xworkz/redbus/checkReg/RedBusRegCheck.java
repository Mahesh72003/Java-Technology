package com.xworkz.redbus.checkReg;

import com.xworkz.redbus.redbusDto.RedBusDto;

public class RedBusRegCheck {

    public void userRegistered(RedBusDto redBusDto) {
        boolean isUserValid = userValid(redBusDto);
        if (isUserValid) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(RedBusDto redBusDto) {
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


        if (redBusDto.getFirstName() != null && !redBusDto.getFirstName().isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Please enter a valid first name.");
        }


        if (redBusDto.getLastName() != null && !redBusDto.getLastName().isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Please enter a valid last name.");
        }


        if (redBusDto.getEmailAddress() != null && !redBusDto.getEmailAddress().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }


        if (redBusDto.getPhoneNo() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }


        if (redBusDto.getPassword() != null && redBusDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }


        if (redBusDto.getGender() != null) {
            isGenderValid = true;
        } else {
            System.out.println("Please select a valid gender.");
        }


        if (redBusDto.getDob() != null && !redBusDto.getDob().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
        }


        if (redBusDto.getLocation() != null && !redBusDto.getLocation().isEmpty()) {
            isLocationValid = true;
        } else {
            System.out.println("Please enter a valid location.");
        }


        if (redBusDto.getAddress() != null && !redBusDto.getAddress().isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Please enter a valid address.");
        }


        if (redBusDto.getPaymentMethod() != null) {
            isPaymentMethodValid = true;
        } else {
            System.out.println("Please select a valid payment method.");
        }


        if (isFirstNameValid && isLastNameValid && isEmailValid && isPhoneValid && isPasswordValid &&
                isGenderValid && isDobValid && isLocationValid && isAddressValid && isPaymentMethodValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
}
