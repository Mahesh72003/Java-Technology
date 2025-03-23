class Vase 
{
    String material;     
    String size;         
    String color;        
    double price;        
    String designPattern;

    // Default constructor
    Vase() 
	{
        System.out.println("Vase constructor is invoked");
    }

    // Parameterized constructor
    Vase(String material, String size, String color, double price, String designPattern) 
	{
        this.material = material;
        this.size = size;
        this.color = color;
        this.price = price;
        this.designPattern = designPattern;
    }
}
