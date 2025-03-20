class Character 
{
    public static void main(String alphabets[])
    {
        char chars[] = {'A', '0', 'C', '3', '(', '?', 't', '!', '5', '+'};
        System.out.println("Main Started");
        System.out.println("Total No of Character are: "+chars.length);
        System.out.println("The list of Character are");
        //System.out.println(chars[0]+" "+chars[1]+" "+chars[2]+" "+chars[3]+" "+chars[4]+" "+chars[5]+" "+chars[6]+" "+chars[7]+" "+chars[8]+" "+chars[9]);
        for(char character : chars)
		{
			System.out.println(character);
		}
		System.out.println("Main Ended");
    }
}
