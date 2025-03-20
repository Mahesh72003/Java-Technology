class Backpack 
{
	static String brand = "Wildcraft";
    static String id = "BP334";
    static String color = "Grey";
    static boolean isWaterProof = true;  
    static String materialType = "nylon";
    static int price = 1999;
    public static void main(String Wildcraft[]) 
	{
        System.out.println("That is Backpack Brand: " + brand);
        System.out.println("That is Backpack ID: " + id);
        System.out.println("That is Backpack Color: " + color);
        System.out.println("That is Backpack Waterproof: " + isWaterProof);
        System.out.println("That is Backpack Material: " + materialType);
        System.out.println("That is Backpack Price: " + price);
		// re-init using 
		System.out.println("re-init of name");
	
		brand="Skybags ";
		id="B08Z";
		color="Green";
		isWaterProof=false;
		materialType="Synthetic fiber";
		price=2030;
		
        System.out.println("That is Backpack Brand: " + brand);
        System.out.println("That is Backpack ID: " + id);
        System.out.println("That is Backpack Color: " + color);
        System.out.println("That is Backpack Waterproof: " + isWaterProof);
        System.out.println("That is Backpack Material: " + materialType);
        System.out.println("That is Backpack Price: " + price);
		
		// re-init using method
		System.out.println(" re-init using method ");
		updateBackpack();
		System.out.println("That is Backpack Brand: " + brand);
        System.out.println("That is Backpack ID: " + id);
        System.out.println("That is Backpack Color: " + color);
        System.out.println("That is Backpack Waterproof: " + isWaterProof);
        System.out.println("That is Backpack Material: " + materialType);
        System.out.println("That is Backpack Price: " + price);		
    }
	
	public static void updateBackpack()
	{
		brand="Safari ";
		id="B097JJ2CK6";
		color="Blue";
		isWaterProof=true;
		materialType="Polyurethane";
		price=4572;
		
		
		
	}
}
