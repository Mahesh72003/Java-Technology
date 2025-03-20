class Bicycle 
{
   
    static String brand = "Urban Terrain Galaxy Ultra";
    static String id = "6783";
    static String bikeType = "Mountain Bike";
    static String color = "White";
    static String size = "26 inch";
    static int wheel = 2;
    static boolean gear = true;
    static int price = 7499;

    public static void main(String[] Terrain) 
	{
        // Display initial values
        System.out.println("That is Brand: " + brand);
        System.out.println("That is ID: " + id);
        System.out.println("That is Bike Type: " + bikeType);
        System.out.println("That is Color: " + color);
        System.out.println("That is Size: " + size);
        System.out.println("That is Wheel: " + wheel);
        System.out.println("That is Gear: " + gear);
        System.out.println("That is Price: " + price);

        
        System.out.println("Re-init of Bicycle (directly)");
        brand = "Trek Marlin 7";
        id = "B089W8G3";
        bikeType = "Hybrid Bike";
        color = "Red";
        size = "29 inch";
        wheel = 2;
        gear = false;
        price = 10999;

        System.out.println("That is Brand: " + brand);
        System.out.println("That is ID: " + id);
        System.out.println("That is Bike Type: " + bikeType);
        System.out.println("That is Color: " + color);
        System.out.println("That is Size: " + size);
        System.out.println("That is Wheel: " + wheel);
        System.out.println("That is Gear: " + gear);
        System.out.println("That is Price: " + price);

        
        System.out.println("Re-init using method");
        updateBicycle();
        System.out.println("That is Brand: " + brand);
        System.out.println("That is ID: " + id);
        System.out.println("That is Bike Type: " + bikeType);
        System.out.println("That is Color: " + color);
        System.out.println("That is Size: " + size);
        System.out.println("That is Wheel: " + wheel);
        System.out.println("That is Gear: " + gear);
        System.out.println("That is Price: " + price);
    }

    public static void updateBicycle() 
	{
        brand = "Cannondale Trail 8";
        id = "C812X9Y3";
        bikeType = "Road Bike";
        color = "Blue";
        size = "27.5 inch";
        wheel = 2;
        gear = true;
        price = 14999;
    }
}
