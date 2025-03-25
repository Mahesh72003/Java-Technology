class House
{
    int noOfFloors;
    int noOfRooms;
    double area;
    String color;
    int yearBuilt;
    boolean hasgenerator;

    House() 
	{
        this(2);
        System.out.println("House no-argument constructor is invoked");
    }

    House(int noOfFloors) 
	{
        this(1200.5, 3);
        this.noOfFloors = noOfFloors;
        System.out.println("House constructor with int noOfFloors is invoked");
    }

    House(double area, int noOfRooms) 
	{
        this("White", 2020, true);
        this.noOfRooms = noOfRooms;
        this.area = area;
        System.out.println("House constructor with int noOfRooms and double area is invoked");
    }

    House(String color, int yearBuilt, boolean hasgenerator)
	{
        this(3, 1200.5);
        this.color = color;
        this.yearBuilt = yearBuilt;
        this.hasgenerator = hasgenerator;
        System.out.println("House constructor with String color, int yearBuilt, and boolean hasgenerator is invoked");
    }

    House(int noOfRooms, double area) 
	{
        this(true, "White");
        this.noOfRooms = noOfRooms;
        this.area = area;
        System.out.println("House constructor with int noOfRooms, double area, and String color is invoked");
    }

    House(boolean hasgenerator, String color) 
	{
        this("White");
        this.hasgenerator = hasgenerator;
        this.color = color;
        System.out.println("House constructor with boolean hasgenerator and String color is invoked");
    }

    House(String color) 
	{
        this.color=color;
        System.out.println("House constructor with String color is invoked");
    }

    public void displayHouseInfo() 
	{
        System.out.println("The number of floors in the house is: " +noOfFloors);
        System.out.println("The number of rooms in the house is: " +noOfRooms);
        System.out.println("The area of the house is (in square feet): " +area);
        System.out.println("The color of the house is: " +color);
        System.out.println("The year the house was built is: " +yearBuilt);
        System.out.println("The house has a generator: " + hasgenerator);
    }
}
