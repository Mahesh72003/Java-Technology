package com.xworkz.zoomcar.zoomcarDto;

import com.xworkz.zoomcar.constant.Gender;
import com.xworkz.zoomcar.constant.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ZoomcarDto {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private long phoneNo;
    private String password;
    private Gender gender;
    private String dob;
    private String location;
    private String address;
    private String drivingLicenseNumber;
    private String licenseExpiryDate;
    private PaymentMethod paymentMethod;

    @Override
    public String toString() {
        return "ZoomcarDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNo=" + phoneNo +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", dob='" + dob + '\'' +
                ", location='" + location + '\'' +
                ", address='" + address + '\'' +
                ", drivingLicenseNumber='" + drivingLicenseNumber + '\'' +
                ", licenseExpiryDate='" + licenseExpiryDate + '\'' +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
