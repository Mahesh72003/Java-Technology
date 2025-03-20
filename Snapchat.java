class Snapchat
{
    public static String loging(String emailId, String password)
    {
        String message = null;
        if(emailId=="maheshvanjre@gmail.com" && password=="mahesh")
        {
            message = "Login is successful with email";
        }
        else
        {
            message = "Login is unsuccessful. Please check your email and password.";
        }
        return message;
    }

    public static String loging(long phoneNumber, String password)
    {
        String message = null;
        if(phoneNumber==8904644069L && password=="mahesh")
        {
            message = "Login is successful with Phone Number";
        }
        else
        {
            message = "Login is unsuccessful. Please check your Snapchat Phone Number and password.";
        }
        return message;
    }
}
