class Chain 
{
    String material;
    int length;     
    String type;    

    // Default constructor
    Chain() 
	{
        System.out.println("Chain constructor is invoked");
    }

    // Parameterized constructor
    Chain(String material, int length, String type) 
	{
        this.material = material;
        this.length = length;
        this.type = type;
    }
}
