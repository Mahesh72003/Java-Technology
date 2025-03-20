class Umbrella 
{
    static String brand = "American Tourister";
    static String id = "UMB123";
    static String color = "Blue";
    static char size = 'M';  
    static boolean isAutomatic = true;  
    static int price = 499;

    public static void main(String Tourister[]) 
	{
        System.out.println("That is Umbrella Brand: " + brand);
        System.out.println("That is Umbrella ID: " + id);
        System.out.println("That is Umbrella Color: " + color);
        System.out.println("That is Umbrella Size: " + size);
        System.out.println("That is Umbrella Automatic: " + isAutomatic);
        System.out.println("That is Umbrella Price: " + price);

        System.out.println("Re-init of Umbrella (directly)");
        brand = "Wildcraft";
        id = "UMB567";
        color = "Red";
        size = 'L';
        isAutomatic = false;
        price = 699;

        System.out.println("That is Umbrella Brand: " + brand);
        System.out.println("That is Umbrella ID: " + id);
        System.out.println("That is Umbrella Color: " + color);
        System.out.println("That is Umbrella Size: " + size);
        System.out.println("That is Umbrella Automatic: " + isAutomatic);
        System.out.println("That is Umbrella Price: " + price);

        System.out.println("Re-init using method");
        updateUmbrella();
        System.out.println("That is Umbrella Brand: " + brand);
        System.out.println("That is Umbrella ID: " + id);
        System.out.println("That is Umbrella Color: " + color);
        System.out.println("That is Umbrella Size: " + size);
        System.out.println("That is Umbrella Automatic: " + isAutomatic);
        System.out.println("That is Umbrella Price: " + price);
    }

    public static void updateUmbrella() 
	{
        brand = "Folding";
        id = "UMB890";
        color = "Green";
        size = 'S';
        isAutomatic = true;
        price = 799;
    }
}
