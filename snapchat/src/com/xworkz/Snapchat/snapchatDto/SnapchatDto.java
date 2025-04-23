package com.xworkz.Snapchat.snapchatDto;

import com.xworkz.Snapchat.constant.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SnapchatDto {
    private String firstName;
    private String lastName;
    private String username;
    private String emailAddress;
    private String password;
    private Gender gender;
    private long phoneNo;
    private String dob;
    private String captcha;

    @Override
    public String toString() {
        return "SnapchatDto{" +
                "\nfirstName=" + firstName +
                ", \nlastName=" + lastName +
                ", \nusername=" + username +
                ", \nemailAddress=" + emailAddress +
                ", \npassword=" + password +
                ", \ngender=" + gender +
                ", \nphoneNo=" + phoneNo +
                ", \ndob=" + dob +
                ", \ncaptcha=" + captcha +
                "\n}";
    }
}
