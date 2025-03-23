class PhotoFrame 
{
    String material;  
    String size;      
    String color;     
    double price;     

    // Default constructor
    PhotoFrame() 
	{
        System.out.println("PhotoFrame constructor is invoked");
    }

    // Parameterized constructor
    PhotoFrame(String material, String size, String color, double price) 
	{
        this.material = material;
        this.size = size;
        this.color = color;
        this.price = price;
    }
}
