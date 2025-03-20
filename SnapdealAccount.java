class SnapdealAccount 
{
    public static String accountSignUp(String fullName, String mobileNumber, String email, String cardNo, String cardCvv, String cardName, String password) 
    {
        System.out.println("Inside the accountSignUp");
        boolean ref = false;
        String message = null;

        ref = validateAccountData(fullName, mobileNumber, email, cardNo, cardCvv, cardName, password);
        
        if (ref == true) 
        {
            message = "The Snapdeal Account Registration is Successful";
        } 
        else 
        {
            message = "The Snapdeal Account Registration is Unsuccessful";
        }

        System.out.println("Exiting the accountSignUp");
        return message;
    }

    public static boolean validateAccountData(String fullName, String mobileNumber, String email, String cardNo, String cardCvv, String cardName, String password) 
    {
        System.out.println("Inside the validateAccountData");
        boolean isValid = false;
        boolean isFullNameValid = false;
        boolean isMobileValid = false;
        boolean isEmailValid = false;
        boolean isCardNoValid = false;
        boolean isCardCvvValid = false;
        boolean isCardNameValid = false;
        boolean isPasswordValid = false;

        if (fullName != null && !fullName.isEmpty() && fullName.length() >= 3) 
        {
            isFullNameValid = true;
        } 
        else 
        {
            System.out.println("Full Name is Invalid. Please provide a valid Full Name.");
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
            System.out.println("Email is Invalid. Please provide a valid Email.");
        }

        if (cardNo != null && cardNo.length() == 16) 
        {
            isCardNoValid = true;
        } 
        else 
        {
            System.out.println("Card Number is Invalid. Please provide a valid 16-digit Card Number.");
        }

        if (cardCvv != null && cardCvv.length() == 3) 
        {
            isCardCvvValid = true;
        } 
        else 
        {
            System.out.println("Card CVV is Invalid. Please provide a valid 3-digit Card CVV.");
        }

        if (cardName != null && cardName.length() > 0) 
        {
            isCardNameValid = true;
        } 
        else 
        {
            System.out.println("Card Name is Invalid. Please provide a valid Card Name.");
        }

        if (password != null && password.length() >= 8) 
        {
            isPasswordValid = true;
        } 
        else 
        {
            System.out.println("Password is Invalid. Please provide a valid Password (at least 8 characters).");
        }

        if (isFullNameValid && isMobileValid && isEmailValid && isCardNoValid && isCardCvvValid && isCardNameValid && isPasswordValid)
        {
            isValid = true;
        }

        System.out.println("Exiting the validateAccountData");
        return isValid;
    }
}
