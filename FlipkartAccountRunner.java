class FlipkartAccountRunner 
{
    public static void main(String Flipkart[]) 
	{
        System.out.println("Main Started");
        String message = null;
        
        message = FlipkartAccount.accountSignUp( "Mahesh",  "A V", "mahesh@gmila.com",  "9591534551","No 25, 17th Cross Rd, Vijayanagar, Bengaluru", "securePass123");
        
        System.out.println(message);
        
        System.out.println("Main Ended");
    }
}
