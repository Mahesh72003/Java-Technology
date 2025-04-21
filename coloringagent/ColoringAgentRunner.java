package com.xworkz.coloringagent;

import com.xworkz.coloringagent.coloringagent.ColoringAgent;
import com.xworkz.coloringagent.spraypaint.SprayPaint;

public class ColoringAgentRunner {
    public static void main(String[] args) {

        ColoringAgent coloringAgent = new ColoringAgent();
        coloringAgent.validateAgentDetails();
        coloringAgent.agentType();
        coloringAgent.dryingTime();
        coloringAgent.applicationSurface();
        coloringAgent.availableColors();
        coloringAgent.isEcoFriendly();


        SprayPaint sprayPaint = new SprayPaint();
        sprayPaint.validateAgentDetails();
        sprayPaint.agentType();
        sprayPaint.dryingTime();
        sprayPaint.applicationSurface();
        sprayPaint.availableColors();
        sprayPaint.isEcoFriendly();
        sprayPaint.sprayPattern();
        sprayPaint.indoorUse();
        sprayPaint.outdoorUse();
        sprayPaint.easyApplication();
        sprayPaint.refillable();


        ColoringAgent polySprayPaint = new SprayPaint();
        polySprayPaint.validateAgentDetails();
        polySprayPaint.agentType();
        polySprayPaint.dryingTime();
        polySprayPaint.applicationSurface();
        polySprayPaint.availableColors();
        polySprayPaint.isEcoFriendly();
    }
}
