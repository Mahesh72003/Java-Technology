package com.xwork.biscuit;

import com.xwork.biscuit.dto.BiscuitCompanyDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiscuitCompanyRunner {
    public static void main(String[] args) {
        List<BiscuitCompanyDto> biscuitList = new ArrayList<>();


        biscuitList.add(new BiscuitCompanyDto("Parle Products", "Parle Agro Pvt. Ltd.", "India", 1929, "Parle-G", 10000));
        biscuitList.add(new BiscuitCompanyDto("Britannia", "Britannia Industries", "India", 1892, "Marie Gold", 9000));
        biscuitList.add(new BiscuitCompanyDto("Oreo", "Mondelez International", "USA", 1912, "Oreo", 4500));
        biscuitList.add(new BiscuitCompanyDto("Nestlé", "Nestlé S.A.", "Switzerland", 1867, "Kit Kat Biscuits", 8000));
        biscuitList.add(new BiscuitCompanyDto("McVitie's", "United Biscuits", "UK", 1830, "Digestives", 5000));
        biscuitList.add(new BiscuitCompanyDto("LU Biscuits", "Mondelez International", "France", 1850, "LU Crackers", 3000));
        biscuitList.add(new BiscuitCompanyDto("Cookie Time", "Cookie Time Ltd.", "New Zealand", 1983, "Cookie Time", 200));
        biscuitList.add(new BiscuitCompanyDto("United Biscuits", "Kellogg Company", "UK", 1948, "Rich Tea", 4000));
        biscuitList.add(new BiscuitCompanyDto("Dare", "George Weston Limited", "Canada", 1892, "Tim Tam", 3500));
        biscuitList.add(new BiscuitCompanyDto("Pladis", "Yildiz Holding", "Turkey", 2014, "McVitie’s Digestives", 7000));


        System.out.println("Before Sorting:");
        for (BiscuitCompanyDto dto : biscuitList) {
            System.out.println(dto);
        }


        Collections.sort(biscuitList);


        System.out.println("\nAfter Sorting:");
        for (BiscuitCompanyDto dto : biscuitList) {
            System.out.println(dto);
        }
    }
}
