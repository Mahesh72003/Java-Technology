package com.xworkz.ajio.ajioDto;

import com.xworkz.ajio.constant.Gender;
import com.xworkz.ajio.constant.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class AjioDto
{
    private String name;
    private String emailAddress;
    private long phoneNo;
    private String password;
    private Gender gender;
    private String dob;
    private String location;
    private String address;
    private PaymentMethod paymentMethod;

    @Override
    public String toString(){
        return "AjioDto: " +
                "\nName:- "+this.name+","+
                "\nemailAddress :- "+this.emailAddress+","+
                "\nphoneNo :- "+this.phoneNo +","+
                "\npassword :- "+this.password +","+
                "\ngender :- "+this.gender +","+
                "\ndob :- "+this.dob +","+
                "\nlocation :- "+this.location +","+
                "\naddress :- "+this.address +","+
                "\npaymentMethod :- "+this.paymentMethod +",";
    }

}
