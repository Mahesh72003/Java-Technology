class Printer 
{
    static String id = "DCP-T525";
    static String brand = "Brother";
    static String type = "Inkjet";
    static String color = "Black";
    static String connectivityType = "Wi-Fi";
    static int price = 13499;

    public static void main(String Brother[]) 
	{
        System.out.println("That is ID: " + id);
        System.out.println("That is Brand: " + brand);
        System.out.println("That is Type: " + type);
        System.out.println("That is Color: " + color);
        System.out.println("That is Connectivity Type: " + connectivityType);
        System.out.println("That is Price: " + price);

        System.out.println("Re-init of Printer (directly)");
        id = "MFC-J995DW";
        brand = "Brother";
        type = "Laser";
        color = "White";
        connectivityType = "Ethernet";
        price = 15999;

        System.out.println("That is ID: " + id);
        System.out.println("That is Brand: " + brand);
        System.out.println("That is Type: " + type);
        System.out.println("That is Color: " + color);
        System.out.println("That is Connectivity Type: " + connectivityType);
        System.out.println("That is Price: " + price);

        System.out.println("Re-init using method");
        updatePrinter();
        System.out.println("That is ID: " + id);
        System.out.println("That is Brand: " + brand);
        System.out.println("That is Type: " + type);
        System.out.println("That is Color: " + color);
        System.out.println("That is Connectivity Type: " + connectivityType);
        System.out.println("That is Price: " + price);
    }

    public static void updatePrinter() 
	{
        id = "HP LaserJet Pro";
        brand = "HP";
        type = "Laser";
        color = "Gray";
        connectivityType = "Bluetooth";
        price = 19999;
    }
}
