class Airport 
{
    public static void getGate() 
	{
        System.out.println("Inside the getGate()");
        Gate.getTerminal(); 
        System.out.println("Exiting the getGate()");
    }
}
