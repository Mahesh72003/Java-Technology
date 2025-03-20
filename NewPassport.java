class NewPassport 
{

    public static String passportSignUp(String cpvLocation, String dcdrLocation, String givenName, String surname, String dob, String email, boolean emailloginSame, String loginId, String pwd, String confirmPwd, String hintQues, String hintAns) 
	{
        System.out.println("Inside the passportSignUp");
        boolean ref = false;
        String message = null;

        ref = validatePassportData(cpvLocation, dcdrLocation, givenName, surname, dob, email, emailloginSame, loginId, pwd, confirmPwd, hintQues, hintAns);

        if (ref == true) 
		{
            message = "The Passport Registration is Successful";
        }
		else 
		{
            message = "    The Passport Registration is Unsuccessful";
        }

        System.out.println("Exiting the passportSignUp");
        return message;
    }

    public static boolean validatePassportData(String cpvLocation, String dcdrLocation, String givenName, String surname, String dob, String email, boolean emailloginSame, String loginId, String pwd, String confirmPwd, String hintQues, String hintAns) 
	{
        System.out.println("Inside the validatePassportData");
        boolean isValid = false;
        boolean isCpvLocationValid = false;
        boolean isDcdrLocationValid = false;
        boolean isGivenNameValid = false;
        boolean isSurnameValid = false;
        boolean isDOBValid = false;
        boolean isEmailValid = false;
        boolean isEmailLoginValid = false;
        boolean isLoginIdValid = false;
        boolean isPwdValid = false;
        boolean isConfirmPwdValid = false;
        boolean isHintQuesValid = false;
        boolean isHintAnsValid = false;

        if (cpvLocation != null&& !cpvLocation.isEmpty() && cpvLocation.length() > 0) 
		{
            isCpvLocationValid = true;
        } 
		else 
		{
            System.out.println("CPV Location is Invalid. Please provide a valid CPV Location.");
        }

        if (dcdrLocation != null&&!dcdrLocation.isEmpty() && dcdrLocation.length() > 0)
		{
            isDcdrLocationValid = true;
        } 
		else 
		{
            System.out.println("DCDR Location is Invalid. Please provide a valid DCDR Location.");
        }

        if (givenName != null&&!givenName.isEmpty() && givenName.length() > 0)
		{
            isGivenNameValid = true;
        } 
		else 
		{
            System.out.println("Given Name is Invalid. Please provide a valid Given Name.");
        }

        if (surname != null&& !surname.isEmpty() && surname.length() > 0) 
		{
            isSurnameValid = true;
        } 
		else 
		{
            System.out.println("Surname is Invalid. Please provide a valid Surname.");
        }

        if (dob != null && dob.length() > 0) 
		{
            isDOBValid = true;
        } 
		else 
		{
            System.out.println("Date of Birth is Invalid. Please provide a valid Date of Birth.");
        }

        if (email != null && email.isEmpty())
		{
            isEmailValid = true;
        } 
		else 
		{
            System.out.println("Email is Invalid. Please provide a valid Email.");
        }

        if (emailloginSame == true && loginId==email) 
		{
            isEmailLoginValid = true;
        } 
		else 
		{
            System.out.println("Email login does not match. Please provide a matching login ID.");
        }

        if (loginId != null && loginId.length() > 0) 
		{
            isLoginIdValid = true;
        } 
		else 
		{
            System.out.println("Login ID is Invalid. Please provide a valid Login ID.");
        }

        if (pwd != null && pwd.length() >= 8) 
		{
            isPwdValid = true;
        } 
		else 
		{
            System.out.println("Password is Invalid. Please provide a valid Password (minimum 8 characters).");
        }

        if (confirmPwd != null && confirmPwd == pwd) 
		{
            isConfirmPwdValid = true;
        } 
		else 
		{
            System.out.println("Confirm Password does not match. Please provide a matching Confirm Password.");
        }

        if (hintQues != null && hintQues.length() > 0) 
		{
            isHintQuesValid = true;
        } 
		else 
		{
            System.out.println("Hint Question is Invalid. Please provide a valid Hint Question.");
        }

        if (hintAns != null && hintAns.length() > 0)
		{
            isHintAnsValid = true;
        } 
		else 
		{
            System.out.println("Hint Answer is Invalid. Please provide a valid Hint Answer.");
        }

        if (isCpvLocationValid&& isDcdrLocationValid&& isGivenNameValid   && isSurnameValid   && isDOBValid  && isEmailValid   && isEmailLoginValid  && isLoginIdValid && isPwdValid  && isConfirmPwdValid && isHintQuesValid&& isHintAnsValid) 
		{
            isValid = true;
        }
		

        System.out.println("Exiting the validatePassportData");
        return isValid;
    }
}

