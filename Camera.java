class Camera 
{
    static String brand = "Canon";
    static String id = "CAM500";
    static String type = "DSLR";
    static boolean hasAutofocus = true;
    static char lensType = 'W';
    static int price = 35999;

    public static void main(String[] Canon) 
	{
        System.out.println("That is Camera Brand: " + brand);
        System.out.println("That is Camera ID: " + id);
        System.out.println("That is Camera Type: " + type);
        System.out.println("That is Camera Autofocus: " + hasAutofocus);
        System.out.println("That is Camera Lens Type: " + lensType);
        System.out.println("That is Camera Price: " + price);

        System.out.println("Re-init of Camera (directly)");
        brand = "Nikon";
        id = "CAM600";
        type = "Mirrorless";
        hasAutofocus = false;
        lensType = 'T';
        price = 42999;

        System.out.println("That is Camera Brand: " + brand);
        System.out.println("That is Camera ID: " + id);
        System.out.println("That is Camera Type: " + type);
        System.out.println("That is Camera Autofocus: " + hasAutofocus);
        System.out.println("That is Camera Lens Type: " + lensType);
        System.out.println("That is Camera Price: " + price);

        System.out.println("Re-init using method");
        updateCamera();
        System.out.println("That is Camera Brand: " + brand);
        System.out.println("That is Camera ID: " + id);
        System.out.println("That is Camera Type: " + type);
        System.out.println("That is Camera Autofocus: " + hasAutofocus);
        System.out.println("That is Camera Lens Type: " + lensType);
        System.out.println("That is Camera Price: " + price);
    }

    public static void updateCamera() 
	{
        brand = "Sony";
        id = "CAM700";
        type = "Compact";
        hasAutofocus = true;
        lensType = 'Z';
        price = 54999;
    }
}
