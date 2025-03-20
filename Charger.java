class Charger 
{
    static int id = 1;
    static String brand = "HAMMER";
    static String color = "white";
    static String type = "USB";
    static String power = "120 Volts";
    static int price = 1699;

    public static void main(String hammer[]) 
	{
        System.out.println("This is ID " + id);
        System.out.println("This Brand is " + brand);
        System.out.println("The color is " + color);
        System.out.println("The type is " + type);
        System.out.println("The power is " + power);
        System.out.println("The price of the " + brand + " is " + price);

        System.out.println("Re-init of Charger (directly)");
        id = 2;
        brand = "Anker";
        color = "Black";
        type = "Type-C";
        power = "150 Volts";
        price = 1999;

        System.out.println("This is ID " + id);
        System.out.println("This Brand is " + brand);
        System.out.println("The color is " + color);
        System.out.println("The type is " + type);
        System.out.println("The power is " + power);
        System.out.println("The price of the " + brand + " is " + price);

        System.out.println("Re-init using method");
        updateCharger();
        System.out.println("This is ID " + id);
        System.out.println("This Brand is " + brand);
        System.out.println("The color is " + color);
        System.out.println("The type is " + type);
        System.out.println("The power is " + power);
        System.out.println("The price of the " + brand + " is " + price);
    }

    public static void updateCharger() 
	{
        id = 3;
        brand = "Samsung";
        color = "Blue";
        type = "Wireless";
        power = "200 Volts";
        price = 2499;
    }
}
