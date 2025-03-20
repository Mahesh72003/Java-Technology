class SBIAccountRunner 
{
    public static void main(String SBI[]) 
    {
        System.out.println("Main Started");
        String message = null;

        message = SBIAccount.accountSignUp( "Mahesh A V", "9591534551","9876543210","mahesh@example.com", "07/06/2003",  "ABCDE1234F", "123456789012");

        System.out.println(message);
        System.out.println("Main Ended");
    }
}
