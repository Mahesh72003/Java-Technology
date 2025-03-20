class Pizza 
{
    static int id = 6585;
    static String brand = "Dominos";
    static String name = "Peppy Paneer";
    static String size = "Regular (Serves 1)";
    static String type = "Veg";
    static int price = 299;

    public static void main(String Dominos[]) 
	{
        System.out.println("Pizza ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Pizza Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);

        System.out.println("Re-init of Pizza (directly)");
        id = 7890;
        brand = "Pizza Hut";
        name = "Veg Supreme";
        size = "Medium (Serves 2)";
        type = "Veg";
        price = 399;

        System.out.println("Pizza ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Pizza Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);

        System.out.println("Re-init using method");
        updatePizza();
        System.out.println("Pizza ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Pizza Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }

    public static void updatePizza() 
	{
        id = 1011;
        brand = "Little Caesars";
        name = "Veggie Extravaganza";
        size = "Large (Serves 3)";
        type = "Veg";
        price = 499;
    }
}
