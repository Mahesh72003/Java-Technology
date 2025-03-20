class PinCodes 
{
    static long area[] = {560022, 560064, 560027, 560040, 560001, 560056, 562130, 560020, 560010, 560079};

    public static void main(String pinCodes[]) 
    {
        System.out.println("Main Started");

        System.out.println(" ");
        getAreaPinCodes();
        System.out.println(" ");
        
        System.out.println("Main Ended");
    }

    public static void getAreaPinCodes()
    {
        System.out.println("Inside the getAreaPinCodes()");
        System.out.println("Total Number of Area Pin codes are: " + area.length);
        System.out.println("The list of Area Pin codes are:");
        for(long areas : area)
        {
            System.out.println(areas);
        }
        System.out.println("Exiting the getAreaPinCodes()");
    }
}
