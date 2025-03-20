class OlaFoodsRunner 
{
    public static void main(String Ola[]) 
	{
        
        String foodName = "Gulab Jamun";  
        int quantity =2;
		double price = OlaFoods.foodPrice(foodName);
        System.out.println("The price of " + foodName + " is: " + price);
		double priceQuantity = OlaFoods.foodPrice(foodName,quantity);
		System.out.println("The price of the "+foodName+" for the requred quantity "+quantity+" is "+priceQuantity);
    }
}
