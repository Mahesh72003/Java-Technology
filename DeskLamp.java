class DeskLamp 
{
    static String brand = "Philips";
    static String id = "DL456";
    static String color = "White";
    static String type = "LED";
    static int voltage = 220;
    static int watt = 15;
    static boolean isRechargeable = true;
    static int price = 1299;

    public static void main(String Philips[]) 
	{
        System.out.println("That is Desk Lamp Brand: " + brand);
        System.out.println("That is Desk Lamp ID: " + id);
        System.out.println("That is Desk Lamp Color: " + color);
        System.out.println("That is Desk Lamp Type: " + type);
        System.out.println("That is Desk Lamp Voltage: " + voltage + "V");
        System.out.println("That is Desk Lamp Wattage: " + watt + "W");
        System.out.println("That is Desk Lamp Rechargeable: " + isRechargeable);
        System.out.println("That is Desk Lamp Price: " + price);

        System.out.println("Re-init of Desk Lamp (directly)");
        brand = "Xiaomi";
        id = "DL789";
        color = "Black";
        type = "Smart LED";
        voltage = 110;
        watt = 12;
        isRechargeable = false;
        price = 899;

        System.out.println("That is Desk Lamp Brand: " + brand);
        System.out.println("That is Desk Lamp ID: " + id);
        System.out.println("That is Desk Lamp Color: " + color);
        System.out.println("That is Desk Lamp Type: " + type);
        System.out.println("That is Desk Lamp Voltage: " + voltage + "V");
        System.out.println("That is Desk Lamp Wattage: " + watt + "W");
        System.out.println("That is Desk Lamp Rechargeable: " + isRechargeable);
        System.out.println("That is Desk Lamp Price: " + price);

        System.out.println("Re-init using method");
        updateDeskLamp();
        System.out.println("That is Desk Lamp Brand: " + brand);
        System.out.println("That is Desk Lamp ID: " + id);
        System.out.println("That is Desk Lamp Color: " + color);
        System.out.println("That is Desk Lamp Type: " + type);
        System.out.println("That is Desk Lamp Voltage: " + voltage + "V");
        System.out.println("That is Desk Lamp Wattage: " + watt + "W");
        System.out.println("That is Desk Lamp Rechargeable: " + isRechargeable);
        System.out.println("That is Desk Lamp Price: " + price);
    }

    public static void updateDeskLamp() 
	{
        brand = "LIFX";
        id = "DL101";
        color = "Gray";
        type = "LED Smart";
        voltage = 240;
        watt = 20;
        isRechargeable = true;
        price = 1599;
    }
}
