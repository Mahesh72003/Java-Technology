package com.xwork.telecomcompany;

import com.xwork.telecomcompany.dto.TelecomCompanyDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TelecomCompanyRunner {
    public static void main(String[] args) {
        List<TelecomCompanyDto> telecomList = new ArrayList<>();


        telecomList.add(new TelecomCompanyDto("Reliance Jio", "Reliance Industries (Mukesh Ambani)", "India", "5G", 420));
        telecomList.add(new TelecomCompanyDto("Airtel (Bharti Airtel)", "Bharti Enterprises (Sunil Bharti Mittal)", "India", "5G", 380));
        telecomList.add(new TelecomCompanyDto("Vodafone Idea (Vi)", "Vodafone Group & Aditya Birla Group", "India", "4G", 250));
        telecomList.add(new TelecomCompanyDto("BSNL (Bharat Sanchar Nigam Limited)", "Government of India", "India", "4G", 120));
        telecomList.add(new TelecomCompanyDto("China Mobile", "China Mobile Communications Group Corporation (State-Owned)", "China", "5G", 1200));
        telecomList.add(new TelecomCompanyDto("AT&T", "AT&T Inc.", "USA", "5G", 190));
        telecomList.add(new TelecomCompanyDto("Verizon", "Verizon Communications Inc.", "USA", "5G", 120));
        telecomList.add(new TelecomCompanyDto("Deutsche Telekom (T-Mobile)", "Deutsche Telekom AG", "Germany", "5G", 95));
        telecomList.add(new TelecomCompanyDto("Vodafone Group", "Vodafone Group Plc", "UK", "5G", 300));
        telecomList.add(new TelecomCompanyDto("Orange S.A.", "Orange Group (Publicly listed)", "France", "5G", 220));


        System.out.println("Before Sorting:");
        for (TelecomCompanyDto dto : telecomList) {
            System.out.println(dto);
        }


        Collections.sort(telecomList);


        System.out.println("After Sorting:");
        for (TelecomCompanyDto dto : telecomList) {
            System.out.println(dto);
        }
    }
}
