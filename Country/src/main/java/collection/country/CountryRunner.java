package collection.country;

import collection.country.dto.CountryDto;

import java.util.*;

public class CountryRunner {
    public static void main(String[] args) {

        List<CountryDto> countryDtos = new ArrayList<>();
        //Set<CountryDto> countryDtos = new LinkedHashSet<>();

        countryDtos.add(new CountryDto(1, "India", "New Delhi", 1400000000L, "Narendra Modi", "INR", 3.73, "Asia", 3287263L, true, false, false, "+91"));
        countryDtos.add(new CountryDto(2, "United States", "Washington D.C.", 331000000L, "Donald Trump", "USD", 25.5, "North America", 9833520L, true, false, false, "+1"));
        countryDtos.add(new CountryDto(3, "Germany", "Berlin", 83000000L, "Olaf Scholz", "Euro", 4.5, "Europe", 357022L, true, true, false, "+49"));
        countryDtos.add(new CountryDto(4, "Nigeria", "Abuja", 206000000L, "Bola Tinubu", "Naira", 0.45, "Africa", 923768L, false, false, true, "+234"));
        countryDtos.add(new CountryDto(5, "Japan", "Tokyo", 125000000L, "Fumio Kishida", "Yen", 4.9, "Asia", 377975L, true, false, false, "+81"));
        countryDtos.add(new CountryDto(6, "Brazil", "Brasília", 213000000L, "Luiz Inácio Lula da Silva", "Real", 2.0, "South America", 8515767L, false, false, false, "+55"));
        countryDtos.add(new CountryDto(7, "France", "Paris", 67000000L, "Emmanuel Macron", "Euro", 3.0, "Europe", 551695L, true, true, false, "+33"));
        countryDtos.add(new CountryDto(8, "South Africa", "Pretoria", 60000000L, "Cyril Ramaphosa", "Rand", 0.35, "Africa", 1221037L, false, false, true, "+27"));
        countryDtos.add(new CountryDto(9, "Australia", "Canberra", 26000000L, "Anthony Albanese", "AUD", 1.7, "Oceania", 7692024L, true, false, false, "+61"));
        countryDtos.add(new CountryDto(10, "Canada", "Ottawa", 38000000L, "Mark Carney", "CAD", 2.2, "North America", 9984670L, true, false, false, "+1"));
        countryDtos.add(new CountryDto(11, "China", "Beijing", 1440000000L, "Xi Jinping", "Yuan", 17.7, "Asia", 9596961L, true, false, false, "+86"));
        countryDtos.add(new CountryDto(12, "Russia", "Moscow", 146000000L, "Vladimir Putin", "Ruble", 1.8, "Europe/Asia", 17098242L, true, false, false, "+7"));
        countryDtos.add(new CountryDto(13, "United Kingdom", "London", 67000000L, "Keir Starmer", "Pound Sterling", 3.1, "Europe", 243610L, true, false, false, "+44"));
        countryDtos.add(new CountryDto(14, "Italy", "Rome", 59000000L, "Giorgia Meloni", "Euro", 2.0, "Europe", 301340L, true, true, false, "+39"));
        countryDtos.add(new CountryDto(15, "Mexico", "Mexico City", 126000000L, "Andrés Manuel López Obrador", "Peso", 1.3, "North America", 1964375L, false, false, false, "+52"));
        countryDtos.add(new CountryDto(16, "South Korea", "Seoul", 52000000L, "Yoon Suk‑yeol", "Won", 1.8, "Asia", 100210L, true, false, false, "+82"));
        countryDtos.add(new CountryDto(17, "Saudi Arabia", "Riyadh", 35000000L, "Mohammed bin Salman", "Riyal", 1.1, "Asia", 2149690L, true, false, false, "+966"));
        countryDtos.add(new CountryDto(18, "Argentina", "Buenos Aires", 45000000L, "Alberto Fernández", "Peso", 0.64, "South America", 2780400L, false, false, false, "+54"));
        countryDtos.add(new CountryDto(19, "Egypt", "Cairo", 104000000L, "Mostafa Madbouly", "Egyptian Pound", 0.4, "Africa", 1002450L, false, false, true, "+20"));
        countryDtos.add(new CountryDto(20, "Turkey", "Ankara", 85000000L, "Recep Tayyip Erdoğan", "Lira", 0.9, "Asia/Europe", 783562L, true, false, false, "+90"));
        countryDtos.add(new CountryDto(21, "Spain", "Madrid", 47000000L, "Pedro Sánchez", "Euro", 1.6, "Europe", 505990L, true, true, false, "+34"));
        countryDtos.add(new CountryDto(22, "Indonesia", "Jakarta", 273000000L, "Joko Widodo", "Rupiah", 1.2, "Asia", 1904569L, false, false, false, "+62"));
        countryDtos.add(new CountryDto(23, "Peru", "Lima", 34000000L, "Dina Boluarte", "Sol", 0.27, "South America", 1285216L, false, false, false, "+51"));
        countryDtos.add(new CountryDto(24, "Ukraine", "Kyiv", 43000000L, "Denys Shmyhal", "Hryvnia", 0.2, "Europe", 603500L, false, false, false, "+380"));
        countryDtos.add(new CountryDto(25, "Thailand", "Bangkok", 70000000L, "Srettha Thavisin", "Baht", 0.5, "Asia", 513120L, false, false, false, "+66"));
        countryDtos.add(new CountryDto(26, "Vietnam", "Hanoi", 98000000L, "Phạm Minh Chính", "Dong", 0.45, "Asia", 331212L, false, false, false, "+84"));
        countryDtos.add(new CountryDto(27, "Poland", "Warsaw", 38000000L, "Donald Tusk", "Zloty", 0.85, "Europe", 312696L, true, true, false, "+48"));
        countryDtos.add(new CountryDto(28, "Colombia", "Bogotá", 51000000L, "Gustavo Petro", "Peso", 0.32, "South America", 1141748L, false, false, false, "+57"));
        countryDtos.add(new CountryDto(29, "Iran", "Tehran", 86000000L, "Mohammad Mokhber", "Rial", 0.6, "Asia", 1648195L, false, false, false, "+98"));
        countryDtos.add(new CountryDto(30, "Ethiopia", "Addis Ababa", 126000000L, "Abiy Ahmed", "Birr", 0.15, "Africa", 1104300L, false, false, true, "+251"));
        countryDtos.add(new CountryDto(31, "Netherlands", "Amsterdam", 17000000L, "Mark Rutte", "Euro", 1.0, "Europe", 41543L, true, true, false, "+31"));
        countryDtos.add(new CountryDto(32, "Malaysia", "Kuala Lumpur", 33000000L, "Anwar Ibrahim", "Ringgit", 0.44, "Asia", 330803L, false, false, false, "+60"));
        countryDtos.add(new CountryDto(33, "Norway", "Oslo", 5400000L, "Jonas Gahr Støre", "Norwegian Krone", 0.54, "Europe", 385207L, true, true, false, "+47"));
        countryDtos.add(new CountryDto(34, "Sweden", "Stockholm", 10500000L, "Ulf Kristersson", "Swedish Krona", 0.62, "Europe", 450295L, true, true, false, "+46"));
        countryDtos.add(new CountryDto(35, "Chile", "Santiago", 19000000L, "Gabriel Boric", "Peso", 0.35, "South America", 756102L, true, false, false, "+56"));
        countryDtos.add(new CountryDto(36, "Greece", "Athens", 10400000L, "Kyriakos Mitsotakis", "Euro", 0.36, "Europe", 131957L, true, true, false, "+30"));
        countryDtos.add(new CountryDto(37, "Portugal", "Lisbon", 10300000L, "António Costa", "Euro", 0.31, "Europe", 92212L, true, true, false, "+351"));
        countryDtos.add(new CountryDto(38, "Kenya", "Nairobi", 55000000L, "William Ruto", "Shilling", 0.28, "Africa", 580367L, false, false, true, "+254"));
        countryDtos.add(new CountryDto(39, "Morocco", "Rabat", 37000000L, "Aziz Akhannouch", "Dirham", 0.14, "Africa", 446550L, false, false, true, "+212"));
        countryDtos.add(new CountryDto(40, "Philippines", "Manila", 113000000L, "Ferdinand Marcos Jr.", "Peso", 0.44, "Asia", 300000L, false, false, false, "+63"));
        countryDtos.add(new CountryDto(41, "New Zealand", "Wellington", 5100000L, "Christopher Luxon", "NZD", 0.25, "Oceania", 268838L, true, false, false, "+64"));
        countryDtos.add(new CountryDto(42, "Switzerland", "Bern", 8800000L, "Ignazio Cassis", "Swiss Franc", 0.9, "Europe", 41284L, true, true, false, "+41"));
        countryDtos.add(new CountryDto(43, "Czech Republic", "Prague", 10700000L, "Petr Fiala", "Czech Koruna", 0.32, "Europe", 78867L, true, true, false, "+420"));
        countryDtos.add(new CountryDto(44, "Belgium", "Brussels", 11500000L, "Alexander De Croo", "Euro", 0.6, "Europe", 30528L, true, true, false, "+32"));
        countryDtos.add(new CountryDto(45, "Austria", "Vienna", 9000000L, "Karl Nehammer", "Euro", 0.52, "Europe", 83871L, true, true, false, "+43"));
        countryDtos.add(new CountryDto(46, "Denmark", "Copenhagen", 5900000L, "Mette Frederiksen", "Danish Krone", 0.4, "Europe", 43094L, true, true, false, "+45"));
        countryDtos.add(new CountryDto(47, "Israel", "Jerusalem", 9600000L, "Benjamin Netanyahu", "Shekel", 0.52, "Asia", 22072L, true, false, false, "+972"));
        countryDtos.add(new CountryDto(48, "Finland", "Helsinki", 5500000L, "Petteri Orpo", "Euro", 0.31, "Europe", 338455L, true, true, false, "+358"));
        countryDtos.add(new CountryDto(49, "Iraq", "Baghdad", 43000000L, "Mohammed Shia' Al Sudani", "Dinar", 0.23, "Asia", 438317L, false, false, false, "+964"));
        countryDtos.add(new CountryDto(50, "Algeria", "Algiers", 44000000L, "Abdelmadjid Tebboune", "Dinar", 0.17, "Africa", 2381741L, false, false, true, "+213"));

        for(CountryDto dtoInDtos : countryDtos){
            System.out.println(dtoInDtos);
        }

    }
}
