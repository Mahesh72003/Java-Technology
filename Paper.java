class Paper 
{
    int id;
    String size;
    String type;
    double height;  
    double weight;
    int quantity;

    // Constructor 1: Takes no arguments
    Paper() {
        this(1);  
        System.out.println("Paper no-argument constructor is invoked");
    }

    // Constructor 2: 
    Paper(int id)
	{
        this("A4", "Plain Paper");  
        this.id = id;
        System.out.println("Paper constructor with int id is invoked");
    }

    // Constructor 3: Takes two Strings 
    Paper(String size, String type)
	{
        this(8.27, 11.69); 
        this.size = size;
        this.type = type;
        System.out.println("Paper constructor with String size and String type is invoked");
    }

    // Constructor 4:  
    Paper(double height, double weight) {
        this(500, "A4");  
        this.height = height;
        this.weight = weight;
        System.out.println("Paper constructor with two doubles is invoked");
    }

    // Constructor 5: 
    Paper(int quantity, String size) {
        this(10, 20);  
        this.quantity = quantity;
        this.size = size;
        System.out.println("Paper constructor with int quantity and String size is invoked");
    }

    // Constructor 6: 
    Paper(int id, int quantity)
	{
        this(8.27, 500);  
        this.id = id;
        this.quantity = quantity;
        System.out.println("Paper constructor with two ints is invoked");
    }

    // Constructor 7: 
    Paper(double height, int quantity) 
	{
        this.height = height;
        this.quantity = quantity; 
        System.out.println("Paper constructor with double and int is invoked");
    }

    
    public void displayPaperInfo() 
	{
		System.out.println("The id of paper is: " + id);
		System.out.println("The size of paper is: " + size);
		System.out.println("The type of paper is: " + type);
		System.out.println("The height of paper is: " + height);
		System.out.println("The weight of paper is: " + weight);
		System.out.println("The quantity of paper is: " + quantity);
	}

}
