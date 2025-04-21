package com.xworkz.passportapp.passportdto;

import com.xworkz.passportapp.constants.Area;
import com.xworkz.passportapp.constants.Location;



@Setter
@Getter

public class PassportDto {

 private Location location;
 private Area area;
 private   String firstName;
  private  String lastName;
   private String birthDate;
   private String email;
    private boolean isEmailSame;
    private String userId;
   private String password;
   private String confirmPassword;
    private String securityQuestion;
    private String securityAnswer;
   private String captcha ;


}
