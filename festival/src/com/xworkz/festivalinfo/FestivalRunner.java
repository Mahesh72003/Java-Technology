package com.xworkz.festivalinfo;

import com.xworkz.festivalinfo.festival.Festival;
import com.xworkz.festivalinfo.board.FestivalBoard;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival[] festivals = new Festival[5];

        Festival festival1 = new Festival();
        festival1.setFestivalId(1);
        festival1.setName("Dasara");
        festival1.setReligion("Hindu");
        festival1.setMonth("October");
        festival1.setDurationDays(10);
        festival1.setIsPublicHoliday(true);
        festival1.setMainLocation("Mysuru");
        festival1.setFoodSpeciality("Holige");
        festivals[0] = festival1;

        Festival festival2 = new Festival();
        festival2.setFestivalId(2);
        festival2.setName("Diwali");
        festival2.setReligion("Hindu");
        festival2.setMonth("November");
        festival2.setDurationDays(5);
        festival2.setIsPublicHoliday(true);
        festival2.setMainLocation("Pan India");
        festival2.setFoodSpeciality("Kaju Katli");
        festivals[1] = festival2;

        Festival festival3 = new Festival();
        festival3.setFestivalId(3);
        festival3.setName("Eid al-Fitr");
        festival3.setReligion("Islam");
        festival3.setMonth("April");
        festival3.setDurationDays(1);
        festival3.setIsPublicHoliday(true);
        festival3.setMainLocation("Across India");
        festival3.setFoodSpeciality("Sheer Khurma");
        festivals[2] = festival3;

        Festival festival4 = new Festival();
        festival4.setFestivalId(4);
        festival4.setName("Christmas");
        festival4.setReligion("Christianity");
        festival4.setMonth("December");
        festival4.setDurationDays(1);
        festival4.setIsPublicHoliday(true);
        festival4.setMainLocation("All over India");
        festival4.setFoodSpeciality("Plum Cake");
        festivals[3] = festival4;

        Festival festival5 = new Festival();
        festival5.setFestivalId(5);
        festival5.setName("Ugadi");
        festival5.setReligion("Hindu");
        festival5.setMonth("March");
        festival5.setDurationDays(1);
        festival5.setIsPublicHoliday(true);
        festival5.setMainLocation("Karnataka / Andhra Pradesh");
        festival5.setFoodSpeciality("Bevu Bella");
        festivals[4] = festival5;

        FestivalBoard board = new FestivalBoard();
        board.festivals = festivals;
        board.displayFestivalInfo();
    }
}
