class OLAAccountRunner 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Started");
        String message = null;

        message = OLAAccount.accountSignUp("Mahesh A V", "9591534551", "07/06/2003", "Bengaluru", "Toyota", "Innova", "KA01AB1234", "RC123456", "DL123456", "PUC123456", "1234561234", "PAN123456", "123456123456");

        System.out.println(message);
        System.out.println("Main Ended");
    }
}
