class WaterBottle 
{
    static String brand = "Tupperware";
    static String id = "WB789";
    static String material = "Plastic";
    static int capacity = 1000;  
    static String color = "Blue";  
    static int price = 399;

    public static void main(String Tupperware[]) 
	{
        System.out.println("That is Water Bottle Brand: " + brand);
        System.out.println("That is Water Bottle ID: " + id);
        System.out.println("That is Water Bottle Material: " + material);
        System.out.println("That is Water Bottle Capacity: " + capacity + "ml");
        System.out.println("That is Water Bottle Color: " + color);
        System.out.println("That is Water Bottle Price: " + price);

        System.out.println("Re-init of Water Bottle (directly)");
        brand = "Borosil";
        id = "WB890";
        material = "Glass";
        capacity = 1500;
        color = "Green";
        price = 599;

        System.out.println("That is Water Bottle Brand: " + brand);
        System.out.println("That is Water Bottle ID: " + id);
        System.out.println("That is Water Bottle Material: " + material);
        System.out.println("That is Water Bottle Capacity: " + capacity + "ml");
        System.out.println("That is Water Bottle Color: " + color);
        System.out.println("That is Water Bottle Price: " + price);

        System.out.println("Re-init using method");
        updateWaterBottle();
        System.out.println("That is Water Bottle Brand: " + brand);
        System.out.println("That is Water Bottle ID: " + id);
        System.out.println("That is Water Bottle Material: " + material);
        System.out.println("That is Water Bottle Capacity: " + capacity + "ml");
        System.out.println("That is Water Bottle Color: " + color);
        System.out.println("That is Water Bottle Price: " + price);
    }

    public static void updateWaterBottle() 
	{
        brand = "Contigo";
        id = "WB567";
        material = "Stainless Steel";
        capacity = 1200;
        color = "Black";
        price = 799;
    }
}
