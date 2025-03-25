class Wire 
{
    double length;          
    String material;        
    double voltageRating;   
    double currentRating;   
    boolean isWaterproof;   
    String brandName;       
	
	Wire() 
	{
        this(5.0);  
        System.out.println("Wire the no-argument constructor is invoked");
    }
	
	Wire(double length) 
	{
        this(220.0, 10.0);
        this.length = length;
        System.out.println("Wire constructor with length is invoked");
    }
	
	Wire(double voltageRating, double currentRating) 
	{
        this(true); 
        this.voltageRating = voltageRating;
        this.currentRating = currentRating;
        System.out.println("Wire constructor with material, voltage, and current rating is invoked");
    }
	Wire(boolean isWaterproof)
	{
        this("Havells"); 
        this.isWaterproof = isWaterproof;
        System.out.println("Wire constructor with waterproof status is invoked");
    }
	
	Wire(String brandName) 
	{
        this("Copper", true); 
        this.brandName = brandName;
        System.out.println("Wire constructor with brand name is invoked");
    }
	
	 Wire(String material,  boolean isWaterproof) 
	 {
        this(5.0, true);
        this.material = material;
        this.voltageRating = voltageRating;
        this.currentRating = currentRating;
        System.out.println("Wire constructor with length, material, voltage, and current is invoked");
    }
	
	Wire(double length, boolean isWaterproof) 
	{
        this.length = length;  
        this.isWaterproof = isWaterproof;  
        System.out.println("Wire constructor with length and waterproof status is invoked");
	}
	
	public void displayWireInfo() 
	{
        System.out.println("The length of the wire is: " + length + " meters");
        System.out.println("The material of the wire is: " + material);
        System.out.println("The voltage rating of the wire is: " + voltageRating + " volts");
        System.out.println("The current rating of the wire is: " + currentRating + " amps");
        System.out.println("Is the wire waterproof: " + (isWaterproof ? "Yes" : "No"));
        System.out.println("The brand name of the wire is: " + brandName);
    }
}	