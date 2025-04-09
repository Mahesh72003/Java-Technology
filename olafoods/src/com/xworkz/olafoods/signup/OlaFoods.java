package com.xworkz.olafoods.signup;
import com.xworkz.olafoods.userdata.OlaFoodsUserDto;
public class OlaFoods
{
OlaFoods olaFoods;
        public boolean userSignUp(OlaFoodsUserDto user) {

            return userValidation(user);
        }

        public boolean userValidation(OlaFoodsUserDto user) {
            boolean isEmailValid = false;
            boolean isPhoneValid = false;
            boolean isPasswordValid = false;
            boolean isFullNameValid = false;
            boolean isDeliveryAreaValid = false;

            if (user.getEmail() != null && user.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email: Please enter a valid email ID.");
            }

            if (user.getPhoneNumber() != null && user.getPhoneNumber().length() == 10) {
                isPhoneValid = true;
            } else {
                System.out.println("Invalid Phone Number: It must be 10 digits.");
            }

            if (user.getPassword() != null && user.getPassword().length() >= 8 && user.getPassword().length() <= 16) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid Password: Length should be between 8 and 16 characters.");
            }

            if (user.getFullName() != null && user.getFullName().length() > 0 && user.getFullName().length() <= 50) {
                isFullNameValid = true;
            } else {
                System.out.println("Invalid Full Name: Cannot be empty or too long.");
            }

            if (user.getDeliveryArea() != null && !user.getDeliveryArea().isEmpty()) {
                isDeliveryAreaValid = true;
            } else {
                System.out.println("Invalid Delivery Area: Please provide your area.");
            }

            return isEmailValid && isPhoneValid && isPasswordValid && isFullNameValid && isDeliveryAreaValid;
        }

    public void getUserDetails(OlaFoodsUserDto user) {
        System.out.println("OlaFoods User Details:");
        System.out.println("Full Name: " + user.getFullName());
        System.out.println("Email Address: " + user.getEmail());
        System.out.println("Phone Number: " + user.getPhoneNumber());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Delivery Area: " + user.getDeliveryArea());
    }
    }


