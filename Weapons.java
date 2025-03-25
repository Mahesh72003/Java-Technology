class Weapons 
{
    String type;         
    double weight;       
    String caliber;      
    boolean isLoaded;    
    String brandName;    
    double range;        

    Weapons() 
	{
        this("Adani Defence and Aerospace"); 
        System.out.println("Weapons no-argument constructor invoked");
    }

    Weapons(String brandName) 
	{
        this(true);  
        this.brandName = brandName;
        System.out.println("Weapons constructor with brand name invoked");
    }


    Weapons(boolean isLoaded) 
	{
        this("Gun", 51.7);  
        this.isLoaded = isLoaded;
        System.out.println("Weapons constructor with loaded status invoked");
    }

    Weapons(String type, double range) 
	{
        this(5.0, 51.7); 
        this.type = type;
		this.range=range;
        System.out.println("Weapons constructor with weapon type and range invoked");
    }

   
    Weapons(double weight, double range) 
	{
        this("9mm", weight, true);  
        this.weight = weight;
        this.range = range;
        System.out.println("Weapons constructor with weight and range invoked");
    }

    
    Weapons(String caliber, double weight, boolean isLoaded) 
	{
        this("Gun", 51.7, "Adani Defence and Aerospace"); 
        this.caliber = caliber;
		this.weight=weight;
		this.isLoaded=isLoaded;
        System.out.println("Weapons constructor with caliber and weight invoked");
    }
	Weapons(String type, double range, String brandName)
	{
		this.type = type;
		this.range=range;
		this.brandName=brandName;
		System.out.println("Weapons constructor with weapon type, range and brandName invoked");
	}
	
	public void displayWeaponInfo() 
	{ 
        System.out.println("The type of the weapon is: " + type);
        System.out.println("The weight of the weapon is: " + weight + " kg");
        System.out.println("The caliber of the weapon is: " + caliber);
        System.out.println("Is the weapon loaded: " +isLoaded);
        System.out.println("The brand name of the weapon is: " + brandName);
        System.out.println("The range of the weapon is: " + range + " meters");
    }	
}

