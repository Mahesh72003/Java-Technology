package com.xworkz.coloringagent;

import com.xworkz.coloringagent.coloringagent.ColoringAgent;
import com.xworkz.coloringagent.spraypaint.SprayPaint;

public class ColoringAgentRunner {
    public static void main(String[] args) {
        ColoringAgent coloringAgent = new ColoringAgent();
        coloringAgent.validateAgentDetails();

        SprayPaint sprayPaint = new SprayPaint();
        sprayPaint.validateAgentDetails();
    }
}
