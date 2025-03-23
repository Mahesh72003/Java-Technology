class Soap 
{
    String brand;  
    String scent;  
    String weight; 
    String type;   

    // Default constructor
    Soap() 
	{
        System.out.println("Soap constructor is invoked");
    }

    // Parameterized constructor
    Soap(String brand, String scent, String weight, String type) 
	{
        this.brand = brand;
        this.scent = scent;
        this.weight = weight;
        this.type = type;
    }
}
