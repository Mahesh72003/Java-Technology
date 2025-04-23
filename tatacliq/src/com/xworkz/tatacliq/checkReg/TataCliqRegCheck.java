package com.xworkz.tatacliq.checkReg;

import com.xworkz.tatacliq.tatacliqDto.TataCliqDto;

public class TataCliqRegCheck {

    public void userRegistered(TataCliqDto tataCliqDto) {
        boolean isUserValid = userValid(tataCliqDto);
        if (isUserValid) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(TataCliqDto tataCliqDto) {
        boolean isUserValid = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDobValid = false;
        boolean isLocationValid = false;
        boolean isBillingAddressValid = false;
        boolean isShippingAddressValid = false;
        boolean isPaymentMethodValid = false;


        if (tataCliqDto.getName() != null && !tataCliqDto.getName().isEmpty()) {
            isNameValid = true;
        } else {
            System.out.println("Please enter a valid name.");
        }


        if (tataCliqDto.getEmailAddress() != null && !tataCliqDto.getEmailAddress().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }


        if (tataCliqDto.getPhoneNo() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }


        if (tataCliqDto.getPassword() != null && tataCliqDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }


        if (tataCliqDto.getGender() != null) {
            isGenderValid = true;
        } else {
            System.out.println("Please select a valid gender.");
        }


        if (tataCliqDto.getDob() != null && !tataCliqDto.getDob().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
        }


        if (tataCliqDto.getLocation() != null && !tataCliqDto.getLocation().isEmpty()) {
            isLocationValid = true;
        } else {
            System.out.println("Please enter a valid location.");
        }


        if (tataCliqDto.getBillingAddress() != null && !tataCliqDto.getBillingAddress().isEmpty()) {
            isBillingAddressValid = true;
        } else {
            System.out.println("Please enter a valid billing address.");
        }


        if (tataCliqDto.getShippingAddress() != null && !tataCliqDto.getShippingAddress().isEmpty()) {
            isShippingAddressValid = true;
        } else {
            System.out.println("Please enter a valid shipping address.");
        }


        if (tataCliqDto.getPaymentMethod() != null) {
            isPaymentMethodValid = true;
        } else {
            System.out.println("Please select a valid payment method.");
        }


        if (isNameValid && isEmailValid && isPhoneValid && isPasswordValid && isGenderValid && isDobValid && isLocationValid && isBillingAddressValid && isShippingAddressValid && isPaymentMethodValid) {
            isUserValid = true;
        }

        return isUserValid;
    }


}
