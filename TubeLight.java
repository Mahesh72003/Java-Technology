class TubeLight 
{
    String brand;       
    int wattage;        
    String color;       
    double price;       
    String length;      
    String type;        

    // Default constructor
    TubeLight() 
	{
        System.out.println("TubeLight constructor is invoked");
    }

    // Parameterized constructor
    TubeLight(String brand, int wattage, String color, double price, String length, String type) 
	{
        this.brand = brand;
        this.wattage = wattage;
        this.color = color;
        this.price = price;
        this.length = length;
        this.type = type;
    }
}
