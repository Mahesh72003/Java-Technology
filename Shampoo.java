class Shampoo 
{
    String brand;     
    String fragrance; 
    String size;      

    // Default constructor
    Shampoo() 
	{
        System.out.println("Shampoo constructor is invoked");
    }

    // Parameterized constructor
    Shampoo(String brand, String fragrance, String size) 
	{
        this.brand = brand;
        this.fragrance = fragrance;
        this.size = size;
    }
}
