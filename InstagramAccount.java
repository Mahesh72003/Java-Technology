class InstagramAccount 
{
    public static String accountSignUp(String email, String fullName, String username, String password, String confirmPassword, String dob, String phoneNumber) 
    {
        System.out.println("Inside the accountSignUp");
        boolean ref = false;
        String message = null;

        ref = validateAccountData(email, fullName, username, password, confirmPassword, dob, phoneNumber);
        
        if (ref == true) 
        {
            message = "The Instagram Account Registration is Successful";
        } 
        else 
        {
            message = "The Instagram Account Registration is Unsuccessful";
        }

        System.out.println("Exiting the accountSignUp");
        return message;
    }

    public static boolean validateAccountData(String email, String fullName, String username, String password, String confirmPassword, String dob, String phoneNumber) 
    {
        System.out.println("Inside the validateAccountData");
        boolean isValid = false;
        boolean isEmailValid = false;
        boolean isFullNameValid = false;
        boolean isUsernameValid = false;
        boolean isPasswordValid = false;
        boolean isConfirmPasswordValid = false;
        boolean isDOBValid = false;
        boolean isPhoneValid = false;

        if (email != null && email.length() > 0) 
        {
            isEmailValid = true;
        } 
        else 
        {
            System.out.println("Email is Invalid. Please provide a valid Email.");
        }

        if (fullName != null&&!fullName.isEmpty() && fullName.length() >= 3) 
        {
            isFullNameValid = true;
        } 
        else 
        {
            System.out.println("Full Name is Invalid. Please provide a valid Full Name.");
        }

        if (username != null&&!username.isEmpty() && username.length() >= 3) 
        {
            isUsernameValid = true;
        } 
        else 
        {
            System.out.println("Username is Invalid. Please provide a valid Username.");
        }

        if (password != null && password.length() >= 8) 
        {
            isPasswordValid = true;
        } 
        else 
        {
            System.out.println("Password is Invalid. Please provide a valid Password (at least 8 characters).");
        }

        if (confirmPassword != null && confirmPassword == password) 
        {
            isConfirmPasswordValid = true;
        } 
        else 
        {
            System.out.println("Confirm Password does not match Password. Please provide the same Confirm Password.");
        }

        if (dob != null && dob.length() > 0) 
        {
            isDOBValid = true;
        } 
        else 
        {
            System.out.println("Date of Birth is Invalid. Please provide a valid Date of Birth.");
        }

        if (phoneNumber != null && phoneNumber.length() == 10) 
        {
            isPhoneValid = true;
        } 
        else 
        {
            System.out.println("Phone Number is Invalid. Please provide a valid Phone Number.");
        }

        if (isEmailValid&& isFullNameValid&& isUsernameValid&& isPasswordValid&& isConfirmPasswordValid&& isDOBValid&& isPhoneValid) 
        {
            isValid = true;
        }

        System.out.println("Exiting the validateAccountData");
        return isValid;
    }
}
