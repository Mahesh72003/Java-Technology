package com.xworkz.canvaapp.signup;
import com.xworkz.canvaapp.userdata.CanvaUserDto;
public class Canva {

        public boolean userSignUp(CanvaUserDto user) {
            return userValidation(user);
        }

        public boolean userValidation(CanvaUserDto user) {
            boolean isEmailValid = false;
            boolean isUserNameValid = false;
            boolean isPasswordValid = false;
            boolean isFullNameValid = false;
            boolean isAccountTypeValid = false;

            if (user.getEmail() != null && user.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email: Please include '@' in your email.");
            }

            if (user.getUserName() != null && !user.getUserName().isEmpty() && user.getUserName().length() <= 30) {
                isUserNameValid = true;
            } else {
                System.out.println("Invalid Username: Must not be empty and ≤ 30 characters.");
            }

            if (user.getPassword() != null && user.getPassword().length() >= 8 && user.getPassword().length() <= 20) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid Password: Must be between 8 and 20 characters.");
            }

            if (user.getFullName() != null && !user.getFullName().isEmpty()) {
                isFullNameValid = true;
            } else {
                System.out.println("Invalid Full Name: Cannot be empty.");
            }

            if (user.getAccountType() != null && (
                    user.getAccountType().equalsIgnoreCase("Free") ||
                            user.getAccountType().equalsIgnoreCase("Pro") ||
                            user.getAccountType().equalsIgnoreCase("Enterprise"))
            ) {
                isAccountTypeValid = true;
            } else {
                System.out.println("Invalid Account Type: Must be 'Free', 'Pro', or 'Enterprise'.");
            }

            return isEmailValid && isUserNameValid && isPasswordValid && isFullNameValid && isAccountTypeValid;
        }
    }


