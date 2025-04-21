package com.xworkz.waterbody.ocean;

import com.xworkz.waterbody.waterbody.WaterBody;

public class Ocean extends WaterBody {

    @Override
    public void validateWaterBodyDetails() {
        System.out.println("Ocean: A vast body of saline water that covers most of the Earth's surface.");
    }

    public void oceanDepth() {
        System.out.println("Oceans are the deepest water bodies, with some regions reaching depths over 36,000 feet.");
    }

    public void oceanCurrents() {
        System.out.println("Oceans have complex current systems that regulate climate and weather patterns.");
    }

    public void marineLife() {
        System.out.println("Oceans are home to a wide variety of marine life, from plankton to large mammals like whales.");
    }

    public void importance() {
        System.out.println("Oceans play a crucial role in regulating the Earth's temperature and supporting global ecosystems.");
    }
}
