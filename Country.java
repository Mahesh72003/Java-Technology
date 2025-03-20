class Country
{
	public static void getCountry()
	{
		System.out.println("Inside the getCountry()");
		State.getState();
		System.out.println("Exiting the getCountry()");
	}
}