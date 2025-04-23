package com.xworkz.telegram;

import com.xworkz.telegram.dto.TelegramDto;

public class TelegramRunner {
    public static void main(String[] args) {

        TelegramDto telegramDto = new TelegramDto();
        telegramDto.setName("Mahesh A V");
        telegramDto.setUsername("mahesh@2003");
        telegramDto.setPhoneNumber(890463382L);
        telegramDto.setPassword("mahesh123");
        telegramDto.setLocation("Rajajinagar");

        System.out.println(telegramDto.toString());
    }
}
