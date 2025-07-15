package com.xwork.os;

import com.xwork.os.dto.OperatingSystemDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OperatingSystemRunner {
    public static void main(String[] args) {
        List<OperatingSystemDto> osList = new ArrayList<>();

        osList.add(new OperatingSystemDto("Windows 10", 2015, "Microsoft", "Desktop", "Personal use", 15, "2 GB"));
        osList.add(new OperatingSystemDto("macOS Monterey", 2021, "Apple", "Desktop", "Personal use", 12, "4 GB"));
        osList.add(new OperatingSystemDto("Ubuntu 20.04", 2020, "Canonical", "Desktop", "Personal use", 2, "2 GB"));
        osList.add(new OperatingSystemDto("Android 11", 2020, "Google", "Mobile", "Mobile use", 4, "2 GB"));
        osList.add(new OperatingSystemDto("iOS 15", 2021, "Apple", "Mobile", "Mobile use", 3, "2 GB"));
        osList.add(new OperatingSystemDto("Windows Server 2019", 2018, "Microsoft", "Server", "Enterprise use", 40, "8 GB"));
        osList.add(new OperatingSystemDto("Fedora 34", 2021, "Red Hat", "Desktop", "Developer and personal use", 5, "2 GB"));
        osList.add(new OperatingSystemDto("Red Hat Enterprise Linux", 1994, "Red Hat", "Server", "Enterprise use", 5, "2 GB"));
        osList.add(new OperatingSystemDto("Windows 95", 1995, "Microsoft", "Desktop", "Personal use", 2, "8 MB"));
        osList.add(new OperatingSystemDto("Linux Kernel 1.0", 1994, "Linus Torvalds", "Desktop", "Developer use", 0.5, "4 MB"));
        osList.add(new OperatingSystemDto("Mac OS 9", 1999, "Apple", "Desktop", "Personal use", 3, "32 MB"));
        osList.add(new OperatingSystemDto("Windows 98", 1998, "Microsoft", "Desktop", "Personal use", 2, "16 MB"));
        osList.add(new OperatingSystemDto("MS-DOS 6.22", 1994, "Microsoft", "Desktop", "Personal use", 0.02, "4 MB"));

        System.out.println("Before Sorting:");
        for (OperatingSystemDto dto : osList) {
            System.out.println(dto);
        }

        Collections.sort(osList);

        System.out.println("\nAfter Sorting:");
        for (OperatingSystemDto dto : osList) {
            System.out.println(dto);
        }
    }
}
