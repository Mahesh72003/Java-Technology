package com.xworkz.coursera;

import com.xworkz.coursera.dto.CourseraDto;

public class CourseraRunner {
    public static void main(String[] args) {

        CourseraDto courseraDto = new CourseraDto();
        courseraDto.setName("Mahesh A V");
        courseraDto.setEmailId("mahesh@gmail.com");
        courseraDto.setUserId("mahesh@2003");
        courseraDto.setPassword("mahesh123");
        courseraDto.setLocation("Rajajinagar");

        System.out.println(courseraDto.toString());
    }
}
