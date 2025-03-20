class Jacket 
{
    static String brand = "Urban Terrain Galaxy Ultra";
    static String id = "JKT123";
    static char size = 'L';
    static String color = "Black";
    static boolean isWaterResistant = true;
    static int price = 2999;

    public static void main(String Galaxy[]) 
	{
        System.out.println("That is Jacket Brand: " + brand);
        System.out.println("That is Jacket ID: " + id);
        System.out.println("That is Jacket Size: " + size);
        System.out.println("That is Jacket Color: " + color);
        System.out.println("That is Jacket Water Resistant: " + isWaterResistant);
        System.out.println("That is Jacket Price: " + price);

        System.out.println("Re-init of Jacket (directly)");
        brand = "North Face";
        id = "JKT456";
        size = 'M';
        color = "Red";
        isWaterResistant = false;
        price = 4999;

        System.out.println("That is Jacket Brand: " + brand);
        System.out.println("That is Jacket ID: " + id);
        System.out.println("That is Jacket Size: " + size);
        System.out.println("That is Jacket Color: " + color);
        System.out.println("That is Jacket Water Resistant: " + isWaterResistant);
        System.out.println("That is Jacket Price: " + price);

        System.out.println("Re-init using method");
        updateJacket();
        System.out.println("That is Jacket Brand: " + brand);
        System.out.println("That is Jacket ID: " + id);
        System.out.println("That is Jacket Size: " + size);
        System.out.println("That is Jacket Color: " + color);
        System.out.println("That is Jacket Water Resistant: " + isWaterResistant);
        System.out.println("That is Jacket Price: " + price);
    }

    public static void updateJacket() 
	{
        brand = "Columbia";
        id = "JKT789";
        size = 'S';
        color = "Blue";
        isWaterResistant = true;
        price = 3499;
    }
}
