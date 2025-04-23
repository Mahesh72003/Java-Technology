package com.xworkz.olafoods.userdata;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OlaFoodsUserDto {

        private String email;
        private String phoneNumber;
        private String password;
        private String fullName;
        private String deliveryArea;

        @Override
        public String toString() {
                return "OlaFoodsUserDto{" +
                        "email='" + email + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", password='" + password + '\'' +
                        ", fullName='" + fullName + '\'' +
                        ", deliveryArea='" + deliveryArea + '\'' +
                        '}';
        }
}
