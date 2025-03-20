class CountryNames 
{
	static String countries[] = {"India","USA", "China", "Brazil", "Australia", "Germany", "France", "UK", "Canada", "Japan",
                                "South Korea", "Italy", "Mexico", "Russia", "South Africa", "Spain", "Indonesia", "Turkey", 
                                "Saudi Arabia", "Argentina","Nigeria", "Egypt", "Italy", "Colombia", "Vietnam", "Thailand", 
                                "Malaysia", "Singapore", "Philippines", "Colombia","Poland", "Ukraine", "Iraq", "Israel", 
                                "Sweden", "Norway", "Denmark", "Finland", "Greece", "Switzerland"};
								
    public static void main(String earth[]) 
	{
        System.out.println("Main Started");
		System.out.println(" ");
        getCountrie();
		System.out.println(" ");
		System.out.println("Main Ended");
    }
	public static void getCountrie()
	{
		System.out.println("Inside the getCountrie()");
		System.out.println("Total Number of Countries are: " + countries.length);
        for(String countrie : countries)
		{

			System.out.println(countrie);
		}
		System.out.println("End of getCountrie()");
	}
	
}
