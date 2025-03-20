class Zepto 
{
    public static double foodPrice(String foodName) 
    {
        double foodPrice = 0.0;

        if (foodName == "Ratatouille") 
        {
            foodPrice = 250.00;
            return foodPrice;
        } 
        else if (foodName == "Gobi Manchurian") 
        {
            foodPrice = 160.00;
            return foodPrice;
        } 
        else if (foodName == "Lauki Ki Sabzi") 
        {
            foodPrice = 130.00;
            return foodPrice;
        } 
        else if (foodName == "Aloo Baingan") 
        {
            foodPrice = 140.00;
            return foodPrice;
        } 
        else if (foodName == "Methi Aloo") 
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (foodName == "Paneer Butter Masala") 
        {
            foodPrice = 250.00;
            return foodPrice;
        } 
        else if (foodName == "Kadai Paneer") 
        {
            foodPrice = 230.00;
            return foodPrice;
        } 
        else if (foodName == "Patra") 
        {
            foodPrice = 90.00;
            return foodPrice;
        } 
        else if (foodName == "Aloo Mutter") 
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (foodName == "Matar Paneer") 
        {
            foodPrice = 200.00;
            return foodPrice;
        } 
        else if (foodName == "Chocolate Pokada") 
        {
            foodPrice = 100.00;
            return foodPrice;
        } 
        else if (foodName == "Bhindi Do Pyaza") 
        {
            foodPrice = 150.00;
            return foodPrice;
        } 
        else if (foodName == "Mixed Vegetable Curry") 
        {
            foodPrice = 170.00;
            return foodPrice;
        } 
        else if (foodName == "Tinda Masala") 
        {
            foodPrice = 130.00;
            return foodPrice;
        } 
        else if (foodName == "Gobi Ki Sabzi") 
        {
            foodPrice = 150.00;
            return foodPrice;
        } 
        else if (foodName == "Punjabi Dum Aloo") 
        {
            foodPrice = 180.00;
            return foodPrice;
        } 
        else if (foodName == "Dhokli") 
        {
            foodPrice = 110.00;
            return foodPrice;
        } 
        else if (foodName == "Bharwa Baingan") 
        {
            foodPrice = 190.00;
            return foodPrice;
        } 
        else if (foodName == "Polenta with Cheese") 
        {
            foodPrice = 230.00;
            return foodPrice;
        } 
        else if (foodName == "Rajasthani Gatta") 
        {
            foodPrice = 160.00;
            return foodPrice;
        }
	
        else if (foodName == "Mutton Rogan Josh") 
        {
            foodPrice = 350.00;
            return foodPrice;
        } 
        else if (foodName == "Chicken Korma") 
        {
            foodPrice = 300.00;
            return foodPrice;
        } 
        else if (foodName == "Mutton Seekh Kebab") 
        {
            foodPrice = 270.00;
            return foodPrice;
        } 
        else if (foodName == "Fish Fry") 
        {
            foodPrice = 350.00;
            return foodPrice;
        } 
        else if (foodName == "Prawn Masala") 
        {
            foodPrice = 380.00;
            return foodPrice;
        } 
        else if (foodName == "Mutton Shami Kebab") 
        {
            foodPrice = 240.00;
            return foodPrice;
        } 
        else if (foodName == "Chicken Chettinad") 
        {
            foodPrice = 280.00;
            return foodPrice;
        } 
        else if (foodName == "Kalmi Kebab") 
        {
            foodPrice = 250.00;
            return foodPrice;
        } 
        else if (foodName == "Tandoori Fish") 
        {
            foodPrice = 300.00;
            return foodPrice;
        } 
        else if (foodName == "Kadhai Mutton") 
        {
            foodPrice = 350.00;
            return foodPrice;
        } 
        else if (foodName == "Mughlai Korma") 
        {
            foodPrice = 320.00;
            return foodPrice;
        } 
        else if (foodName == "Keema") 
        {
            foodPrice = 230.00;
            return foodPrice;
        } 
        else if (foodName == "Prawn Curry") 
        {
            foodPrice = 360.00;
            return foodPrice;
        } 
        else if (foodName == "Chicken Tikka") 
        {
            foodPrice = 270.00;
            return foodPrice;
        } 
        else if (foodName == "Mutton Kofta") 
        {
            foodPrice = 310.00;
            return foodPrice;
        } 
        else if (foodName == "Egg Curry") 
        {
            foodPrice = 150.00;
            return foodPrice;
        } 
        else if (foodName == "Koli Curry") 
        {
            foodPrice = 280.00;
            return foodPrice;
        } 
        else if (foodName == "Fish Molee") 
        {
            foodPrice = 330.00;
            return foodPrice;
        } 
        else if (foodName == "Chicken Vindaloo") 
        {
            foodPrice = 250.00;
            return foodPrice;
        } 
        else if (foodName == "Fish Tikka") 
        {
            foodPrice = 280.00;
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

        if (foodName == "Ratatouille") 
        {
            foodPrice = 2500*quantity;
            return foodPrice;
        } 
        else if (foodName == "Gobi Manchurian") 
        {
            foodPrice = 1600*quantity;
            return foodPrice;
        } 
        else if (foodName == "Lauki Ki Sabzi") 
        {
            foodPrice = 1300*quantity;
            return foodPrice;
        } 
        else if (foodName == "Aloo Baingan") 
        {
            foodPrice = 1400*quantity;
            return foodPrice;
        } 
        else if (foodName == "Methi Aloo") 
        {
            foodPrice = 1200*quantity;
            return foodPrice;
        } 
        else if (foodName == "Paneer Butter Masala") 
        {
            foodPrice = 2500*quantity;
            return foodPrice;
        } 
        else if (foodName == "Kadai Paneer") 
        {
            foodPrice = 2300*quantity;
            return foodPrice;
        } 
        else if (foodName == "Patra") 
        {
            foodPrice = 900*quantity;
            return foodPrice;
        } 
        else if (foodName == "Aloo Mutter") 
        {
            foodPrice = 1200*quantity;
            return foodPrice;
        } 
        else if (foodName == "Matar Paneer") 
        {
            foodPrice = 2000*quantity;
            return foodPrice;
        } 
        else if (foodName == "Chocolate Pokada") 
        {
            foodPrice = 1000*quantity;
            return foodPrice;
        } 
        else if (foodName == "Bhindi Do Pyaza") 
        {
            foodPrice = 1500*quantity;
            return foodPrice;
        } 
        else if (foodName == "Mixed Vegetable Curry") 
        {
            foodPrice = 1700*quantity;
            return foodPrice;
        } 
        else if (foodName == "Tinda Masala") 
        {
            foodPrice = 1300*quantity;
            return foodPrice;
        } 
        else if (foodName == "Gobi Ki Sabzi") 
        {
            foodPrice = 1500*quantity;
            return foodPrice;
        } 
        else if (foodName == "Punjabi Dum Aloo") 
        {
            foodPrice = 1800*quantity;
            return foodPrice;
        } 
        else if (foodName == "Dhokli") 
        {
            foodPrice = 1100*quantity;
            return foodPrice;
        } 
        else if (foodName == "Bharwa Baingan") 
        {
            foodPrice = 1900*quantity;
            return foodPrice;
        } 
        else if (foodName == "Polenta with Cheese") 
        {
            foodPrice = 2300*quantity;
            return foodPrice;
        } 
        else if (foodName == "Rajasthani Gatta") 
        {
            foodPrice = 1600*quantity;
            return foodPrice;
        }
	
        else if (foodName == "Mutton Rogan Josh") 
        {
            foodPrice = 3500*quantity;
            return foodPrice;
        } 
        else if (foodName == "Chicken Korma") 
        {
            foodPrice = 3000*quantity;
            return foodPrice;
        } 
        else if (foodName == "Mutton Seekh Kebab") 
        {
            foodPrice = 2700*quantity;
            return foodPrice;
        } 
        else if (foodName == "Fish Fry") 
        {
            foodPrice = 3500*quantity;
            return foodPrice;
        } 
        else if (foodName == "Prawn Masala") 
        {
            foodPrice = 3800*quantity;
            return foodPrice;
        } 
        else if (foodName == "Mutton Shami Kebab") 
        {
            foodPrice = 2400*quantity;
            return foodPrice;
        } 
        else if (foodName == "Chicken Chettinad") 
        {
            foodPrice = 2800*quantity;
            return foodPrice;
        } 
        else if (foodName == "Kalmi Kebab") 
        {
            foodPrice = 2500*quantity;
            return foodPrice;
        } 
        else if (foodName == "Tandoori Fish") 
        {
            foodPrice = 3000*quantity;
            return foodPrice;
        } 
        else if (foodName == "Kadhai Mutton") 
        {
            foodPrice = 3500*quantity;
            return foodPrice;
        } 
        else if (foodName == "Mughlai Korma") 
        {
            foodPrice = 3200*quantity;
            return foodPrice;
        } 
        else if (foodName == "Keema") 
        {
            foodPrice = 2300*quantity;
            return foodPrice;
        } 
        else if (foodName == "Prawn Curry") 
        {
            foodPrice = 3600*quantity;
            return foodPrice;
        } 
        else if (foodName == "Chicken Tikka") 
        {
            foodPrice = 2700*quantity;
            return foodPrice;
        } 
        else if (foodName == "Mutton Kofta") 
        {
            foodPrice = 3100*quantity;
            return foodPrice;
        } 
        else if (foodName == "Egg Curry") 
        {
            foodPrice = 1500*quantity;
            return foodPrice;
        } 
        else if (foodName == "Koli Curry") 
        {
            foodPrice = 2800*quantity;
            return foodPrice;
        } 
        else if (foodName == "Fish Molee") 
        {
            foodPrice = 3300*quantity;
            return foodPrice;
        } 
        else if (foodName == "Chicken Vindaloo") 
        {
            foodPrice = 2500*quantity;
            return foodPrice;
        } 
        else if (foodName == "Fish Tikka") 
        {
            foodPrice = 2800*quantity;
            return foodPrice;
        }

        else 
        {
            System.out.println("Please provide a correct name of the food item.");
            return foodPrice;
        }
    }
}
