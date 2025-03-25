class Switch 
{
    boolean isWireless;        
    String type;               
    String color;              
    double voltageRating;      
    double currentRating;      
    String brandName;          

    Switch() 
	{
        this("lisha"); 
        System.out.println("Switch constructor invoked");
    }
    
    Switch(String brandName) 
	{
        this(false);  
        this.brandName = brandName;
        System.out.println("Switch constructor with brand name invoked");
    }
    
    Switch(boolean isWireless) 
	{
        this("Toggle", 220.5);  
        this.isWireless = isWireless;
        System.out.println("Switch constructor with wireless state invoked");
    }
   
    Switch(String type, double voltageRating) 
	{
        this(10.0);  
        this.type = type;
		this.voltageRating = voltageRating;
        System.out.println("Switch constructor with switch type and voltageRating invoked");
    }
    
    Switch(double currentRating) 
	{
        this("Red", false);  
        this.currentRating = currentRating;
        System.out.println("Switch constructor with  current rating invoked");
    }

    Switch(String color, boolean isWireless) 
	{
        this("lisha", "Red", 220.5, 10.0); 
        this.color = color;
		this.isWireless=isWireless;
        System.out.println("Switch constructor with color invoked");
    }
	Switch(String brandName , String color, double voltageRating, double currentRating)
	{
		this.brandName=brandName;
		this.color=color;
		this.voltageRating=voltageRating;
		this.currentRating=currentRating;
		System.out.println("Switch constructor with brandName, color, voltageRating, currentRating");
	}
	
	 public void displaySwitchInfo() 
	{
        System.out.println("Is the switch wireless: " +isWireless);
        System.out.println("The type of the switch is: " + type);
        System.out.println("The color of the switch is: " + color);
        System.out.println("The voltage rating of the switch is: " + voltageRating + " volts");
        System.out.println("The current rating of the switch is: " + currentRating + " amps");
        System.out.println("The brand name of the switch is: " + brandName);
    }
}
	
