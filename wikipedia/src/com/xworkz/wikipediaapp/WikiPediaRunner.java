package com.xworkz.wikipediaapp;

import com.xworkz.wikipediaapp.wikipedia.WikiPediaDto;
import com.xworkz.wikipediaapp.login.WikipediaLogIn;

public class WikiPediaRunner {


        public static void main(String[] args) {

            WikiPediaDto wikiUser = new WikiPediaDto();
            wikiUser.setEmail("mahesh@example.com");
            wikiUser.setUserName("wikimahesh123");
            wikiUser.setUserPassword("mahesh@123");
            wikiUser.setRetypePassword("mahesh@123");
            wikiUser.setPreferredLanguage("English");

            WikipediaLogIn login = new WikipediaLogIn();
            login.processLogin(wikiUser);
            login.displayUserDetails(wikiUser);


        }
    }


