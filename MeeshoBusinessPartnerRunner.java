class MeeshoBusinessPartnerRunner 
{
    public static void main(String Meesho[])
	{
        System.out.println("Main Started");
        String message = null;
      
        message = MeeshoBusinessPartner.businessPartnerSignUp(
            "Mahesh","9876543210","mahesh@outlook.com", "Password16823", "hihii1234F","1234567890123456","IFSC0000123","Mahesh A V","123456789012");
        System.out.println(message);
        
        System.out.println("Main Ended");
    }
}
