class SitaraHotel
{
    public static void main(String CUR8[])
    {
        System.out.println("Main Started");
        String menus[] = {"Idly","Kesari Bath","Pongal","Masala Dosa","Tomato Uttappam","Masala Uttappam","Roti Curry","Parotta Curry","Paneer Tikka","Tandoor Aloo"};
        System.out.println("Total No of menus add are: "+menus.length);
        System.out.println("THe list of menus in Sitara Hotel");
        //System.out.println(menus[0]+" "+menus[1]+" "+menus[2]+" "+menus[3]+" "+menus[4]+" "+menus[5]+" "+menus[6]+" "+menus[7]+" "+menus[8]+" "+menus[9]);
		for(String menu : menus)
		{
			System.out.println(menu);
		}
		System.out.println("Main Ended");
    }
}