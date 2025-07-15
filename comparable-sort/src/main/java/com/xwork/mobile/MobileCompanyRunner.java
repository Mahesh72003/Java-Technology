package com.xwork.mobile;

import com.xwork.mobile.dto.MobileCompanyDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileCompanyRunner {
    public static void main(String[] args) {
        List<MobileCompanyDto> mobileList = new ArrayList<>();

        mobileList.add(new MobileCompanyDto("Apple", "iPhone 13", "A15 Bionic", "6GB", "128GB", "2024", true));
        mobileList.add(new MobileCompanyDto("Samsung", "Galaxy S21", "Exynos 2100", "8GB", "128GB", "2025", true));
        mobileList.add(new MobileCompanyDto("Google", "Pixel 6", "Google Tensor", "8GB", "128GB", "2021", true));
        mobileList.add(new MobileCompanyDto("OnePlus", "OnePlus 9", "Snapdragon 888", "12GB", "256GB", "2024", true));
        mobileList.add(new MobileCompanyDto("Xiaomi", "Mi 11", "Snapdragon 888", "8GB", "128GB", "2021", true));
        mobileList.add(new MobileCompanyDto("Oppo", "Find X3 Pro", "Snapdragon 888", "12GB", "256GB", "2022", true));
        mobileList.add(new MobileCompanyDto("Sony", "Xperia 5 III", "Snapdragon 888", "8GB", "128GB", "2019", true));
        mobileList.add(new MobileCompanyDto("Vivo", "V21 5G", "Dimensity 800U", "8GB", "128GB", "2018", true));
        mobileList.add(new MobileCompanyDto("Realme", "Realme GT 5G", "Snapdragon 870", "8GB", "128GB", "2024", true));
        mobileList.add(new MobileCompanyDto("Motorola", "Edge 20 Pro", "Snapdragon 870", "12GB", "256GB", "20215", true));
        mobileList.add(new MobileCompanyDto("Huawei", "P50 Pro", "Kirin 9000", "8GB", "256GB", "2021", true));
        mobileList.add(new MobileCompanyDto("Asus", "ROG Phone 5", "Snapdragon 888", "16GB", "512GB", "2021", true));

        System.out.println("Before Sorting:");
        for (MobileCompanyDto dto : mobileList) {
            System.out.println(dto);
        }

        Collections.sort(mobileList);

        System.out.println("\nAfter Sorting:");
        for (MobileCompanyDto dto : mobileList) {
            System.out.println(dto);
        }
    }
}
