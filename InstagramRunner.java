class InstagramRunner
{
    public static void main(String insta[])
    {
        String email = "maheshvanjre@gmail.com";
        String password = "mahesh";
        long phoneNumber = 8904644069L; 
        String username = "mahesh123"; 

        String logingEmail = Instagram.loging(email, password);
        System.out.println(logingEmail);

        String logingPhone = Instagram.loging(phoneNumber, password);
        System.out.println(logingPhone);

        String logingUsername = Instagram.logingusername(password, username);
        System.out.println(logingUsername);
    }
}
