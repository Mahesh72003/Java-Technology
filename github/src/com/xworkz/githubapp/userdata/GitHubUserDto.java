package com.xworkz.githubapp.userdata;

public class GitHubUserDto
{


        private String email;
        private String userName;
        private String password;
        private String fullName;
        private String bio;

        public GitHubUserDto() {
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
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

        public void setBio(String bio) {
            this.bio = bio;
        }

        public String getBio() {
            return bio;
        }
    }



