class UberEatsRunner 
{
    public static void main(String  Uber[]) 
	{
        String foodName = "Butter Chicken";
		int  quantity=4;
        double price = UberEats.foodPrice(foodName);
        System.out.println("The price of " + foodName + " is: " + price);
		double priceQuantity = UberEats.foodPrice(foodName,quantity);
		System.out.println("The price of the "+foodName+" for the requred quantity "+quantity+" is "+priceQuantity);
    }
}
