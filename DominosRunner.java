class DominosRunner 
{
    public static void main(String pizza[]) 
	{
		int quantity =2;
        String foodName = "Butter Chicken Pizza"; 
        double price = Dominos.foodPrice(foodName);
        System.out.println("The price of " + foodName + " is: " + price);
		double priceQuantity = Dominos.foodPrice(foodName,quantity);
		System.out.println("The price of the "+foodName+" for the requred quantity "+quantity+" is "+priceQuantity);

    }
}
