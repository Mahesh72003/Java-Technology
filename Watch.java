class Watch 
{
    static int id = 110;
    static String brand = "Casio";
    static String colour = "Silver";
    static String type = "Quartz";
    static String shape = "Square";
    static boolean isWaterProof = true;

    public static void main(String casio[]) 
	{
        System.out.println("That is Watch ID: " + id);
        System.out.println("That is Brand: " + brand);
        System.out.println("That is Colour: " + colour);
        System.out.println("That is Type: " + type);
        System.out.println("That is Shape: " + shape);
        System.out.println("That is Waterproof: " + isWaterProof);

        System.out.println("Re-init of Watch (directly)");
        id = 120;
        brand = "Rolex";
        colour = "Gold";
        type = "Automatic";
        shape = "Round";
        isWaterProof = false;

        System.out.println("That is Watch ID: " + id);
        System.out.println("That is Brand: " + brand);
        System.out.println("That is Colour: " + colour);
        System.out.println("That is Type: " + type);
        System.out.println("That is Shape: " + shape);
        System.out.println("That is Waterproof: " + isWaterProof);

        System.out.println("Re-init using method");
        updateWatch();
        System.out.println("That is Watch ID: " + id);
        System.out.println("That is Brand: " + brand);
        System.out.println("That is Colour: " + colour);
        System.out.println("That is Type: " + type);
        System.out.println("That is Shape: " + shape);
        System.out.println("That is Waterproof: " + isWaterProof);
    }

    public static void updateWatch() 
	{
        id = 150;
        brand = "Omega";
        colour = "Silver";
        type = "Quartz";
        shape = "Square";
        isWaterProof = true;
    }
}
