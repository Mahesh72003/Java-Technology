package com.xworkz.navigationtool;

import com.xworkz.navigationtool.map.Map;
import com.xworkz.navigationtool.navigationtool.NavigationTool;

public class NavigationToolRunner {
    public static void main(String[] args) {
        NavigationTool tool = new NavigationTool();
        tool.validateNavigationToolDetails();
        Map map = new Map();
        map.validateNavigationToolDetails();
    }
}
