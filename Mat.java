class Mat 
{
    String material;  
    String size;      
    String color;     
    double price;     
    String brand;     

    // Default constructor
    Mat() 
	{
        System.out.println("Mat constructor is invoked");
    }

    // Parameterized constructor
    Mat(String material, String size, String color, double price, String brand) 
	{
        this.material = material;
        this.size = size;
        this.color = color;
        this.price = price;
        this.brand = brand;
    }
}
