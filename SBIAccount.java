class SBIAccount 
{
    public static String accountSignUp(String fullName, String mobileNumber, String alternativeMobileNumber, String email, String dob, String panNumber, String aadhaarCard) 
    {
        System.out.println("Inside the accountSignUp");
        boolean ref = false;
        String message = null;

        ref = validateAccountData(fullName, mobileNumber, alternativeMobileNumber, email, dob, panNumber, aadhaarCard);
        
        if (ref == true) 
        {
            message = "The SBI Account Registration is Successful";
        } 
        else 
        {
            message = "The SBI Account Registration is Unsuccessful";
        }

        System.out.println("Exiting the accountSignUp");
        return message;
    }

    public static boolean validateAccountData(String fullName, String mobileNumber, String alternativeMobileNumber, String email, String dob, String panNumber, String aadhaarCard) 
    {
        System.out.println("Inside the validateAccountData");
        boolean isValid = false;
        boolean isFullNameValid = false;
        boolean isMobileValid = false;
        boolean isAlternativeMobileValid = false;
        boolean isEmailValid = false;
        boolean isDOBValid = false;
        boolean isPANValid = false;
        boolean isAadhaarCardValid = false;

        if (fullName != null&& !fullName.isEmpty() && fullName.length() >= 3) 
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

        if (alternativeMobileNumber != null && alternativeMobileNumber.length() == 10) 
        {
            isAlternativeMobileValid = true;
        } 
        else 
        {
            System.out.println("Alternative Mobile Number is Invalid. Please provide a valid Alternative Mobile Number.");
        }

        if (email != null && email.length() > 0) 
        {
            isEmailValid = true;
        } 
        else 
        {
            System.out.println("Email is Invalid. Please provide a valid Email.");
        }

        if (dob != null && dob.length() > 0) 
        {
            isDOBValid = true;
        } 
        else 
        {
            System.out.println("Date of Birth is Invalid. Please provide a valid Date of Birth.");
        }

        if (panNumber != null && panNumber.length() == 10) 
        {
            isPANValid = true;
        } 
        else 
        {
            System.out.println("PAN Number is Invalid. Please provide a valid PAN Number.");
        }

        if (aadhaarCard != null && aadhaarCard.length() == 12) 
        {
            isAadhaarCardValid = true;
        } 
        else 
        {
            System.out.println("Aadhaar Card is Invalid. Please provide a valid Aadhaar Card number.");
        }

        if (isFullNameValid && isMobileValid && isAlternativeMobileValid && isEmailValid && isDOBValid && isPANValid && isAadhaarCardValid)

        {
            isValid = true;
        }

        System.out.println("Exiting the validateAccountData");
        return isValid;
    }
}
