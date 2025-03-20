class FlipkartAccount 
{

    public static String accountSignUp(String firstName, String lastName, String email, String phoneNumber, String shippingAddress, String password) 
	{
        System.out.println("Inside the accountSignUp");
        boolean ref = false;
        String message = null;

        ref = validateAccountData(firstName, lastName, email, phoneNumber, shippingAddress, password);
        
        if (ref == true)
            message = "The Flipkart Account Registration is Successful";
        else
            message = "The Flipkart Account Registration is Unsuccessful";
        
        System.out.println("Exiting the accountSignUp");
        return message;
    }

    public static boolean validateAccountData(String firstName, String lastName, String email,String phoneNumber, String shippingAddress, String password) 
	{
        System.out.println("Inside the validateAccountData");
        boolean isValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isShippingAddressValid = false;
        boolean isPasswordValid = false;

        if (firstName != null && !firstName.isEmpty() && firstName.length() >= 3) 
		{
            isFirstNameValid = true;
        } 
		else
		{
            System.out.println("First Name is Invalid. Please provide a valid First Name.");
        }

        if (lastName != null && !lastName.isEmpty() && lastName.length() >= 1) 
		{
            isLastNameValid = true;
        } 
		else 
		{
            System.out.println("Last Name is Invalid. Please provide a valid Last Name.");
        }

        if (email != null && email.length() > 0 )
		{
            isEmailValid = true;
        } 
		else 
		{
            System.out.println("Email is Invalid. Please provide a valid Email.");
        }

        if (phoneNumber != null && phoneNumber.length() == 10) 
		{
            isPhoneValid = true;
        } 
		else 
		{
            System.out.println("Phone Number is Invalid. Please provide a valid Phone Number.");
        }

        if (shippingAddress != null && shippingAddress.length() > 0)
		{
            isShippingAddressValid = true;
        } 
		else 
		{
            System.out.println("Shipping Address is Invalid. Please provide a valid Shipping Address.");
        }

        if (password != null && !password.isEmpty() && password.length() >= 8) 
		{
            isPasswordValid = true;
        } 
		else
		{
            System.out.println("Password is Invalid. Please provide a valid Password (at least 8 characters).");
        }

        if (isFirstNameValid&& isLastNameValid&& isEmailValid&& isPhoneValid&& isShippingAddressValid&& isPasswordValid) 
		{
            isValid = true;
        }

        System.out.println("Exiting the validateAccountData");
        return isValid;
    }
}
