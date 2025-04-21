package com.xworkz.youtubeapp;
import com.xworkz.youtubeapp.youtube.YouTubeDto;
import com.xworkz.youtubeapp.loginuser.YouTubeLogIn;

public class YouTubeRunner {


        public static void main(String[] args) {

            YouTubeDto user = new YouTubeDto();
            user.setUserEmail("creatorvanjre@example.com");
            user.setChannelName("TechWithmahesh");
            user.setPassword("maheshyoutube123");
            user.setConfirmPassword("maheshyoutube123");
            user.setMobile(9876543210L);

            YouTubeLogIn login = new YouTubeLogIn();
            login.startSignIn(user);
            login.displayUserDetails(user);

        }
    }


