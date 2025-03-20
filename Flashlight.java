class Flashlight
{
    static String brand = "Maglite";
    static String id = "FLX123";
    static String color = "Silver";
    static boolean isRechargeable = true;
    static int price = 699;

    public static void main(String Maglite[]) 
	{
        System.out.println("That is Flashlight Brand: " + brand);
        System.out.println("That is Flashlight ID: " + id);
        System.out.println("That is Flashlight Color: " + color);
        System.out.println("That is Flashlight Rechargeable: " + isRechargeable);
        System.out.println("That is Flashlight Price: " + price);

        System.out.println("Re-init of Flashlight (directly)");
        brand = "Duracell";
        id = "FLX456";
        color = "Black";
        isRechargeable = false;
        price = 799;

        System.out.println("That is Flashlight Brand: " + brand);
        System.out.println("That is Flashlight ID: " + id);
        System.out.println("That is Flashlight Color: " + color);
        System.out.println("That is Flashlight Rechargeable: " + isRechargeable);
        System.out.println("That is Flashlight Price: " + price);

        System.out.println("Re-init using method");
        updateFlashlight();
        System.out.println("That is Flashlight Brand: " + brand);
        System.out.println("That is Flashlight ID: " + id);
        System.out.println("That is Flashlight Color: " + color);
        System.out.println("That is Flashlight Rechargeable: " + isRechargeable);
        System.out.println("That is Flashlight Price: " + price);
    }

    public static void updateFlashlight() 
	{
        brand = "Energizer";
        id = "FLX789";
        color = "Green";
        isRechargeable = true;
        price = 899;
    }
}
