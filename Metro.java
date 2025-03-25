class Metro 
{
    String name;
    String city;
    int noOfLines;
    int noOfStations;
    String startTime;
    String endTime;

    Metro() 
	{
        this("Namma Metro");
        System.out.println("Metro no-argument constructor is invoked");
    }

    Metro(String name)
	{
        this("banglore", 68);
        this.name = name;
        System.out.println("Metro constructor with String name is invoked");
    }

    Metro(String city, int noOfStations) 
	{
        this("5:30 AM", "11:30 PM");
		this.city=city;
		this.noOfStations=noOfStations;
        System.out.println("Metro constructor with String city and noOfStations is invoked");
    }

    Metro(String startTime, String endTime)
	{
        this(2, "banglore", "Namma Metro");
		this.startTime=startTime;
		this.endTime=endTime;
        System.out.println("Metro constructor with String startTime, String endTime is invoked");
    }

    Metro(int noOfLines, String name, String city) 
	{
        this(2, 68);
		this.noOfLines=noOfLines;
		this.name=name;
		this.city=city;
        System.out.println("Metro constructor with int noOfLines, String name, String city is invoked");
    }

    Metro(int noOfLines, int noOfStations) 
	{
        this("Namma Metro","banglore","5:30 AM", "11:30 PM");
		this.noOfLines=noOfLines;
		this.noOfStations=noOfStations;
        System.out.println("Metro constructor with int noOfLines, int noOfStations is invoked");
    }

    Metro(String name, String city, String startTime, String endTime) 
	{
        this.name = name;
        this.city = city;
        this.startTime = startTime;
        this.endTime = endTime;
        System.out.println("Metro constructor with String name, String city, String startTime, String endTime invoked");
    }

    public void displayMetroInfo() 
	{
        System.out.println("The name of the metro is: " + name);
        System.out.println("The city where the metro operates is: " + city);
        System.out.println("The number of lines in the metro is: " + noOfLines);
        System.out.println("The number of stations in the metro is: " + noOfStations);
        System.out.println("The start time of the metro service is: " + startTime);
        System.out.println("The end time of the metro service is: " + endTime);
    }
}
