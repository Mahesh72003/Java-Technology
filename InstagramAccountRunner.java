class InstagramAccountRunner 
{
    public static void main(String Instagram[]) 
	{
        System.out.println("Main Started");
        String message = null;

        message = InstagramAccount.accountSignUp( "mahesh@example.com","Mahesh A V", "mahesh123", "securePass123","securePass123","07/06/2003", "9591534551" );

        System.out.println(message);
        System.out.println("Main Ended");
    }
}
