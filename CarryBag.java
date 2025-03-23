class CarryBag 
{
    String material;     
    String size;         
    String color;        
    double price;        
    String designPattern;
    String brand;        
    String gender;       

    // Default constructor
    CarryBag() 
	{
        System.out.println("CarryBag constructor is invoked");
    }

    // Parameterized constructor
    CarryBag(String material, String size, String color, double price, String designPattern, String brand, String gender) 
	{
        this.material = material;
        this.size = size;
        this.color = color;
        this.price = price;
        this.designPattern = designPattern;
        this.brand = brand;
        this.gender = gender;
    }
}
