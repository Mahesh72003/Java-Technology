class State
{
	public static void getState()
	{
		System.out.println("Inside the getState()");
		City.getCity();
		System.out.println("Exiting the getState()");
	}
}