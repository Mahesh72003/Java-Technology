class Sunglasses 
{
    static String id = "CR271";
    static String brand = "CREEK";
    static int price = 497;
    static String color = "Black";
    static String weight = "40 g";

    public static void main(String CREEK[]) 
	{
        System.out.println("That is ID: " + id);
        System.out.println("That is Brand: " + brand);
        System.out.println("That is Price: " + price);
        System.out.println("That is Color: " + color);
        System.out.println("That is Weight: " + weight);

        System.out.println("Re-init of Sunglasses (directly)");
        id = "CR500";
        brand = "Ray-Ban";
        price = 2499;
        color = "Blue";
        weight = "45 g";

        System.out.println("That is ID: " + id);
        System.out.println("That is Brand: " + brand);
        System.out.println("That is Price: " + price);
        System.out.println("That is Color: " + color);
        System.out.println("That is Weight: " + weight);

        System.out.println("Re-init using method");
        updateSunglasses();
        System.out.println("That is ID: " + id);
        System.out.println("That is Brand: " + brand);
        System.out.println("That is Price: " + price);
        System.out.println("That is Color: " + color);
        System.out.println("That is Weight: " + weight);
    }

    public static void updateSunglasses() 
	{
        id = "CR600";
        brand = "Oakley";
        price = 3499;
        color = "Grey";
        weight = "50 g";
    }
}
