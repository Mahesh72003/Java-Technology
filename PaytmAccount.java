class PaytmAccount 
{
    public static String accountSignUp(String name, String mobileNumber, String email, String enterPin, String finalPin, String accountNumber, String branchCode) 
    {
        System.out.println("Inside the accountSignUp");
        boolean ref = false;
        String message = null;

        ref = validateAccountData(name, mobileNumber, email, enterPin, finalPin, accountNumber, branchCode);
        
        if (ref == true) 
        {
            message = "The Paytm Account Registration is Successful";
        } 
        else 
        {
            message = "The Paytm Account Registration is Unsuccessful";
        }

        System.out.println("Exiting the accountSignUp");
        return message;
    }

    public static boolean validateAccountData(String name, String mobileNumber, String email, String enterPin, String finalPin, String accountNumber, String branchCode) 
    {
        System.out.println("Inside the validateAccountData");
        boolean isValid = false;
        boolean isNameValid = false;
        boolean isMobileValid = false;
        boolean isEmailValid = false;
        boolean isEnterPinValid = false;
        boolean isFinalPinValid = false;
        boolean isAccountNumberValid = false;
        boolean isBranchCodeValid = false;

        if (name != null&& !name.isEmpty() && name.length() > 0) 
        {
            isNameValid = true;
        } 
        else 
        {
            System.out.println("Name is Invalid. Please provide a valid Name.");
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

        if (enterPin != null && enterPin.length() == 4) 
        {
            isEnterPinValid = true;
        } 
        else 
        {
            System.out.println("Enter Pin is Invalid. Please provide a valid 4-digit Pin.");
        }

        if (finalPin != null && finalPin.length() == 4&& enterPin != finalPin) 
        {
            isFinalPinValid = true;
        } 
        else 
        {
            System.out.println("Final Pin is Invalid or matches the Enter Pin. Please provide a different 4-digit Final Pin.");
        }

        if (accountNumber != null && accountNumber.length() == 12) 
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

        if (isNameValid && isMobileValid && isEmailValid && isEnterPinValid && isFinalPinValid && isAccountNumberValid && isBranchCodeValid)

        {
            isValid = true;
        }

        System.out.println("Exiting the validateAccountData");
        return isValid;
    }
}
