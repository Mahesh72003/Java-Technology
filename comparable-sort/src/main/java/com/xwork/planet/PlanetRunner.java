package com.xwork.planet;

import com.xwork.planet.dto.PlanetDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlanetRunner {
    public static void main(String[] args) {
        List<PlanetDto> planets = new ArrayList<>();

        planets.add(new PlanetDto("Earth", "Medium", 149.6, true, 1));
        planets.add(new PlanetDto("Mars", "Small", 227.9, true, 1.88));
        planets.add(new PlanetDto("Jupiter", "Large", 778.3, true, 11.86));
        planets.add(new PlanetDto("Venus", "Medium", 108.2, false, 0.615));
        planets.add(new PlanetDto("Saturn", "Large", 1427, true, 29.46));
        planets.add(new PlanetDto("Mercury", "Small", 57.9, false, 0.241));
        planets.add(new PlanetDto("Neptune", "Large", 4497, true, 164.79));
        planets.add(new PlanetDto("Uranus", "Large", 2871, true, 84.01));
        planets.add(new PlanetDto("Pluto", "Small", 5906, true, 248.00));
        planets.add(new PlanetDto("Ceres", "Small", 413.7, true, 4.60));
        planets.add(new PlanetDto("Haumea", "Small", 6600, true, 284.00));

        System.out.println("Before Sorting:");
        for (PlanetDto planet : planets) {
            System.out.println(planet);
        }

        Collections.sort(planets);

        System.out.println("\nAfter Sorting:");
        for (PlanetDto planet : planets) {
            System.out.println(planet);
        }
    }
}
