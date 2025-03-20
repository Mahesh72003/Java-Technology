class Character 
{
	static char chars[] = {'A', '0', 'C', '3', '(', '?', 't', '!', '5', '+'};
    public static void main(String alphabets[])
    {
        System.out.println("Main Started");
		System.out.println(" ");
        getCharacter();
		System.out.println(" ");
		System.out.println("Main Ended");
    }
	
	public static void getCharacter()
	{
		System.out.println("Inside the getCharacter()");
		System.out.println("Total No of Character are: "+chars.length);
        System.out.println("The list of Character are");
		for(char character : chars)
		{
			System.out.println(character);
		}
		System.out.println("End of getCharacter()");
	}
	
}
