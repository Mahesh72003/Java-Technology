package com.xworkz.swiggy.swiggyDto;

import com.xworkz.swiggy.constant.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SwiggyDto {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private long phoneNo;
    private String password;
    private Gender gender;
    private String dob;
    private String location;
    private String address;

    @Override
    public String toString() {
        return "SwiggyDto: " +
                "\nfirstName :- " + this.firstName + "," +
                "\nlastName :- " + this.lastName + "," +
                "\nemailAddress :- " + this.emailAddress + "," +
                "\nphoneNo :- " + this.phoneNo + "," +
                "\npassword :- " + this.password + "," +
                "\ngender :- " + this.gender + "," +
                "\ndob :- " + this.dob + "," +
                "\nlocation :- " + this.location + "," +
                "\naddress :- " + this.address + ",";
    }
}
