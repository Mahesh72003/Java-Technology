class OnlineBankingAccount 
{
    public static String accountSignUp(String accountNumber, String branchCode, String mobileNumber, String email, String atmCardNumber, String dob, String password, String confirmPassword) 
    {
        System.out.println("Inside the accountSignUp");
        boolean ref = false;
        String message = null;

        ref = validateAccountData(accountNumber, branchCode, mobileNumber, email, atmCardNumber, dob, password, confirmPassword);
        
        if (ref == true) 
        {
            message = "The Online Banking Account Registration is Successful";
        } 
        else 
        {
            message = "The Online Banking Account Registration is Unsuccessful";
        }

        System.out.println("Exiting the accountSignUp");
        return message;
    }

    public static boolean validateAccountData(String accountNumber, String branchCode, String mobileNumber, String email, String atmCardNumber, String dob, String password, String confirmPassword) 
    {
        System.out.println("Inside the validateAccountData");
        boolean isValid = false;
        boolean isAccountNumberValid = false;
        boolean isBranchCodeValid = false;
        boolean isMobileValid = false;
        boolean isEmailValid = false;
        boolean isAtmCardValid = false;
        boolean isDOBValid = false;
        boolean isPasswordValid = false;
        boolean isConfirmPasswordValid = false;

        if (accountNumber != null&& !accountNumber.isEmpty() && accountNumber.length() == 12) 
        {
            isAccountNumberValid = true;
        } 
        else 
        {
            System.out.println("Account Number is Invalid. Please provide a valid 12-digit Account Number.");
        }

        if (branchCode != null && branchCode.length() == 6) 
        {
            isBranchCodeValid = true;
        } 
        else 
        {
            System.out.println("Branch Code is Invalid. Please provide a valid 6-digit Branch Code.");
        }

        if (mobileNumber != null && mobileNumber.length() == 10) 
        {
            isMobileValid = true;
        } 
        else 
        {
            System.out.println("Mobile Number is Invalid. Please provide a valid Mobile Number.");
        }

        if (email != null && email.length() > 0) 
        {
            isEmailValid = true;
        } 
        else 
        {
            System.out.println("Email is Invalid. Please provide a valid Email Address.");
        }

        if (atmCardNumber != null && atmCardNumber.length() == 16) 
        {
            isAtmCardValid = true;
        } 
        else 
        {
            System.out.println("ATM Card Number is Invalid. Please provide a valid 16-digit ATM Card Number.");
        }

        if (dob != null && dob.length() > 0) 
        {
            isDOBValid = true;
        } 
        else 
        {
            System.out.println("Date of Birth is Invalid. Please provide a valid Date of Birth.");
        }

        if (password != null && password.length() >= 8) 
        {
            isPasswordValid = true;
        } 
        else 
        {
            System.out.println("Password is Invalid. Please provide a valid Password (at least 8 characters).");
        }

        if (confirmPassword != null && confirmPassword==password) 
        {
            isConfirmPasswordValid = true;
        } 
        else 
        {
            System.out.println("Confirm Password does not match Password. Please provide the same Confirm Password.");
        }

       if (isAccountNumberValid && isBranchCodeValid && isMobileValid && isEmailValid && isAtmCardValid && isDOBValid && isPasswordValid && isConfirmPasswordValid)

        {
            isValid = true;
        }

        System.out.println("Exiting the validateAccountData");
        return isValid;
    }
}
