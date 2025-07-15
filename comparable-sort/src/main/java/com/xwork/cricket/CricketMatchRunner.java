package com.xwork.cricket;

import com.xwork.cricket.dto.CricketMatchDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CricketMatchRunner {
    public static void main(String[] args) {
        List<CricketMatchDto> matchList = new ArrayList<>();

        matchList.add(new CricketMatchDto(2024, "Wankhede Stadium, Mumbai", "Australia", "ODI", "Virat Kohli"));
        matchList.add(new CricketMatchDto(2023, "Lord's Cricket Ground, London", "England", "Test", "Rishabh Pant"));
        matchList.add(new CricketMatchDto(2023, "M. Chinnaswamy Stadium, Bangalore", "Pakistan", "T20", "Suryakumar Yadav"));
        matchList.add(new CricketMatchDto(2022, "Eden Gardens, Kolkata", "Sri Lanka", "ODI", "Shubman Gill"));
        matchList.add(new CricketMatchDto(2021, "The Gabba, Brisbane", "Australia", "Test", "Ajinkya Rahane"));
        matchList.add(new CricketMatchDto(2020, "Melbourne Cricket Ground, Melbourne", "New Zealand", "ODI", "Hardik Pandya"));
        matchList.add(new CricketMatchDto(2021, "Dubai International Stadium", "Afghanistan", "T20", "KL Rahul"));
        matchList.add(new CricketMatchDto(2022, "Rajkot", "South Africa", "ODI", "Ruturaj Gaikwad"));
        matchList.add(new CricketMatchDto(2023, "Eden Park, Auckland", "New Zealand", "T20", "Ishan Kishan"));
        matchList.add(new CricketMatchDto(2024, "Sharjah Cricket Stadium", "UAE", "ODI", "Ravindra Jadeja"));
        matchList.add(new CricketMatchDto(2023, "Wankhede Stadium, Mumbai", "South Africa", "Test", "Cheteshwar Pujara"));
        matchList.add(new CricketMatchDto(2024, "The Oval, London", "England", "T20", "Rishabh Pant"));

        System.out.println("Before Sorting:");
        for (CricketMatchDto dto : matchList) {
            System.out.println(dto);
        }

        Collections.sort(matchList);

        System.out.println("\nAfter Sorting:");
        for (CricketMatchDto dto : matchList) {
            System.out.println(dto);
        }
    }
}
