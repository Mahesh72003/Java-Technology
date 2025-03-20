class Swiggy
 {
    public static double foodPrice(String foodName) 
	{
        double foodPrice = 0.0;

        if (foodName == "Dosa") 
        {
            foodPrice = 80.62;
            return foodPrice;
        } 
        else if (foodName == "Idli") 
        {
            foodPrice = 60.45;
            return foodPrice;
        } 
        else if (foodName == "Vada") 
        {
            foodPrice = 50.98;
            return foodPrice;
        } 
        else if (foodName == "Sambar") 
        {
            foodPrice = 40.57;
            return foodPrice;
        } 
        else if (foodName == "Pongal") 
        {
            foodPrice = 75.45;
            return foodPrice;
        } 
        else if (foodName == "Upma") 
        {
            foodPrice = 50.20;
            return foodPrice;
        } 
        else if (foodName == "Rava Kesari") 
        {
            foodPrice = 55.10;
            return foodPrice;
        } 
        else if (foodName == "Medu Vada") 
        {
            foodPrice = 45.80;
            return foodPrice;
        } 
        else if (foodName == "Kachori") 
        {
            foodPrice = 50.56;
            return foodPrice;
        } 
        else if (foodName == "Batata Vada") 
        {
            foodPrice = 35.30;
            return foodPrice;
        } 
        else if (foodName == "Poori") 
        {
            foodPrice = 60.30;
            return foodPrice;
        } 
        else if (foodName == "Aloo Paratha") 
        {
            foodPrice = 100.49;
            return foodPrice;
        } 
        else if (foodName == "Rawa Idli") 
        {
            foodPrice = 70.55;
            return foodPrice;
        } 
        else if (foodName == "Frittata") 
        {
            foodPrice = 120.50;
            return foodPrice;
        } 
        else if (foodName == "Thepla") 
        {
            foodPrice = 85.70;
            return foodPrice;
        } 
        else if (foodName == "Taco") 
        {
            foodPrice = 150.00;
            return foodPrice;
        } 
        else if (foodName == "Panzerotti") 
        {
            foodPrice = 180.00;
            return foodPrice;
        } 
        else if (foodName == "Chilaquiles") 
        {
            foodPrice = 130.00;
            return foodPrice;
        } 
        else if (foodName == "Risotto") 
        {
            foodPrice = 250.00;
            return foodPrice;
        } 
        else if (foodName == "Akara") 
        {
            foodPrice = 70.00;
            return foodPrice;
        } 
        else if (foodName == "Margherita Pizza") 
        {
            foodPrice = 200.00;
            return foodPrice;
        } 
        else if (foodName == "Bisibele Bath") 
        {
            foodPrice = 90.00;
            return foodPrice;
        } 
        else if (foodName == "Neer Dosa") 
        {
            foodPrice = 75.00;
            return foodPrice;
        } 
        else if (foodName == "Polenta") 
        {
            foodPrice = 110.00;
            return foodPrice;
        } 
        else if (foodName == "Ragi Ball") 
        {
            foodPrice = 80.00;
            return foodPrice;
        } 
        else if (foodName == "Pasta alla Carbonara") 
        {
            foodPrice = 220.00;
            return foodPrice;
        } 
        else if (foodName == "Medu Vada Sambar") 
        {
            foodPrice = 100.50;
            return foodPrice;
        } 
        else if (foodName == "Uthappam") 
        {
            foodPrice = 95.00;
            return foodPrice;
        } 
        else if (foodName == "Benne Dosa") 
        {
            foodPrice = 105.00;
            return foodPrice;
        } 
        else if (foodName == "Sakkare Acchu") 
        {
            foodPrice = 65.00;
            return foodPrice;
        } 
        else if (foodName == "Arancini") 
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (foodName == "Kal Dosa") 
        {
            foodPrice = 90.00;
            return foodPrice;
        } 
        else if (foodName == "Chitranna") 
        {
            foodPrice = 85.00;
            return foodPrice;
        } 
        else if (foodName == "Kesaribath") 
        {
            foodPrice = 70.00;
            return foodPrice;
        } 
        else if (foodName == "Avalakki") 
        {
            foodPrice = 50.00;
            return foodPrice;
        } 
        else if (foodName == "Idli Manchurian") 
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (foodName == "Penne Arrabbiata") 
        {
            foodPrice = 180.00;
            return foodPrice;
        } 
        else if (foodName == "Rava Upma") 
        {
            foodPrice = 60.00;
            return foodPrice;
        } 
        else if (foodName == "Taco Salad") 
        {
            foodPrice = 140.00;
            return foodPrice;
        } 
        else if (foodName == "Kadhi Pakora") 
        {
            foodPrice = 110.00;
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

        if (foodName == "Dosa") 
        {
            foodPrice = 80.62*quantity;
            return foodPrice;
        } 
        else if (foodName == "Idli") 
        {
            foodPrice = 60.45*quantity;
            return foodPrice;
        } 
        else if (foodName == "Vada") 
        {
            foodPrice = 50.98*quantity;
            return foodPrice;
        } 
        else if (foodName == "Sambar") 
        {
            foodPrice = 40.57*quantity;
            return foodPrice;
        } 
        else if (foodName == "Pongal") 
        {
            foodPrice = 75.45*quantity;
            return foodPrice;
        } 
        else if (foodName == "Upma") 
        {
            foodPrice = 50.20*quantity;
            return foodPrice;
        } 
        else if (foodName == "Rava Kesari") 
        {
            foodPrice = 55.10*quantity;
            return foodPrice;
        } 
        else if (foodName == "Medu Vada") 
        {
            foodPrice = 45.80*quantity;
            return foodPrice;
        } 
        else if (foodName == "Kachori") 
        {
            foodPrice = 50.56*quantity;
            return foodPrice;
        } 
        else if (foodName == "Batata Vada") 
        {
            foodPrice = 35.30*quantity;
            return foodPrice;
        } 
        else if (foodName == "Poori") 
        {
            foodPrice = 60.30*quantity;
            return foodPrice;
        } 
        else if (foodName == "Aloo Paratha") 
        {
            foodPrice = 100.49*quantity;
            return foodPrice;
        } 
        else if (foodName == "Rawa Idli") 
        {
            foodPrice = 70.55*quantity;
            return foodPrice;
        } 
        else if (foodName == "Frittata") 
        {
            foodPrice = 120.50*quantity;
            return foodPrice;
        } 
        else if (foodName == "Thepla") 
        {
            foodPrice = 85.70*quantity;
            return foodPrice;
        } 
        else if (foodName == "Taco") 
        {
            foodPrice = 150.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Panzerotti") 
        {
            foodPrice = 180.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Chilaquiles") 
        {
            foodPrice = 130.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Risotto") 
        {
            foodPrice = 250.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Akara") 
        {
            foodPrice = 70.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Margherita Pizza") 
        {
            foodPrice = 200.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Bisibele Bath") 
        {
            foodPrice = 90.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Neer Dosa") 
        {
            foodPrice = 75.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Polenta") 
        {
            foodPrice = 110.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Ragi Ball") 
        {
            foodPrice = 80.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Pasta alla Carbonara") 
        {
            foodPrice = 220.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Medu Vada Sambar") 
        {
            foodPrice = 100.50*quantity;
            return foodPrice;
        } 
        else if (foodName == "Uthappam") 
        {
            foodPrice = 95.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Benne Dosa") 
        {
            foodPrice = 105.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Sakkare Acchu") 
        {
            foodPrice = 65.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Arancini") 
        {
            foodPrice = 120.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Kal Dosa") 
        {
            foodPrice = 90.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Chitranna") 
        {
            foodPrice = 85.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Kesaribath") 
        {
            foodPrice = 70.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Avalakki") 
        {
            foodPrice = 50.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Idli Manchurian") 
        {
            foodPrice = 120.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Penne Arrabbiata") 
        {
            foodPrice = 180.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Rava Upma") 
        {
            foodPrice = 60.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Taco Salad") 
        {
            foodPrice = 140.00*quantity;
            return foodPrice;
        } 
        else if (foodName == "Kadhi Pakora") 
        {
            foodPrice = 110.00*quantity;
            return foodPrice;
        } 
        else 
        {
            System.out.println("Please provide a correct name of the food item.");
            return foodPrice;
        }
    }
}
