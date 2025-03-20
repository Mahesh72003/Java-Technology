class Speaker 
{
    static String brand = "Bose";
    static String id = "SPK102";
    static String color = "Black";
    static char speakerType = 'S'; 
    static boolean isBluetoothEnabled = true;  
    static int price = 7999;

    public static void main(String Bose[]) 
	{
        System.out.println("That is Speaker Brand: " + brand);
        System.out.println("That is Speaker ID: " + id);
        System.out.println("That is Speaker Color: " + color);
        System.out.println("That is Speaker Type: " + speakerType);
        System.out.println("That is Speaker Bluetooth Enabled: " + isBluetoothEnabled);
        System.out.println("That is Speaker Price: " + price);

        System.out.println("Re-init of Speaker (directly)");
        brand = "Sony";
        id = "SPK205";
        color = "White";
        speakerType = 'W'; 
        isBluetoothEnabled = false;
        price = 8999;

        System.out.println("That is Speaker Brand: " + brand);
        System.out.println("That is Speaker ID: " + id);
        System.out.println("That is Speaker Color: " + color);
        System.out.println("That is Speaker Type: " + speakerType);
        System.out.println("That is Speaker Bluetooth Enabled: " + isBluetoothEnabled);
        System.out.println("That is Speaker Price: " + price);

        System.out.println("Re-init using method");
        updateSpeaker();
        System.out.println("That is Speaker Brand: " + brand);
        System.out.println("That is Speaker ID: " + id);
        System.out.println("That is Speaker Color: " + color);
        System.out.println("That is Speaker Type: " + speakerType);
        System.out.println("That is Speaker Bluetooth Enabled: " + isBluetoothEnabled);
        System.out.println("That is Speaker Price: " + price);
    }

    public static void updateSpeaker() 
	{
        brand = "JBL";
        id = "SPK309";
        color = "Red";
        speakerType = 'P'; 
        isBluetoothEnabled = true;
        price = 10999;
    }
}
