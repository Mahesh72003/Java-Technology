package com.xworkz.youtubeapp.youtube;

public class YouTubeDto {


        private String userEmail;
        private String channelName;
        private String password;
        private String confirmPassword;
        private long mobile;

        // Setters
        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public void setChannelName(String channelName) {
            this.channelName = channelName;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
        }

        public void setMobile(long mobile) {
            this.mobile = mobile;
        }

        // Getters
        public String getUserEmail() {
            return userEmail;
        }

        public String getChannelName() {
            return channelName;
        }

        public String getPassword() {
            return password;
        }

        public String getConfirmPassword() {
            return confirmPassword;
        }

        public long getMobile() {
            return mobile;
        }
    }


