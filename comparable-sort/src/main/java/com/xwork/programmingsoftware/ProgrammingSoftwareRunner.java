package com.xwork.programmingsoftware;

import com.xwork.programmingsoftware.dto.ProgrammingSoftwareDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammingSoftwareRunner {
    public static void main(String[] args) {
        List<ProgrammingSoftwareDto> softwareList = new ArrayList<>();

        softwareList.add(new ProgrammingSoftwareDto("Visual Studio Code", "Microsoft", 2015, "Microsoft", "IDE", "1.70.0", true));
        softwareList.add(new ProgrammingSoftwareDto("IntelliJ IDEA", "JetBrains", 2001, "JetBrains", "IDE", "2021.2", false));
        softwareList.add(new ProgrammingSoftwareDto("Eclipse", "Eclipse Foundation", 2001, "Eclipse Foundation", "IDE", "2021-09", true));
        softwareList.add(new ProgrammingSoftwareDto("PyCharm", "JetBrains", 2010, "JetBrains", "IDE", "2021.2", false));
        softwareList.add(new ProgrammingSoftwareDto("NetBeans", "Apache", 1997, "Apache Software Foundation", "IDE", "12.5", true));
        softwareList.add(new ProgrammingSoftwareDto("Xcode", "Apple", 2003, "Apple", "IDE", "12.5.1", false));
        softwareList.add(new ProgrammingSoftwareDto("Atom", "GitHub", 2014, "GitHub", "Text Editor", "1.58.0", true));
        softwareList.add(new ProgrammingSoftwareDto("Sublime Text", "Sublime HQ", 2008, "Sublime HQ", "Text Editor", "4", false));
        softwareList.add(new ProgrammingSoftwareDto("GCC", "GNU Project", 1987, "GNU", "Compiler", "11.2.0", true));
        softwareList.add(new ProgrammingSoftwareDto("Clang", "Apple", 2007, "Apple", "Compiler", "12.0.0", true));

        System.out.println("Before Sorting");
        for (ProgrammingSoftwareDto software : softwareList) {
            System.out.println(software);
        }

        Collections.sort(softwareList);

        System.out.println("\nAfter Sorting:");
        for (ProgrammingSoftwareDto software : softwareList) {
            System.out.println(software);
        }
    }
}
