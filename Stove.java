class Stove 
{
    String brand;
    String color;
    int numberOfBurners;
    String fuelType;
    
    // Default constructor
    Stove() 
	{
        System.out.println("Stove constructor is invoked");
    }

    // Parameterized constructor
    Stove(String brand, String color, int numberOfBurners, String fuelType) 
	{
        this.brand = brand;
        this.color = color;
        this.numberOfBurners = numberOfBurners;
        this.fuelType = fuelType;
    }
}
