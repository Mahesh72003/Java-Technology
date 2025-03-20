class PinCodes 
{
    public static void main(String pinCodes[]) 
    {
        long area[]={560022,560064,560027,560040,560001,560056,562130,560020,560010,560079};
        System.out.println("Main started");
        System.out.println("total No of Area Pin codes are: "+area.length);
        System.out.println("The list of Area Pin codes are");
        //System.out.println(area[0]+" "+area[1]+" "+area[2]+" "+area[3]+" "+area[4]+" "+area[5]+" "+area[6]+" "+area[7]+" "+area[8]+" "+area[9]);
        for(long areas : area)
		{
			System.out.println(areas);
		}
		System.out.println("Main ended");
    }
}