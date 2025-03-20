class SnapchatRunner
{
    public static void main(String snap[])
    {
        String Email = "maheshvanjre@gmail.com";
        String password = "mahesh";
        long phoneNumber = 8904644069L;

        String logingEmail = Snapchat.loging(Email, password);
        System.out.println(logingEmail);

        String logingSnapchat = Snapchat.loging(phoneNumber, password);
        System.out.println(logingSnapchat);
    }
}
