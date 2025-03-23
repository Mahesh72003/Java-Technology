class BubbleGum 
{
    String flavor;
    String color;
    String size;

    // Default constructor
    BubbleGum() 
	{
        System.out.println("BubbleGum constructor is invoked");
    }

    // Parameterized constructor
    BubbleGum(String flavor, String color, String size) 
	{
        this.flavor = flavor;
        this.color = color;
        this.size = size;
    }
}
