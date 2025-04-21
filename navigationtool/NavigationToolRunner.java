package com.xworkz.navigationtool;

import com.xworkz.navigationtool.map.Map;
import com.xworkz.navigationtool.navigationtool.NavigationTool;

public class NavigationToolRunner {
    public static void main(String[] args) {


        NavigationTool tool = new NavigationTool();
        tool.validateNavigationToolDetails();
        tool.provideDirections();
        tool.calculateDistance();
        tool.displayRoute();
        tool.checkTraffic();


        NavigationTool ref = new Map();
        ref.validateNavigationToolDetails();
        ref.provideDirections();
        ref.calculateDistance();
        ref.displayRoute();
        ref.checkTraffic();


        Map map = new Map();
        map.validateNavigationToolDetails();
        map.provideDirections();
        map.calculateDistance();
        map.displayRoute();
        map.checkTraffic();
        map.locateLandmarks();
    }
}
