class ZeptoRunner 
{
    public static void main(String Zept[])
	{
        String foodName = "Chicken Korma"; 
		int  quantity= 4;
        double price = Zepto.foodPrice(foodName);
        System.out.println("The price of " + foodName + " is: " + price);
		double priceQuantity = Zepto.foodPrice(foodName,quantity);
		System.out.println("The price of the "+foodName+" for the requred quantity "+quantity+" is "+priceQuantity);
    }
}
