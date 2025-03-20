class OLAAccount 
{
    public static String accountSignUp(String fullName, String mobileNumber, String dob, String city, String vehicleMake, String vehicleModel, String vehicleRegistrationNumber, String vehicleRC, String driversLicense, String puc, String bankAccountDetails, String panCard, String aadhaarCard) 
    {
        System.out.println("Inside the accountSignUp");
        boolean ref = false;
        String message = null;

        ref = validateAccountData(fullName, mobileNumber, dob, city, vehicleMake, vehicleModel, vehicleRegistrationNumber, vehicleRC, driversLicense, puc, bankAccountDetails, panCard, aadhaarCard);
        
        if (ref == true) 
        {
            message = "The OLA Partner Account Registration is Successful";
        } 
        else 
        {
            message = "The OLA Partner Account Registration is Unsuccessful";
        }

        System.out.println("Exiting the accountSignUp");
        return message;
    }

    public static boolean validateAccountData(String fullName, String mobileNumber, String dob, String city, String vehicleMake, String vehicleModel, String vehicleRegistrationNumber, String vehicleRC, String driversLicense, String puc, String bankAccountDetails, String panCard, String aadhaarCard) 
    {
        System.out.println("Inside the validateAccountData");
        boolean isValid = false;
        boolean isFullNameValid = false;
        boolean isMobileValid = false;
        boolean isDOBValid = false;
        boolean isCityValid = false;
        boolean isVehicleMakeValid = false;
        boolean isVehicleModelValid = false;
        boolean isVehicleRegistrationNumberValid = false;
        boolean isVehicleRCValid = false;
        boolean isDriversLicenseValid = false;
        boolean isPUCValid = false;
        boolean isBankAccountDetailsValid = false;
        boolean isPanCardValid = false;
        boolean isAadhaarCardValid = false;

        if (fullName != null&& !fullName.isEmpty()) 
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

        if (dob != null && dob.length() > 0) 
        {
            isDOBValid = true;
        } 
        else 
        {
            System.out.println("Date of Birth is Invalid. Please provide a valid Date of Birth.");
        }

        if (city != null && city.length() > 0) 
        {
            isCityValid = true;
        } 
        else 
        {
            System.out.println("City is Invalid. Please provide a valid City.");
        }

        if (vehicleMake != null && vehicleMake.length() > 0) 
        {
            isVehicleMakeValid = true;
        } 
        else 
        {
            System.out.println("Vehicle Make is Invalid. Please provide a valid Vehicle Make.");
        }

        if (vehicleModel != null && vehicleModel.length() > 0) 
        {
            isVehicleModelValid = true;
        } 
        else 
        {
            System.out.println("Vehicle Model is Invalid. Please provide a valid Vehicle Model.");
        }

        if (vehicleRegistrationNumber != null && vehicleRegistrationNumber.length() > 0) 
        {
            isVehicleRegistrationNumberValid = true;
        } 
        else 
        {
            System.out.println("Vehicle Registration Number is Invalid. Please provide a valid Vehicle Registration Number.");
        }

        if (vehicleRC != null && vehicleRC.length() > 0) 
        {
            isVehicleRCValid = true;
        } 
        else 
        {
            System.out.println("Vehicle RC is Invalid. Please provide a valid Vehicle RC.");
        }

        if (driversLicense != null && driversLicense.length() > 0) 
        {
            isDriversLicenseValid = true;
        } 
        else 
        {
            System.out.println("Driver’s License is Invalid. Please provide a valid Driver’s License.");
        }

        if (puc != null && puc.length() > 0) 
        {
            isPUCValid = true;
        } 
        else 
        {
            System.out.println("PUC (Pollution Under Control) is Invalid. Please provide a valid PUC certificate.");
        }

        if (bankAccountDetails != null && bankAccountDetails.length() > 0) 
        {
            isBankAccountDetailsValid = true;
        } 
        else 
        {
            System.out.println("Bank Account Details are Invalid. Please provide valid Bank Account Details.");
        }

        if (panCard != null && panCard.length() > 0) 
        {
            isPanCardValid = true;
        } 
        else 
        {
            System.out.println("Pan Card is Invalid. Please provide a valid Pan Card.");
        }

        if (aadhaarCard != null && aadhaarCard.length() >12) 
        {
            isAadhaarCardValid = true;
        } 
        else 
        {
            System.out.println("Aadhaar Card is Invalid. Please provide a valid Aadhaar Card.");
        }

       if (isFullNameValid && isMobileValid && isDOBValid && isCityValid && isVehicleMakeValid && isVehicleModelValid && isVehicleRegistrationNumberValid && isVehicleRCValid && isDriversLicenseValid && isPUCValid && isBankAccountDetailsValid && isPanCardValid && isAadhaarCardValid)
        {
            isValid = true;
        }

        System.out.println("Exiting the validateAccountData");
        return isValid;
    }
}
