package com.xwork.laptop;

import com.xwork.laptop.dto.LaptopCompanyDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopCompanyRunner {
    public static void main(String[] args) {
        List<LaptopCompanyDto> laptopList = new ArrayList<>();


        laptopList.add(new LaptopCompanyDto("Dell", "Ultrabook", "Intel i5", "8GB", "256GB SSD", "XPS 13", 2015, false));
        laptopList.add(new LaptopCompanyDto("Apple", "Ultrabook", "Intel i7", "16GB", "512GB SSD", "MacBook Pro 13", 2016, true));
        laptopList.add(new LaptopCompanyDto("HP", "Business", "Intel i7", "8GB", "512GB SSD", "HP Spectre x360", 2017, true));
        laptopList.add(new LaptopCompanyDto("Lenovo", "Business", "Intel i7", "16GB", "1TB SSD", "ThinkPad X1 Carbon", 2018, false));
        laptopList.add(new LaptopCompanyDto("Asus", "Gaming", "AMD Ryzen 5", "16GB", "512GB SSD", "ROG Strix G15", 2019, true));
        laptopList.add(new LaptopCompanyDto("Microsoft", "Ultrabook", "Intel i5", "8GB", "256GB SSD", "Surface Laptop 3", 2020, true));
        laptopList.add(new LaptopCompanyDto("Acer", "Gaming", "Intel i7", "16GB", "1TB SSD", "Predator Helios 300", 2021, false));
        laptopList.add(new LaptopCompanyDto("Samsung", "Ultrabook", "Intel i5", "8GB", "512GB SSD", "Galaxy Book Pro", 2022, true));
        laptopList.add(new LaptopCompanyDto("Razer", "Gaming", "Intel i7", "16GB", "512GB SSD", "Blade 15", 2023, true));
        laptopList.add(new LaptopCompanyDto("Google", "Ultrabook", "Intel i5", "8GB", "256GB SSD", "Pixelbook Go", 2024, true));
        laptopList.add(new LaptopCompanyDto("HP", "Business", "Intel i7", "16GB", "1TB SSD", "Elite Dragonfly", 2025, true));


        System.out.println("Before Sorting:");
        for (LaptopCompanyDto dto : laptopList) {
            System.out.println(dto);
        }


        Collections.sort(laptopList);


        System.out.println("\nAfter Sorting:");
        for (LaptopCompanyDto dto : laptopList) {
            System.out.println(dto);
        }
    }
}
