package  com.xworkz.methodoverride6;

import com.xworkz.methodoverride6.Device;
import com.xworkz.methodoverride6.Tablet;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Device Object ----");
        Device device = new Device();
        device.start();
        device.shutdown();
        device.performTask();
        device.update();

        System.out.println("\n---- Device Reference, Tablet Object ----");
        Device device1 = new Tablet();
        device1.start();
        device1.shutdown();
        device1.performTask();
        device1.update();

        System.out.println("\n---- Tablet Object ----");
        Tablet tablet = new Tablet();
        tablet.start();
        tablet.shutdown();
        tablet.performTask();
        tablet.update();
    }
}