package com.xworkz.ubereatsapp.userdata;

public class UberEatsUserDto {

        private String email;
        private String phoneNumber;
        private String password;
        private String fullName;
        private String deliveryAddress;

        public UberEatsUserDto() {
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getFullName() {
            return fullName;
        }

        public void setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
        }

        public String getDeliveryAddress() {
            return deliveryAddress;
        }
    }


