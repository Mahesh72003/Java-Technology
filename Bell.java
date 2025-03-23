class Bell 
{
    String material;     
    String size;         
    String color;        
    double price;        
    String designPattern;

    // Default constructor
    Bell() 
	{
        System.out.println("Bell constructor is invoked");
    }

    // Parameterized constructor
    Bell(String material, String size, String color, double price, String designPattern) 
	{
        this.material = material;
        this.size = size;
        this.color = color;
        this.price = price;
        this.designPattern = designPattern;
    }
}
