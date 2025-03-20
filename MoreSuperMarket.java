class MoreSuperMarket 
{
	static String groceries[] = {"Rice", "Wheat Flour", "Sugar", "Salt", "Oil", "Pulses", "Spices", "Tea", "Coffee", "Ghee"};
    static String perfumes[] = {"Chanel No. 5", "Dior Sauvage", "Yves Saint Laurent", "Gucci Bloom", "Tom Ford Black Orchid","Armani Code", "Versace Eros", "Creed Aventus", "Paco Rabanne Invictus", "Calvin Klein Eternity"};
    static String biscuits[] = {"Oreo", "Britannia Good Day", "Hide & Seek", "Treat", "Jim Jam", "Parle-G", "Digestive","Milk Bikis", "Marie", "Munch"};
    static String utensils[] = {"Plate", "Bowl", "Cup", "Glass", "Spoon", "Fork", "Knife", "Teapot", "Saucepan", "Frying Pan"};
    static String vegetables[] = {"Tomato", "Potato", "Onion", "Carrot", "Spinach", "Cabbage", "Cauliflower", "Brinjal", "Cucumber", "Green Chile"};

    public static void main(String retail[]) 
	{
        System.out.println("Main Started");
       // Arrays of groceries
		System.out.println(" ");
        getGrocerie();
		System.out.println(" ");
	   // Arrays of perfumes
		System.out.println(" ");
        getPerfume();
		System.out.println(" ");
	   // Arrays of biscuits
	    System.out.println(" ");
        getBiscuit();
		System.out.println(" ");
		// Arrays of utensils
		System.out.println(" ");
		getUtensil();
		System.out.println(" ");
		// Arrays of vegetables
		System.out.println(" ");
		getVegetable();
		System.out.println(" ");
		System.out.println("Main Ended");
    }
	public static void getGrocerie()
	{
		System.out.println("Inside the getGrocerie()");
		System.out.println("Total Number of Groceries are: " + groceries.length);
        System.out.println("The list of Groceries are:");
        for(String grocerie : groceries)
		{
			System.out.println(grocerie);
		}
		System.out.println("Exiting the getGrocerie()");
	}
	public static void getPerfume()
	{
		System.out.println("Inside the getPerfume()");
		System.out.println("Total Number of Perfumes are: " + perfumes.length);
        System.out.println("The list of Perfumes are:");
		for(String perfume : perfumes)
		{
			System.out.println(perfume);
		}
		System.out.println("Exiting the getPerfume()");
	}
	public static void getBiscuit()
	{
		System.out.println("Inside the getBiscuit()");
		System.out.println("Total Number of Biscuits are: " + biscuits.length);
        System.out.println("The list of Biscuits are:");
        for(String biscuit : biscuits)
		{
			System.out.println(biscuit);
		}
		System.out.println("Exiting the getBiscuit()");
	}
	public static void getUtensil()
	{
		System.out.println("Inside the getUtensil()");
		System.out.println("Total Number of Utensils are: " + utensils.length);
        System.out.println("The list of Utensils are:");
        for(String utensil : utensils)
		{
			System.out.println(utensil);
		}
		System.out.println("Exiting the getUtensil()");
	}
	public static void getVegetable()
	{
		System.out.println("Inside the getVegetable()");
	    System.out.println("Total Number of Vegetables are: " + vegetables.length);
        System.out.println("The list of Vegetables are:");
        for(String vegetable : vegetables)
		{
			System.out.println(vegetable);
		}
		System.out.println("Exiting the getVegetable()");
	}
}



