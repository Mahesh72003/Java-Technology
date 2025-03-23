class ColdDrink 
{
    String brand;    
    String flavor;   
    double volume;   
    double price;    
    String type;     

    // Default constructor
    ColdDrink() 
	{
        System.out.println("ColdDrink constructor is invoked");
    }

    // Parameterized constructor
    ColdDrink(String brand, String flavor, double volume, double price, String type) 
	{
        this.brand = brand;
        this.flavor = flavor;
        this.volume = volume;
        this.price = price;
        this.type = type;
    }
}
