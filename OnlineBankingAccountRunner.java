class OnlineBankingAccountRunner 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Started");
        String message = null;

        message = OnlineBankingAccount.accountSignUp("123456789012", "123456", "9591534551", "mahesh@example.com", "1234567812345678", "07/06/2003", "securePass123", "securePass123");

        System.out.println(message);
        System.out.println("Main Ended");
    }
}
