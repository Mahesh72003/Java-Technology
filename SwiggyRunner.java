class SwiggyRunner
 {
    public static void main(String food[])
	{
        String foodName = "Vada";  
		int quantity =2;
        double price = Swiggy.foodPrice(foodName); 
        System.out.println("The price of " + foodName + " is: " + price);
		double priceQuantity = Swiggy.foodPrice(foodName,quantity);
		System.out.println("The price of the "+foodName+" for the requred quantity "+quantity+" is "+priceQuantity);
    }
}
