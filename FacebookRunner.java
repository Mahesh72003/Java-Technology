class FacebookRunner
{
    public static void main(String mahesh[])
    {
        String Email = "maheshvanjre@gmail.com";
        String password = "mahesh";
        long phoneNumber = 8904644069L; 

        String logingEmail = Facebook.loging(Email, password);
        System.out.println(logingEmail);

        String logingPhone = Facebook.loging(phoneNumber, password);
        System.out.println(logingPhone);
    }
}

