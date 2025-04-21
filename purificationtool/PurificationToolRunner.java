package com.xworkz.purificationtool;

import com.xworkz.purificationtool.purificationtool.PurificationTool;
import com.xworkz.purificationtool.waterfilter.WaterFilter;

public class PurificationToolRunner {
    public static void main(String[] args) {
        PurificationTool purificationTool = new PurificationTool();
        purificationTool.validateToolDetails();
        purificationTool.toolEfficiency();
        purificationTool.maintenance();
        purificationTool.filterType();
        purificationTool.waterPurityLevel();

        WaterFilter waterFilter = new WaterFilter();
        waterFilter.validateToolDetails();
        waterFilter.filterLifeSpan();
        waterFilter.filtrationProcess();
        waterFilter.energyConsumption();
        waterFilter.portability();

        PurificationTool purificationToolRef = new WaterFilter();
        purificationToolRef.validateToolDetails();
        purificationToolRef.toolEfficiency();
        purificationToolRef.maintenance();
        purificationToolRef.filterType();
        purificationToolRef.waterPurityLevel();
    }
}
