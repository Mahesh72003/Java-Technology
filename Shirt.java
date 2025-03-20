class Shirt 
{
    static int id = 32;
    static String brand = "Ben John";
    static String material = "Cotton";
    static String pattern = "Solid";
    static char size = 'M';
    static String type = "T-shirt";
    static String color = "Red";
    static boolean isWashable = true;

    public static void main(String Ben[])
	{
        System.out.println("That is ID: " + id);
        System.out.println("That is Brand: " + brand);
        System.out.println("That is Material: " + material);
        System.out.println("That is Pattern: " + pattern);
        System.out.println("That is Size: " + size);
        System.out.println("That is Type: " + type);
        System.out.println("That is Color: " + color);
        System.out.println("That is Washable: " + isWashable);

        System.out.println("Re-init of Shirt (directly)");
        id = 45;
        brand = "Polo Ralph Lauren";
        material = "Polyester";
        pattern = "Striped";
        size = 'L';
        type = "Polo";
        color = "Blue";
        isWashable = false;

        System.out.println("That is ID: " + id);
        System.out.println("That is Brand: " + brand);
        System.out.println("That is Material: " + material);
        System.out.println("That is Pattern: " + pattern);
        System.out.println("That is Size: " + size);
        System.out.println("That is Type: " + type);
        System.out.println("That is Color: " + color);
        System.out.println("That is Washable: " + isWashable);

        System.out.println("Re-init using method");
        updateShirt();
        System.out.println("That is ID: " + id);
        System.out.println("That is Brand: " + brand);
        System.out.println("That is Material: " + material);
        System.out.println("That is Pattern: " + pattern);
        System.out.println("That is Size: " + size);
        System.out.println("That is Type: " + type);
        System.out.println("That is Color: " + color);
        System.out.println("That is Washable: " + isWashable);
    }

    public static void updateShirt() 
	{
        id = 56;
        brand = "Tommy Hilfiger";
        material = "Linen";
        pattern = "Checked";
        size = 'S';
        type = "Casual";
        color = "Green";
        isWashable = true;
    }
}
