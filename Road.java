class Road 
{
    String type;       
    double length;     
    String roadNumber; 
    String startPoint; 
    String endPoint;   
    double weight;  

    
    Road() 
	{
        this("NH7"); 
        System.out.println("Road no-argument constructor invoked");
    }
    
    Road(String roadNumber ) 
	{
        this("National Highway", 1240.0);  
        this.roadNumber = roadNumber;
        System.out.println("Road constructor with road number invoked");
    }
    
    Road(String type, double length)
	{
        this(1240.0, 500.0);  
        this.type = type;
		this.length=length;
        System.out.println("Road constructor with road type, length invoked");
    }
    
    Road(double length, double weight)
	{
        this("Kanyakumari","Varanasi"); 
        this.length = length;
        this.weight = weight;
        System.out.println("Road constructor with length and weight invoked");
    }
  
    Road(String startPoint, String endPoint) 
	{
        this("National Highway", "NH7",1240.0);  
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        System.out.println("Road constructor with start and end points invoked");
    }
	Road(String type, String roadNumber, double length)
	{
		this.type=type;
		this.roadNumber=roadNumber;
		this.length=length;
		 System.out.println("Road constructor with road type,road Number, length invoked");
	}
	public void displayRoadInfo() 
	{
        System.out.println("Type of Road: " + type);
        System.out.println("Length of Road: " + length + " km");
        System.out.println("Road Number: " + roadNumber);
        System.out.println("Start Point: " + startPoint);
        System.out.println("End Point: " + endPoint);
        System.out.println("Width of the road: " + weight);
    }
}