class MoreSuperMarket 
{
    public static void main(String retail[]) 
	{
        System.out.println("Main Started");
        String groceries[] = {"Rice", "Wheat Flour", "Sugar", "Salt", "Oil", "Pulses", "Spices", "Tea", "Coffee", "Ghee"};
        String perfumes[] = {"Chanel No. 5", "Dior Sauvage", "Yves Saint Laurent", "Gucci Bloom", "Tom Ford Black Orchid","Armani Code", "Versace Eros", "Creed Aventus", "Paco Rabanne Invictus", "Calvin Klein Eternity"};
        String biscuits[] = {"Oreo", "Britannia Good Day", "Hide & Seek", "Treat", "Jim Jam", "Parle-G", "Digestive","Milk Bikis", "Marie", "Munch"};
        String utensils[] = {"Plate", "Bowl", "Cup", "Glass", "Spoon", "Fork", "Knife", "Teapot", "Saucepan", "Frying Pan"};
        String vegetables[] = {"Tomato", "Potato", "Onion", "Carrot", "Spinach", "Cabbage", "Cauliflower", "Brinjal", "Cucumber", "Green Chile"};
        // Arrays of groceries
        System.out.println("Total Number of Groceries are: " + groceries.length);
        System.out.println("The list of Groceries are:");
        //System.out.println(groceries[0] + " " + groceries[1] + " " + groceries[2] + " " + groceries[3] + " " + groceries[4] + " "+ groceries[5] + " " + groceries[6] + " " + groceries[7] + " " + groceries[8] + " " + groceries[9]);
		for(String grocerie : groceries)
		{
			System.out.println(grocerie);
		}
	   // Arrays of perfumes
        System.out.println("Total Number of Perfumes are: " + perfumes.length);
        System.out.println("The list of Perfumes are:");
        //System.out.println(perfumes[0] + " " + perfumes[1] + " " + perfumes[2] + " " + perfumes[3] + " " + perfumes[4] + " "+ perfumes[5] + " " + perfumes[6] + " " + perfumes[7] + " " + perfumes[8] + " " + perfumes[9]);
		for(String perfume : perfumes)
		{
			System.out.println(perfume);
		}
	   // Arrays of biscuits
        System.out.println("Total Number of Biscuits are: " + biscuits.length);
        System.out.println("The list of Biscuits are:");
        //System.out.println(biscuits[0] + " " + biscuits[1] + " " + biscuits[2] + " " + biscuits[3] + " " + biscuits[4] + " "+ biscuits[5] + " " + biscuits[6] + " " + biscuits[7] + " " + biscuits[8] + " " + biscuits[9]);
        for(String biscuit : biscuits)
		{
			System.out.println(biscuit);
		}
		// Arrays of utensils
        System.out.println("Total Number of Utensils are: " + utensils.length);
        System.out.println("The list of Utensils are:");
        //System.out.println(utensils[0] + " " + utensils[1] + " " + utensils[2] + " " + utensils[3] + " " + utensils[4] + " "+ utensils[5] + " " + utensils[6] + " " + utensils[7] + " " + utensils[8] + " " + utensils[9]);
        for(String utensil : utensils)
		{
			System.out.println(utensil);
		}
		// Arrays of vegetables
        System.out.println("Total Number of Vegetables are: " + vegetables.length);
        System.out.println("The list of Vegetables are:");
        System.out.println(vegetables[0] + " " + vegetables[1] + " " + vegetables[2] + " " + vegetables[3] + " " + vegetables[4] + " "+ vegetables[5] + " " + vegetables[6] + " " + vegetables[7] + " " + vegetables[8] + " " + vegetables[9]);
        for(String vegetable : vegetables)
		{
			System.out.println(vegetable);
		}
		System.out.println("Main Ended");
    }
}
