class SitaraHotel
{
    static String menus[] = {"Idly", "Kesari Bath", "Pongal", "Masala Dosa", "Tomato Uttappam", "Masala Uttappam", "Roti Curry", "Parotta Curry", "Paneer Tikka", "Tandoor Aloo"};

    public static void main(String CUR8[]) 
    {
        System.out.println("Main Started");

        System.out.println(" ");
        getMenus();
        System.out.println(" ");
        
        System.out.println("Main Ended");
    }

    public static void getMenus()
    {
        System.out.println("Inside the getMenus()");
        System.out.println("Total Number of Menus are: " + menus.length);
        System.out.println("The list of Menus in Sitara Hotel are:");
        for(String menu : menus)
        {
            System.out.println(menu);
        }
        System.out.println("Exiting the getMenus()");
    }
}
