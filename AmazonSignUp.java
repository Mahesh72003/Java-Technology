class AmazonSignUp 
{
    public static String userProfileSignUp(String Name, String MobileNumber, String Password, String ConfirmPassword, String Email) 
	{
        System.out.println("Inside the userProfileSignUp");
        boolean ref = false;
        String message = null;
        
        ref = validateUserProfile(Name, MobileNumber, Password, ConfirmPassword, Email);
        
        if (ref == true)
            message = "The User Account Registration Successful";
        else
            message = "The User Account Registration Unsuccessful";
        
        System.out.println("Exiting the userProfileSignUp");
        return message;
    }

    public static boolean validateUserProfile(String Name, String MobileNumber, String Password, String ConfirmPassword, String Email) 
	{
        System.out.println("Inside the validateUserProfile");
        boolean isValid = false;
        boolean isNameValid = false;
        boolean isMobileValid = false;
        boolean isPasswordValid = false;
        boolean isConfirmPasswordValid = false;
        boolean isEmailValid = false;
        
        if (Name != null && !Name.isEmpty() && Name.length() >= 3) 
		{
            isNameValid = true;
        } 
		else 
		{
            System.out.println("Name is Invalid Input. Please provide a valid Name.");
        }

        if (MobileNumber != null && MobileNumber.length() == 10) 
		{
            isMobileValid = true;
        } 
		else 
		{
            System.out.println("Mobile Number is Invalid Input. Please provide a valid Mobile Number.");
        }

        if (Password != null && Password.length() >= 8) 
		{
            isPasswordValid = true;
        } 
		else 
		{
            System.out.println("Password is Invalid. Please provide a valid Password (at least 6 characters).");
        }

        if (ConfirmPassword != null && ConfirmPassword == Password) 
		{
            isConfirmPasswordValid = true;
        } 
		else 
		{
            System.out.println("Confirm Password does not match Password. Please provide a valid Confirm Password.");
        }

        if (Email != null && !Email.isEmpty()) 
		{
            isEmailValid = true;
        } 
		else 
		{
            System.out.println("Email is Invalid. Please provide a valid Email.");
        }

        if (isNameValid&& isMobileValid && isPasswordValid&& isConfirmPasswordValid&& isEmailValid)
		{
            isValid = true;
        }

        System.out.println("Exiting the validateUserProfile");
        return isValid;
    }
}
