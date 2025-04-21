package  com.xworkz.methodoverride6;

public class Tablet extends Device {

    @Override
    public void start() {
        System.out.println("Tablet is powering on. Welcome screen displayed.");
    }

    @Override
    public void shutdown() {
        System.out.println("Tablet is shutting down. See you soon.");
    }

    @Override
    public void performTask() {
        System.out.println("Tablet is running apps and multitasking.");
    }

    @Override
    public void update() {
        System.out.println("Tablet is downloading and installing the latest updates.");
    }
}