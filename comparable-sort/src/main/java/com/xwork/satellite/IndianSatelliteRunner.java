package com.xwork.satellite;

import com.xwork.satellite.dto.IndianSatelliteDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IndianSatelliteRunner {
    public static void main(String[] args) {
        List<IndianSatelliteDto> satellites = new ArrayList<>();

        satellites.add(new IndianSatelliteDto("Aryabhata", "Scientific Research", "19 April 1975", "Kosmos-3M", 360, "Low Earth Orbit", "ISRO", "Decommissioned", "None"));
        satellites.add(new IndianSatelliteDto("INSAT-3DR", "Meteorological Observations", "8 September 2016", "GSLV Mk II", 2200, "Geostationary Orbit", "ISRO", "Active", "Telecommunication"));
        satellites.add(new IndianSatelliteDto("Cartosat-2", "Earth Observation", "15 July 2003", "PSLV-C4", 710, "Sun-synchronous Orbit", "ISRO", "Decommissioned", "Remote Sensing"));
        satellites.add(new IndianSatelliteDto("GSAT-6A", "Telecommunication", "29 March 2018", "GSLV Mk II", 2117, "Geostationary Orbit", "ISRO", "Active", "Telecommunication"));
        satellites.add(new IndianSatelliteDto("RISAT-1", "Radar Imaging", "20 April 2012", "PSLV-C19", 1850, "Sun-synchronous Orbit", "ISRO", "Decommissioned", "Radar Imaging"));
        satellites.add(new IndianSatelliteDto("GSAT-7", "Communication", "30 August 2013", "GSLV Mk II", 2200, "Geostationary Orbit", "ISRO", "Active", "Telecommunication"));
        satellites.add(new IndianSatelliteDto("INSAT-3C", "Communication", "24 January 2002", "GSLV Mk I", 2300, "Geostationary Orbit", "ISRO", "Active", "Telecommunication"));
        satellites.add(new IndianSatelliteDto("GSAT-15", "Communication", "10 November 2015", "GSLV Mk II", 2300, "Geostationary Orbit", "ISRO", "Active", "Telecommunication"));
        satellites.add(new IndianSatelliteDto("Cartosat-3", "Earth Observation", "5 November 2019", "PSLV-C47", 1700, "Sun-synchronous Orbit", "ISRO", "Active", "Remote Sensing"));
        satellites.add(new IndianSatelliteDto("INSAT-4A", "Telecommunication", "22 December 2005", "GSLV Mk I", 3400, "Geostationary Orbit", "ISRO", "Decommissioned", "Telecommunication"));
        satellites.add(new IndianSatelliteDto("RISAT-2", "Radar Imaging", "20 April 2009", "PSLV-C12", 3000, "Sun-synchronous Orbit", "ISRO", "Active", "Radar Imaging"));
        satellites.add(new IndianSatelliteDto("GSAT-18", "Communication", "5 October 2017", "GSLV Mk II", 3200, "Geostationary Orbit", "ISRO", "Active", "Telecommunication"));
        satellites.add(new IndianSatelliteDto("NavIC", "Navigation", "1 July 2013", "PSLV-C22", 1425, "Geosynchronous Orbit", "ISRO", "Active", "Navigation"));
        satellites.add(new IndianSatelliteDto("GSAT-19", "Communication", "5 June 2017", "GSLV Mk III", 3190, "Geostationary Orbit", "ISRO", "Active", "Telecommunication"));
        satellites.add(new IndianSatelliteDto("Astrosat", "Space Observations", "28 September 2015", "PSLV-C30", 1500, "Geostationary Orbit", "ISRO", "Active", "Space Science"));



        System.out.println("Before Sorting:");
        for (IndianSatelliteDto satellite : satellites) {
            System.out.println(satellite);
        }

        Collections.sort(satellites);

        System.out.println("\nAfter Sorting:");
        for (IndianSatelliteDto satellite : satellites) {
            System.out.println(satellite);
        }
    }
}
