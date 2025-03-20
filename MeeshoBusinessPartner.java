class MeeshoBusinessPartner 
{

    public static String businessPartnerSignUp(String Name, String MobileNumber, String Email, String Password, String PANNumber, String BankAccountNumber, String IFSCCode, String AccountHolderName, String AadhaarCard) 
	{
        System.out.println("Inside the businessPartnerSignUp");
        boolean ref = false;
        String message = null;
        ref = validateBusinessPartnerData(Name, MobileNumber, Email, Password, PANNumber, BankAccountNumber, IFSCCode, AccountHolderName, AadhaarCard);
        
        if (ref == true)
            message = "The Business Partner Registration is Successful";
        else
            message = "The Business Partner Registration is Unsuccessful";
        
        System.out.println("Exiting the businessPartnerSignUp");
        return message;
    }

    public static boolean validateBusinessPartnerData(String Name, String MobileNumber, String Email, String Password, String PANNumber, String BankAccountNumber,String IFSCCode, String AccountHolderName, String AadhaarCard) 
	{
        System.out.println("Inside the validateBusinessPartnerData");
        boolean isValid = false;
        boolean isNameValid = false;
        boolean isMobileValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPANValid = false;
        boolean isBankAccountValid = false;
        boolean isIFSCValid = false;
        boolean isAccountHolderValid = false;
        boolean isAadhaarValid = false;

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

        if (Email != null && Email.length() > 0)
		{
            isEmailValid = true;
        }
		else 
		{
            System.out.println("Email is Invalid. Please provide a valid Email.");
        }

        if (Password != null && Password.length() >= 8) 
		{
            isPasswordValid = true;
        } 
		else 
		{
            System.out.println("Password is Invalid. Please provide a valid Password (at least 6 characters).");
        }

        if (PANNumber != null && PANNumber.length() == 10) 
		{
            isPANValid = true;
        } 
		else
		{
            System.out.println("PAN Number is Invalid. Please provide a valid PAN Number.");
        }

        if (BankAccountNumber != null && BankAccountNumber.length() > 0) 
		{
            isBankAccountValid = true;
        } 
		else 
		{
            System.out.println("Bank Account Number is Invalid. Please provide a valid Bank Account Number.");
        }

        if (IFSCCode != null && IFSCCode.length() > 0) 
		{
            isIFSCValid = true;
        } 
		else 
		{
            System.out.println("IFSC Code is Invalid. Please provide a valid IFSC Code.");
        }

        if (AccountHolderName != null && AccountHolderName.length() > 0) 
		{
            isAccountHolderValid = true;
        } 
		else 
		{
            System.out.println("Account Holder Name is Invalid. Please provide a valid Account Holder Name.");
        }

        if (AadhaarCard != null && AadhaarCard.length() == 12) 
		{
            isAadhaarValid = true;
        } 
		else 
		{
            System.out.println("Aadhaar Card is Invalid. Please provide a valid Aadhaar Card Number.");
        }

        if (isNameValid && isMobileValid&& isEmailValid&& isPasswordValid&& isPANValid&& isBankAccountValid&& isIFSCValid&& isAccountHolderValid&& isAadhaarValid) 
		{
            isValid = true;
        }

        System.out.println("Exiting the validateBusinessPartnerData");
        return isValid;
    }
}
