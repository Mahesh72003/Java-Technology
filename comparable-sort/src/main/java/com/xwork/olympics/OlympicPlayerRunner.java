package com.xwork.olympics;

import com.xwork.olympics.dto.OlympicPlayerDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OlympicPlayerRunner {
    public static void main(String[] args) {
        List<OlympicPlayerDto> playerList = new ArrayList<>();

        playerList.add(new OlympicPlayerDto("Neeraj Chopra", "Javelin Throw", 1, "Male", "Paris", "Haryana"));
        playerList.add(new OlympicPlayerDto("Mirabai Chanu", "Weightlifting", 2, "Female", "Paris", "Manipur"));
        playerList.add(new OlympicPlayerDto("PV Sindhu", "Badminton", 3, "Female", "Paris", "Telangana"));
        playerList.add(new OlympicPlayerDto("Vinesh Phogat", "Wrestling", 1, "Female", "Paris", "Haryana"));
        playerList.add(new OlympicPlayerDto("Manu Bhaker", "Shooting", 5, "Female", "Paris", "Haryana"));
        playerList.add(new OlympicPlayerDto("Satish Kumar", "Boxing", 6, "Male", "Paris", "Haryana"));
        playerList.add(new OlympicPlayerDto("Deepika Kumari", "Archery", 7, "Female", "Paris", "Ranchi"));
        playerList.add(new OlympicPlayerDto("Shivpal Singh", "Javelin Throw", 8, "Male", "Paris", "Uttar Pradesh"));
        playerList.add(new OlympicPlayerDto("Ravi Dahiya", "Wrestling", 2, "Male", "Paris", "Haryana"));
        playerList.add(new OlympicPlayerDto("Dutee Chand", "Sprint", 4, "Female", "Paris", "Odisha"));
        playerList.add(new OlympicPlayerDto("Bajrang Punia", "Wrestling", 3, "Male", "Paris", "Haryana"));
        playerList.add(new OlympicPlayerDto("Achanta Sharath Kamal", "Table Tennis", 9, "Male", "Paris", "Tamil Nadu"));

        System.out.println("Before Sorting:");
        for (OlympicPlayerDto dto : playerList) {
            System.out.println(dto);
        }

        Collections.sort(playerList);

        System.out.println("\nAfter Sorting:");
        for (OlympicPlayerDto dto : playerList) {
            System.out.println(dto);
        }
    }
}
