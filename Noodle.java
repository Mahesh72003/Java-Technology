class Noodle 
{
    String brand;        
    String flavor;       
    String packageSize;  
    double price;        
    int noOfPackets;     

    // Default constructor
    Noodle() 
	{
        System.out.println("Noodle constructor is invoked");
    }

    // Parameterized constructor
    Noodle(String brand, String flavor, String packageSize, double price, int noOfPackets) 
	{
        this.brand = brand;
        this.flavor = flavor;
        this.packageSize = packageSize;
        this.price = price;
        this.noOfPackets = noOfPackets;
    }
}
