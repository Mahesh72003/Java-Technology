package com.xworkz.zoomcar.checkReg;

import com.xworkz.zoomcar.zoomcarDto.ZoomcarDto;

public class ZoomcarRegCheck {

    public void userRegistered(ZoomcarDto zoomcarDto) {
        boolean isUserValid = userValid(zoomcarDto);
        if (isUserValid) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(ZoomcarDto zoomcarDto) {
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
        boolean isDrivingLicenseValid = false;
        boolean isLicenseExpiryDateValid = false;
        boolean isPaymentMethodValid = false;


        if (zoomcarDto.getFirstName() != null && !zoomcarDto.getFirstName().isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Please enter a valid first name.");
        }


        if (zoomcarDto.getLastName() != null && !zoomcarDto.getLastName().isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Please enter a valid last name.");
        }


        if (zoomcarDto.getEmailAddress() != null && !zoomcarDto.getEmailAddress().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }


        if (zoomcarDto.getPhoneNo() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }


        if (zoomcarDto.getPassword() != null && zoomcarDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }


        if (zoomcarDto.getGender() != null) {
            isGenderValid = true;
        } else {
            System.out.println("Please select a valid gender.");
        }


        if (zoomcarDto.getDob() != null && !zoomcarDto.getDob().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
        }


        if (zoomcarDto.getLocation() != null && !zoomcarDto.getLocation().isEmpty()) {
            isLocationValid = true;
        } else {
            System.out.println("Please enter a valid location.");
        }


        if (zoomcarDto.getAddress() != null && !zoomcarDto.getAddress().isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Please enter a valid address.");
        }


        if (zoomcarDto.getDrivingLicenseNumber() != null && !zoomcarDto.getDrivingLicenseNumber().isEmpty()) {
            isDrivingLicenseValid = true;
        } else {
            System.out.println("Please enter a valid driving license number.");
        }


        if (zoomcarDto.getLicenseExpiryDate() != null && !zoomcarDto.getLicenseExpiryDate().isEmpty()) {
            isLicenseExpiryDateValid = true;
        } else {
            System.out.println("Please enter a valid license expiry date.");
        }


        if (zoomcarDto.getPaymentMethod() != null) {
            isPaymentMethodValid = true;
        } else {
            System.out.println("Please select a valid payment method.");
        }


        if (isFirstNameValid && isLastNameValid && isEmailValid && isPhoneValid && isPasswordValid &&
                isGenderValid && isDobValid && isLocationValid && isAddressValid && isDrivingLicenseValid &&
                isLicenseExpiryDateValid && isPaymentMethodValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
}
