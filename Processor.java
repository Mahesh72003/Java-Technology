class Processor 
{
    static int id = 5700;
    static String brand = "AMD Ryzen";
    static String gen = "7";
    static String clockSpeed = "4.6 GHz";

    public static void main(String amd[]) 
	{
        System.out.println("This is ID " + id);
        System.out.println("This Brand is " + brand);
        System.out.println("The generation is " + gen);
        System.out.println("The clock speed is " + clockSpeed);

        System.out.println("Re-init of Processor (directly)");
        id = 5800;
        brand = "Intel Core";
        gen = "i9";
        clockSpeed = "5.0 GHz";

        System.out.println("This is ID " + id);
        System.out.println("This Brand is " + brand);
        System.out.println("The generation is " + gen);
        System.out.println("The clock speed is " + clockSpeed);

        System.out.println("Re-init using method");
        updateProcessor();
        System.out.println("This is ID " + id);
        System.out.println("This Brand is " + brand);
        System.out.println("The generation is " + gen);
        System.out.println("The clock speed is " + clockSpeed);
    }

    public static void updateProcessor()
	{
        id = 5900;
        brand = "AMD Threadripper";
        gen = "3rd Gen";
        clockSpeed = "4.7 GHz";
    }
}
