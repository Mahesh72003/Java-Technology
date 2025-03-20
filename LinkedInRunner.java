class LinkedInRunner
{
    public static void main(String link[])
    {
        String Email = "maheshvanjre@gmail.com";
        String password = "mahesh";
        long phoneNumber = 8904644069L;
        String logingEmail = LinkedIn.loging(Email, password);
        System.out.println(logingEmail);
        String logingPhone = LinkedIn.loging(phoneNumber, password);
        System.out.println(logingPhone);
    }
}
