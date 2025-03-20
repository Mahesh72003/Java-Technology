class Microwave 
{
    static String brand = "LG";
    static String id = "MW232";
    static String type = "Convection";
    static int price = 14999;

    public static void main(String lg[]) 
	{
        System.out.println("That is Microwave Brand: " + brand);
        System.out.println("That is Microwave ID: " + id);
        System.out.println("That is Microwave Type: " + type);
        System.out.println("That is Microwave Price: " + price);

        System.out.println("Re-init of Microwave (directly)");
        brand = "Samsung";
        id = "MW456";
        type = "Grill";
        price = 17999;

        System.out.println("That is Microwave Brand: " + brand);
        System.out.println("That is Microwave ID: " + id);
        System.out.println("That is Microwave Type: " + type);
        System.out.println("That is Microwave Price: " + price);

        System.out.println("Re-init using method");
        updateMicrowave();
        System.out.println("That is Microwave Brand: " + brand);
        System.out.println("That is Microwave ID: " + id);
        System.out.println("That is Microwave Type: " + type);
        System.out.println("That is Microwave Price: " + price);
    }

    public static void updateMicrowave() 
	{
        brand = "Panasonic";
        id = "MW789";
        type = "Solo";
        price = 12999;
    }
}
