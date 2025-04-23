package com.xworkz.netflixapp.netflix;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NetflixDto {

        private String userId;
        private String userName;
        private String email;
        private String password;
        private String confirmPassword;
        private long mobileNumber;

        @Override
        public String toString() {
                return "NetflixDto: " +
                        "\nUser ID: " + this.userId + "," +
                        "\nUser Name: " + this.userName + "," +
                        "\nEmail: " + this.email + "," +
                        "\nPassword: " + this.password + "," +
                        "\nConfirm Password: " + this.confirmPassword + "," +
                        "\nMobile Number: " + this.mobileNumber;
        }
}
