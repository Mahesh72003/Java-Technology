class Soil 
{
    String soilType;         
    double pHLevel;          
    double moistureContent;  
    String nutrientContent;  
    double density;          
    String location;         

    Soil() 
	{
        this("Loamy"); 
        System.out.println("Soil no-argument constructor invoked");
    }

    Soil(String soilType) 
	{
        this(6.5);  
        this.soilType = soilType;
        System.out.println("Soil constructor with soil type invoked");
    }
    
    Soil(double pHLevel) 
	{
        this(12.5,"Medium");  
        this.pHLevel = pHLevel;
        System.out.println("Soil constructor with pH level invoked");
    }
  
    Soil(double moistureContent, String nutrientContent) 
	{
        this("Punjab", 4.6); 
        this.moistureContent = moistureContent;
		this.nutrientContent = nutrientContent;
        System.out.println("Soil constructor with moisture content and nutrient Content invoked");
    }

    
    Soil(String location, double density) 
	{
        this(6.5,12.5,4.6);  
        this.nutrientContent = nutrientContent;
		this.density = density;
        System.out.println("Soil constructor with location , density invoked");
    }

    
    Soil(double pHLevel, double moistureContent, double density) 
	{
        this("Loamy", "Medium", "Punjab"); 
		this.pHLevel=pHLevel;
		this.moistureContent=moistureContent;
        this.density = density;
        System.out.println("Soil constructor with pHLevel, moistureContent, density invoked");
    }
	Soil(String soilType, String nutrientContent, String location)
	{
		this.soilType=soilType;
		this.nutrientContent=nutrientContent;
		this.density=density;
		this.location=location;
		System.out.println("Soil constructor with soilType, nutrientContent, location invoked");
	}  
    
    public void displaySoilInfo() 
	{
        System.out.println("the Soil Type: " + soilType);
        System.out.println("the pH Level of soil: " + pHLevel);
        System.out.println("the Moisture Content in the soil " + moistureContent + "%");
        System.out.println("the Nutrient Content in the soil: " + nutrientContent);
        System.out.println("the Density of soil " + density + " g/cm³");
        System.out.println("this Location ther found " + location);
    }

}
