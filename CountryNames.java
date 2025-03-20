class CountryNames 
{
    public static void main(String earth[]) 
	{
        System.out.println("Main Started");
        String countries[] = {"India","USA", "China", "Brazil", "Australia", "Germany", "France", "UK", "Canada", "Japan",
                                "South Korea", "Italy", "Mexico", "Russia", "South Africa", "Spain", "Indonesia", "Turkey", 
                                "Saudi Arabia", "Argentina","Nigeria", "Egypt", "Italy", "Colombia", "Vietnam", "Thailand", 
                                "Malaysia", "Singapore", "Philippines", "Colombia","Poland", "Ukraine", "Iraq", "Israel", 
                                "Sweden", "Norway", "Denmark", "Finland", "Greece", "Switzerland"};
        System.out.println("Total Number of Countries are: " + countries.length);
        //System.out.println(countries[0] + " " + countries[1] + " " + countries[2] + " " + countries[3] + " " + countries[4] + " "+ countries[5] + " " + countries[6] + " " + countries[7] + " " + countries[8] + " " + countries[9] +                            " "+ countries[10] + " " + countries[11] + " " + countries[12] + " " + countries[13] + " " + countries[14] + " "+ countries[15] + " " + countries[16] + " " + countries[17] + " " + countries[18] + " " + countries[19] +                            " "+ countries[20] + " " + countries[21] + " " + countries[22] + " " + countries[23] + " " + countries[24] + " "+ countries[25] + " " + countries[26] + " " + countries[27] + " " + countries[28] + " " + countries[29] +                             " "+ countries[30] + " " + countries[31] + " " + countries[32] + " " + countries[33] + " " + countries[34] + " " + countries[35] + " " + countries[36] + " " + countries[37] + " " + countries[38] + " " + countries[39]);
        for(String countrie : countries)
		{
			System.out.println(countrie);
		}
		System.out.println("Main Ended");
    }
}
