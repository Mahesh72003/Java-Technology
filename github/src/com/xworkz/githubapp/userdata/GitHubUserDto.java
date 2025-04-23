package com.xworkz.githubapp.userdata;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GitHubUserDto {

        private String email;
        private String userName;
        private String password;
        private String fullName;
        private String bio;

        @Override
        public String toString() {
                return "GitHubUserDto: " +
                        "\nEmail: " + this.email + "," +
                        "\nUser Name: " + this.userName + "," +
                        "\nPassword: " + this.password + "," +
                        "\nFull Name: " + this.fullName + "," +
                        "\nBio: " + this.bio;
        }
}
