package com.xworkz.nykaaapp.userlogin;

import com.xworkz.nykaaapp.nykaa.NykaaDto;

public class NykaaUserLogIn {
    public boolean userlogIn(NykaaDto nykaaDto){
        boolean isUserLogin = false;

        boolean var = validateUserLogIn(nykaaDto);
        if(var == true)
            isUserLogin = true;

        else System.out.println("User is not registered ..Try again later");
        return isUserLogin;
    }




    public static boolean validateUserLogIn( NykaaDto nykaaDto)
    {
        boolean validLogIn = false;
        boolean isemailId = false;
        boolean isname = false;
        boolean ismobileNumber = false;
        boolean ispassWord = false;

//emailId
        String emailId = nykaaDto.getEmailId();
        if(emailId != null && !emailId.isEmpty())
        {
            isemailId = true;
        }
        else{
            System.out.println("EmailId is invalid...please provide correct emailId");
        }

//name
        String name = nykaaDto.getName();
        if(name != null && !name.isEmpty() && name.length() >=4){
            isname = true;
        }
        else{
            System.out.println("Invalid name...please enter the correct name");
        }

//mobileNumber
        String mobileNumber = nykaaDto.getMobileNumber();
        if(mobileNumber != null && !mobileNumber.isEmpty() &&  mobileNumber.length() == 10){
            ismobileNumber = true;
        }
        else{
            System.out.println("mobileNumber is not valid");
        }

//passWord
        String passWord = nykaaDto.getPassWord();
        if(passWord !=null && !passWord.isEmpty() && passWord.length() > 8 ){
            ismobileNumber = true;
        }
        else{
            System.out.println("Incorrect passWord");
        }

        if(isemailId == true && isname == true && ismobileNumber == true && ispassWord == true){
            validLogIn = true;
        }
        return validLogIn;
    }
}

