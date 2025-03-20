class FoodPandaRunner 
{
    public static void main(String Panda[]) 
	{
        String foodName = "Benne Masala Dosa";
		int quantity =2;  
        double price = FoodPanda.foodPrice(foodName); 
        System.out.println("The price of " + foodName + " is: " + price);
		double priceQuantity = FoodPanda.foodPrice(foodName,quantity);
		System.out.println("The price of the "+foodName+" for the requred quantity "+quantity+" is "+priceQuantity);
    }
}
