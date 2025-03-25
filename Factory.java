class Factory 
{
    String factoryName;       
    String factoryType;       
    int numberOfEmployees;    
    String location;          
    int yearOfEstablishment;  
    int productionCapacity;   

    Factory() 
	{
        this("Tata Industries"); 
        System.out.println("Factory no-argument constructor invoked");
    }
   
    Factory(String factoryName) 
	{
        this("Manufacturing", "Mumbai", 324329); 
        this.factoryName = factoryName;
        System.out.println("Factory constructor with factory name invoked");
    }

    Factory(String factoryType, String location , int productionCapacity) 
	{
        this(100);  
        this.factoryType = factoryType;
		this.location=location;
		this.productionCapacity=productionCapacity;
        System.out.println("Factory constructor with factory type, location, productionCapacity invoked");
    }
  
    Factory(int numberOfEmployees) 
	{
        this("Mumbai" , 1000); 
        this.numberOfEmployees = numberOfEmployees;
        System.out.println("Factory constructor with number of employees invoked");
    }

    Factory(String location, int numberOfEmployees) 
	{
        this(1998, "Tata Industries");  
        this.location = location;
		this.numberOfEmployees=numberOfEmployees;
        System.out.println("Factory constructor with location  and invoked");
    }
    
    Factory(int yearOfEstablishment, String factoryName) 
	{
        this("Tata Industries", "Manufacturing", "Mumbai"); 
        this.yearOfEstablishment = yearOfEstablishment;
		this.factoryName=factoryName;
        System.out.println("Factory constructor with year of establishment and factoryName invoked");
    }
	Factory(String factoryName, String factoryType, String location)
	{
		this.factoryName=factoryName;
		this.factoryType = factoryType;
		this.location=location;
		System.out.println("Factory constructor with factory name, factory type and location invoked");
	}
	
	public void displayFactoryInfo() 
	{
        System.out.println("Factory Name: " + factoryName);
        System.out.println("Factory Type: " + factoryType);
        System.out.println("Number of Employees: " + numberOfEmployees);
        System.out.println("Location: " + location);
        System.out.println("Year of Establishment: " + yearOfEstablishment);
        System.out.println("Production Capacity: " + productionCapacity + " units per day");
    }
}