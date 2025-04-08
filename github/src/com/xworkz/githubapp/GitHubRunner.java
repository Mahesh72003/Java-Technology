package com.xworkz.githubapp;
import com.xworkz.githubapp.userdata.GitHubUserDto;
import com.xworkz.githubapp.signup.GitHub;
public class GitHubRunner
{

        public static void main(String[] args) {
            GitHubUserDto user1 = new GitHubUserDto();
            user1.setEmail("mahesh@github.com");
            user1.setUserName("mahesh01");
            user1.setPassword("GitHubPass@2025");
            user1.setFullName("Mahesh A V");
            user1.setBio("Java backend developer | Open-source contributor");

            GitHub github = new GitHub();
            if (github.userSignUp(user1)) {
                System.out.println("GitHub Registration Successful!");
            } else {
                System.out.println("GitHub Registration Failed!");
            }
        }
    }

