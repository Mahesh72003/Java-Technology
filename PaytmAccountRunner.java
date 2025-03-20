class PaytmAccountRunner 
{
    public static void main(String Paytm[]) 
    {
        System.out.println("Main Started");
        String message = null;

        message = PaytmAccount.accountSignUp("Mahesh A V", "9591534551", "mahesh@example.com", "1234", "5678", "123456789012", "123456");

        System.out.println(message);
        System.out.println("Main Ended");
    }
}
