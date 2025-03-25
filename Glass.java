class Glass 
{
    double thickness;          
    String material;           
    double transparencyLevel;  
    boolean isShatterproof;    
    String brandName;          
    double weight;  

	Glass()
	{
		this(5.0);  
        System.out.println("Glass no-argument constructor invoked");
	}
	Glass(double thickness) 
	{
        this(100.0, 10.0);
        this.thickness = thickness;
        System.out.println("Glass constructor with thickness invoked");
    }
	Glass(double transparencyLevel, double weight) 
	{
        this("Tempered"); 
        this.transparencyLevel = transparencyLevel;
        this.weight = weight;
        System.out.println("Glass constructor with transparency and weight invoked");
    }
	
	 Glass(String material) 
	{
        this(true);  
        this.material = material;
        System.out.println("Glass constructor with material invoked");
    }
	Glass(boolean isShatterproof) 
	{
        this("theBrand","Tempered");  
        this.isShatterproof = isShatterproof;
        System.out.println("Glass constructor with shatterproof status invoked");
    }
	Glass(String brandName, String material)
	{
		this(true, 10.0);
		this.brandName=brandName;
		this.material=material;
		System.out.println("Glass constructor with material and brand Name invoked");
	}
	Glass(boolean isShatterproof, double weight)
	{
		this.isShatterproof=isShatterproof;
		this.weight=weight;
		System.out.println("Glass constructor with shatterproof and weight status invoked");
	}
	
	public void displayGlassInfo() 
	{
        System.out.println("The thickness of the glass is: " + thickness + " mm");
        System.out.println("The material of the glass is: " + material);
        System.out.println("The transparency level of the glass is: " + transparencyLevel + "%");
        System.out.println("Is the glass shatterproof: " +isShatterproof);
        System.out.println("The brand name of the glass is: " + brandName);
        System.out.println("The weight of the glass is: " + weight + " kg");
    }

}