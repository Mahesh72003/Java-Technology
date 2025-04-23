package com.xworkz.slack;

import com.xworkz.slack.dto.SlackDto;

public class SlackRunner {
    public static void main(String[] args) {

        SlackDto slackDto = new SlackDto();
        slackDto.setArea("Bengaluru");
        slackDto.setFullName("Mahesh A V");
        slackDto.setEmailAddress("mahesh@gmail.com");
        slackDto.setPassword("mahesh123");
        slackDto.setUserId("mahesh@2003");

        System.out.println(slackDto.toString());
    }
}
