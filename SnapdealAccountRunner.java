class SnapdealAccountRunner 
{
    public static void main(String Snapdeal[]) 
    {
        System.out.println("Main Started");
        String message = null;

        message = SnapdealAccount.accountSignUp("Mahesh A V","9591534551","mahesh@example.com", "1234567812345678", "123",  "Mahesh A V", "securePass123" );

        System.out.println(message);
        System.out.println("Main Ended");
    }
}
