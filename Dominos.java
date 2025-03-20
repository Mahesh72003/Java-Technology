class Dominos 
{
    public static double foodPrice(String foodName) 
    {
        double foodPrice = 0.0;
		
        if (foodName== "Margherita Pizza") 
        {
            foodPrice = 199.99;
            return foodPrice;
        } 
        else if (foodName== "Veg Supreme Pizza") 
        {
            foodPrice = 229.99;
            return foodPrice;
        } 
        else if (foodName== "Peppy Paneer Pizza") 
        {
            foodPrice = 249.99;
            return foodPrice;
        } 
        else if (foodName== "Paneer Tikka Pizza") 
        {
            foodPrice = 259.99;
            return foodPrice;
        } 
        else if (foodName== "Veg Extravaganza Pizza") 
        {
            foodPrice = 269.99;
            return foodPrice;
        } 
        else if (foodName== "Spicy Paneer Pizza") 
        {
            foodPrice = 249.99;
            return foodPrice;
        } 
        else if (foodName== "Tandoori Paneer Pizza") 
        {
            foodPrice = 269.99;
            return foodPrice;
        } 
        else if (foodName== "Butter Chicken Pizza") 
        {
            foodPrice = 299.99;
            return foodPrice;
        } 
        else if (foodName== "Chicken Tikka Pizza") 
        {
            foodPrice = 319.99;
            return foodPrice;
        } 
        else if (foodName== "BBQ Chicken Pizza") 
        {
            foodPrice = 319.99;
            return foodPrice;
        } 
        else if (foodName== "Peri Peri Chicken Pizza") 
        {
            foodPrice = 329.99;
            return foodPrice;
        } 
        else if (foodName== "Chicken Keema Pizza") 
        {
            foodPrice = 319.99;
            return foodPrice;
        } 
        else if (foodName== "Malai Tikka Pizza") 
        {
            foodPrice = 329.99;
            return foodPrice;
        } 
        else if (foodName== "Mutton Keema Pizza") 
        {
            foodPrice = 349.99;
            return foodPrice;
        } 
        else if (foodName== "Tandoori Chicken Pizza") 
        {
            foodPrice = 329.99;
            return foodPrice;
        } 
        else if (foodName== "Chettinad Chicken Pizza") 
        {
            foodPrice = 339.99;
            return foodPrice;
        } 
        else if (foodName== "Prawn Masala Pizza") 
        {
            foodPrice = 349.99;
            return foodPrice;
        } 
        else if (foodName== "Goan Fish Curry Pizza") 
        {
            foodPrice = 359.99;
            return foodPrice;
        } 
        else if (foodName== "Punjabi Veggie Pizza") 
        {
            foodPrice = 259.99;
            return foodPrice;
        } 
        else if (foodName== "Aloo Tikki Pizza") 
        {
            foodPrice = 219.99;
            return foodPrice;
        } 
        else if (foodName== "Chole Bhature Pizza") 
        {
            foodPrice = 239.99;
            return foodPrice;
        } 
        else if (foodName== "Gobi Manchurian Pizza") 
        {
            foodPrice = 249.99;
            return foodPrice;
        } 
        else if (foodName== "Hyderabadi Biryani Pizza") 
        {
            foodPrice = 279.99;
            return foodPrice;
        } 
        else if (foodName== "Samosa Pizza") 
        {
            foodPrice = 229.99;
            return foodPrice;
        } 
        else if (foodName== "Dosa Pizza") 
        {
            foodPrice = 239.99;
            return foodPrice;
        } 
        else if (foodName== "Pav Bhaji Pizza") 
        {
            foodPrice = 249.99;
            return foodPrice;
        } 
        else if (foodName== "Rajma Pizza") 
        {
            foodPrice = 219.99;
            return foodPrice;
        } 
        else if (foodName== "Chana Masala Pizza") 
        {
            foodPrice = 229.99;
            return foodPrice;
        } 
        else if (foodName== "Baingan Bharta Pizza") 
        {
            foodPrice = 239.99;
            return foodPrice;
        } 
        else if (foodName== "Kadhai Paneer Pizza") 
        {
            foodPrice = 259.99;
            return foodPrice;
        } 
        else if (foodName== "Malabar Chicken Pizza") 
        {
            foodPrice = 319.99;
            return foodPrice;
        } 
        else if (foodName== "Achari Paneer Pizza") 
        {
            foodPrice = 259.99;
            return foodPrice;
        } 
        else if (foodName== "Pesarattu Pizza") 
        {
            foodPrice = 249.99;
            return foodPrice;
        } 
        else if (foodName== "Vegetable Korma Pizza") 
        {
            foodPrice = 259.99;
            return foodPrice;
        } 
        else if (foodName== "Methi Malai Murg Pizza") 
        {
            foodPrice = 279.99;
            return foodPrice;
        } 
        else if (foodName== "Garlic Naan Pizza") 
        {
            foodPrice = 219.99;
            return foodPrice;
        } 
        else if (foodName== "Bombay Sandwich Pizza") 
        {
            foodPrice = 239.99;
            return foodPrice;
        } 
        else if (foodName== "Pesto Paneer Pizza") 
        {
            foodPrice = 259.99;
            return foodPrice;
        } 
        else if (foodName== "Paneer Makhani Pizza") 
        {
            foodPrice = 269.99;
            return foodPrice;
        } 
        else if (foodName== "Mushroom Methi Pizza") 
        {
            foodPrice = 249.99;
            return foodPrice;
        } 
        else 
        {
            System.out.println("Please provide a correct name of the food item.");
            return foodPrice;
        }
    }

	public static double foodPrice(String foodName, int quantity) 
    {
        double foodPrice = 0.0;
		
        if (foodName== "Margherita Pizza") 
        {
            foodPrice = 199.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Veg Supreme Pizza") 
        {
            foodPrice = 229.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Peppy Paneer Pizza") 
        {
            foodPrice = 249.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Paneer Tikka Pizza") 
        {
            foodPrice = 259.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Veg Extravaganza Pizza") 
        {
            foodPrice = 269.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Spicy Paneer Pizza") 
        {
            foodPrice = 249.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Tandoori Paneer Pizza") 
        {
            foodPrice = 269.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Butter Chicken Pizza") 
        {
            foodPrice = 299.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Chicken Tikka Pizza") 
        {
            foodPrice = 319.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "BBQ Chicken Pizza") 
        {
            foodPrice = 319.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Peri Peri Chicken Pizza") 
        {
            foodPrice = 329.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Chicken Keema Pizza") 
        {
            foodPrice = 319.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Malai Tikka Pizza") 
        {
            foodPrice = 329.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Mutton Keema Pizza") 
        {
            foodPrice = 349.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Tandoori Chicken Pizza") 
        {
            foodPrice = 329.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Chettinad Chicken Pizza") 
        {
            foodPrice = 339.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Prawn Masala Pizza") 
        {
            foodPrice = 349.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Goan Fish Curry Pizza") 
        {
            foodPrice = 359.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Punjabi Veggie Pizza") 
        {
            foodPrice = 259.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Aloo Tikki Pizza") 
        {
            foodPrice = 219.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Chole Bhature Pizza") 
        {
            foodPrice = 239.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Gobi Manchurian Pizza") 
        {
            foodPrice = 249.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Hyderabadi Biryani Pizza") 
        {
            foodPrice = 279.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Samosa Pizza") 
        {
            foodPrice = 229.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Dosa Pizza") 
        {
            foodPrice = 239.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Pav Bhaji Pizza") 
        {
            foodPrice = 249.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Rajma Pizza") 
        {
            foodPrice = 219.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Chana Masala Pizza") 
        {
            foodPrice = 229.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Baingan Bharta Pizza") 
        {
            foodPrice = 239.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Kadhai Paneer Pizza") 
        {
            foodPrice = 259.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Malabar Chicken Pizza") 
        {
            foodPrice = 319.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Achari Paneer Pizza") 
        {
            foodPrice = 259.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Pesarattu Pizza") 
        {
            foodPrice = 249.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Vegetable Korma Pizza") 
        {
            foodPrice = 259.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Methi Malai Murg Pizza") 
        {
            foodPrice = 279.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Garlic Naan Pizza") 
        {
            foodPrice = 219.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Bombay Sandwich Pizza") 
        {
            foodPrice = 239.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Pesto Paneer Pizza") 
        {
            foodPrice = 259.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Paneer Makhani Pizza") 
        {
            foodPrice = 269.99*quantity;
            return foodPrice;
        } 
        else if (foodName== "Mushroom Methi Pizza") 
        {
            foodPrice = 249.99*quantity;
            return foodPrice;
        } 
        else 
        {
            System.out.println("Please provide a correct name of the food item.");
            return foodPrice;
        }
    }
}
