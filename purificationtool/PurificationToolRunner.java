package com.xworkz.purificationtool;

import com.xworkz.purificationtool.purificationtool.PurificationTool;
import com.xworkz.purificationtool.waterfilter.WaterFilter;

public class PurificationToolRunner {
    public static void main(String[] args) {
        PurificationTool purificationTool = new PurificationTool();
        purificationTool.validateToolDetails();

        WaterFilter waterFilter = new WaterFilter();
        waterFilter.validateToolDetails();
    }
}
