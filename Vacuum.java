class Vacuum 
{
    static int id = 35;
    static String brand = "KARCHER";
    static String type = "Cartridge";
    static boolean isCordless = false;
    static boolean isIndoor = true;
    static String Wattage = "1000 Watts";
    static int Length = 2;

    public static void main(String karcher[]) 
	{
        System.out.println("This is id: " + id);
        System.out.println("This is Brand: " + brand);
        System.out.println("This is Type: " + type);
        System.out.println("This is Cordless: " + isCordless);
        System.out.println("This is Wattage: " + Wattage);
        System.out.println("This is Indoor: " + isIndoor);
        System.out.println("The Hose Length: " + Length + " Metres");

        System.out.println("Re-init of Vacuum (directly)");
        id = 50;
        brand = "Dyson";
        type = "Cylinder";
        isCordless = true;
        isIndoor = false;
        Wattage = "1200 Watts";
        Length = 3;

        System.out.println("This is id: " + id);
        System.out.println("This is Brand: " + brand);
        System.out.println("This is Type: " + type);
        System.out.println("This is Cordless: " + isCordless);
        System.out.println("This is Wattage: " + Wattage);
        System.out.println("This is Indoor: " + isIndoor);
        System.out.println("The Hose Length: " + Length + " Metres");

        System.out.println("Re-init using method");
        updateVacuum();
        System.out.println("This is id: " + id);
        System.out.println("This is Brand: " + brand);
        System.out.println("This is Type: " + type);
        System.out.println("This is Cordless: " + isCordless);
        System.out.println("This is Wattage: " + Wattage);
        System.out.println("This is Indoor: " + isIndoor);
        System.out.println("The Hose Length: " + Length + " Metres");
    }

    public static void updateVacuum() 
	{
        id = 75;
        brand = "Shark";
        type = "Upright";
        isCordless = true;
        isIndoor = true;
        Wattage = "1500 Watts";
        Length = 4;
    }
}
