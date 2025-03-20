class NewPassportRunner 
{
    public static void main(String[] args) 
	{
        System.out.println("Main Started");
        String message = null;

        message = NewPassport.passportSignUp("Post office", "Bangalore", "Mahesh", "vanjre","17/05/1996","test@outlook.com", true, "test@outlook.com","Test@123","Test@123","Birth City","banglore");

        System.out.println(message);
        System.out.println("Main Ended");
    }
}
