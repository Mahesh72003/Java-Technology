package com.xworkz.appleapp.apple;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AppleDto {
    private String appleId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString(){
        return "AppleDto: " +
                "\nappleId:- "+this.appleId + ","+
                "\nuserName:- "+this.userName + ","+
                "\nemail:- "+this.email + ","+
                "\npassword:- "+this.password + ","+
                "\nconfirmPassword:- "+this.confirmPassword + ","+
                "\ncontactNumber:- "+this.contactNumber;
    }
}
