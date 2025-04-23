package com.xworkz.canvaapp.userdata;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CanvaUserDto {

        private String email;
        private String userName;
        private String password;
        private String fullName;
        private String accountType;

        @Override
        public String toString() {
                return "CanvaUserDto: " +
                        "\nEmail: " + this.email + "," +
                        "\nUserName: " + this.userName + "," +
                        "\nPassword: " + this.password + "," +
                        "\nFull Name: " + this.fullName + "," +
                        "\nAccount Type: " + this.accountType;
        }
}
