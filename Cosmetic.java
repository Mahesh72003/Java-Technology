class Cosmetic 
{
    String brand;       
    String productType; 
    String shade;       
    double price;       
    String type;        

    // Default constructor
    Cosmetic() 
	{
        System.out.println("Cosmetic constructor is invoked");
    }

    // Parameterized constructor
    Cosmetic(String brand, String productType, String shade, double price, String type) 
	{
        this.brand = brand;
        this.productType = productType;
        this.shade = shade;
        this.price = price;
        this.type = type;
    }
}
