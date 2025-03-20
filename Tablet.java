class Tablet 
{
    static String brand = "Samsung";
    static String id = "TAB567";
    static String color = "Silver";
    static String screenType = "LED";  
    static int price = 25999;

    public static void main(String Samsung[]) 
	{
        System.out.println("That is Tablet Brand: " + brand);
        System.out.println("That is Tablet ID: " + id);
        System.out.println("That is Tablet Color: " + color);
        System.out.println("That is Tablet Screen Type: " + screenType);
        System.out.println("That is Tablet Price: " + price);

        System.out.println("Re-init of Tablet (directly)");
        brand = "Apple";
        id = "TAB678";
        color = "Gold";
        screenType = "OLED";
        price = 45999;

        System.out.println("That is Tablet Brand: " + brand);
        System.out.println("That is Tablet ID: " + id);
        System.out.println("That is Tablet Color: " + color);
        System.out.println("That is Tablet Screen Type: " + screenType);
        System.out.println("That is Tablet Price: " + price);

        System.out.println("Re-init using method");
        updateTablet();
        System.out.println("That is Tablet Brand: " + brand);
        System.out.println("That is Tablet ID: " + id);
        System.out.println("That is Tablet Color: " + color);
        System.out.println("That is Tablet Screen Type: " + screenType);
        System.out.println("That is Tablet Price: " + price);
    }

    public static void updateTablet() 
	{
        brand = "Microsoft";
        id = "TAB789";
        color = "Black";
        screenType = "PixelSense";
        price = 34999;
    }
}
