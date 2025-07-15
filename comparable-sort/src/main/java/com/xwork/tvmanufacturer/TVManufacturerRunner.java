package com.xwork.tvmanufacturer;

import com.xwork.tvmanufacturer.dto.TVManufacturerDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TVManufacturerRunner {
    public static void main(String[] args) {
        List<TVManufacturerDto> tvmdto= new ArrayList<>();
        tvmdto.add(new TVManufacturerDto("Samsung Electronics", "South Korea", 1969, "Seoul, South Korea", "Han Jong-hee", 246.7 ));
        tvmdto.add(new TVManufacturerDto("LG Electronics","South Korea", 1958, "Seoul, South Korea","William Cho",64.5));
        tvmdto.add(new TVManufacturerDto("Sony Corporation","Japan",1946,"Tokyo, Japan","Kenichiro Yoshida",81.4));
        tvmdto.add(new TVManufacturerDto("Hisense","China",1969,"Qingdao, China","Liu Hongxin",22.3));
        tvmdto.add(new TVManufacturerDto("TCL Corporation","China",1981,"Shenzhen, China","Li Dongsheng",15.2));
        tvmdto.add(new TVManufacturerDto("Panasonic","Japan",1918,"Osaka, Japan","Yuki Kusumi",7.5));
        tvmdto.add(new TVManufacturerDto("Philips","Netherlands",1891,"Amsterdam, Netherlands","Frans van Houten",7.2));
        tvmdto.add(new TVManufacturerDto("Sharp Corporation","Japan",1912,"Osaka, Japan","Robert Wu",6.5));
        tvmdto.add(new TVManufacturerDto("Vizio","United States",2002,"Irvine, California, United States","William Wang",3.0));
        tvmdto.add(new TVManufacturerDto("Xiaomi","China",2010,"Beijing, China","Lei Jun",2.0));
        System.out.println("before the sorting");
        for (TVManufacturerDto dto : tvmdto) {
            System.out.println(dto);
        }
        System.out.println("after the sorting");
        Collections.sort(tvmdto);
        for (TVManufacturerDto dto : tvmdto) {
            System.out.println(dto);
        }
        
    }
}
