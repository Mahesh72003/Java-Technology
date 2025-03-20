class AmazonSignUpRunner 
{
    public static void main(String amazon[]) 
	{
        System.out.println("Main Started");
        String message = null;
        message = AmazonSignUp.userProfileSignUp("Mahesh", "987654310", "password14523", "passwrd14523","mahesh@gmail.com");
        System.out.println(message);
        System.out.println("Main Ended");
    }
}
