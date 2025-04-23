package com.xworkz.passportapp.passportdto;

import com.xworkz.passportapp.constants.Area;
import com.xworkz.passportapp.constants.Location;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PassportDto {

 private Location location;
 private Area area;
 private String firstName;
 private String lastName;
 private String birthDate;
 private String email;
 private boolean isEmailSame;
 private String userId;
 private String password;
 private String confirmPassword;
 private String securityQuestion;
 private String securityAnswer;
 private String captcha;

 @Override
 public String toString() {
  return "PassportDto{" +
          " \nlocation=" + location +
          ", \narea=" + area +
          ", \nfirstName='" + firstName +
          ", \nlastName='" + lastName +
          ", \nbirthDate='" + birthDate +
          ", \nemail='" + email +
          ", \nisEmailSame=" + isEmailSame +
          ", \nuserId='" + userId   +
          ", \npassword='" + password   +
          ", \nconfirmPassword='" + confirmPassword   +
          ", \nsecurityQuestion='" + securityQuestion   +
          ", \nsecurityAnswer='" + securityAnswer   +
          ", \ncaptcha='" + captcha   +
          '}';
 }
}
