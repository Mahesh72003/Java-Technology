class OlaFoods 
{
    public static double foodPrice(String foodName) 
	{
        double foodPrice = 0.0;

        if (foodName == "Gulab Jamun") 
        {
            foodPrice = 80.00;
        } 
        else if (foodName == "Rasgulla") 
        {
            foodPrice = 50.00;
        } 
        else if (foodName == "Jalebi") 
        {
            foodPrice = 60.00;
        } 
        else if (foodName == "Gajar ka Halwa") 
        {
            foodPrice = 90.00;
        } 
        else if (foodName == "Kaju Katli") 
        {
            foodPrice = 120.00;
        } 
        else if (foodName == "Ladoo") 
        {
            foodPrice = 70.00;
        } 
        else if (foodName == "Kulfi") 
        {
            foodPrice = 150.00;
        } 
        else if (foodName == "Doodh Peda") 
        {
            foodPrice = 80.00;
        } 
        else if (foodName == "Carrot Halwa") 
        {
            foodPrice = 95.00;
        } 
        else if (foodName == "Soan Papdi") 
        {
            foodPrice = 50.00;
        } 
        else if (foodName == "Peda") 
        {
            foodPrice = 75.00;
        } 
        else if (foodName == "Shrikhand") 
        {
            foodPrice = 100.00;
        }

        else if (foodName == "Hyderabadi Biryani") 
        {
            foodPrice = 250.00;
        } 
        else if (foodName == "Lucknowi Biryani") 
        {
            foodPrice = 280.00;
        } 
        else if (foodName == "Risotto ai Funghi") 
        {
            foodPrice = 220.00;
        } 
        else if (foodName == "Pulao") 
        {
            foodPrice = 150.00;
        } 
        else if (foodName == "Lemon Rice") 
        {
            foodPrice = 120.00;
        } 
        else if (foodName == "Arroz con Pollo") 
        {
            foodPrice = 210.00;
        } 
        else if (foodName == "Vegetable Biryani") 
        {
            foodPrice = 180.00;
        } 
        else if (foodName == "Chicken Biryani") 
        {
            foodPrice = 250.00;
        } 
        else if (foodName == "Mutton Biryani") 
        {
            foodPrice = 300.00;
        } 
        else if (foodName == "Egg Biryani") 
        {
            foodPrice = 220.00;
        } 
        else if (foodName == "Tawa Pulao") 
        {
            foodPrice = 130.00;
        } 
        else if (foodName == "Puliyodarai") 
        {
            foodPrice = 100.00;
        } 
        else if (foodName == "Ghee Rice") 
        {
            foodPrice = 120.00;
        } 
        else if (foodName == "Zafrani Pulao") 
        {
            foodPrice = 150.00;
        } 
        else if (foodName == "Khichdi") 
        {
            foodPrice = 100.00;
        } 
        else if (foodName == "Kashmiri Pulao") 
        {
            foodPrice = 180.00;
        } 
        else if (foodName == "Chitranna Rice") 
        {
            foodPrice = 110.00;
        } 
        else if (foodName == "Tamarind Rice") 
        {
            foodPrice = 120.00;
        } 
        else if (foodName == "Pongal Rice") 
        {
            foodPrice = 150.00;
        } 
        else if (foodName == "Vangi Bath") 
        {
            foodPrice = 130.00;
        }
        else 
        {
            System.out.println("Please provide a correct name of the food item.");
        }

        return foodPrice;
    }
	public static double foodPrice(String foodName, int quantity) 
	{
        double foodPrice = 0.0;

        if (foodName == "Gulab Jamun") 
        {
            foodPrice = 80.00*quantity;
        } 
        else if (foodName == "Rasgulla") 
        {
            foodPrice = 50.00*quantity;
        } 
        else if (foodName == "Jalebi") 
        {
            foodPrice = 60.00*quantity;
        } 
        else if (foodName == "Gajar ka Halwa") 
        {
            foodPrice = 90.00*quantity;
        } 
        else if (foodName == "Kaju Katli") 
        {
            foodPrice = 120.00*quantity;
        } 
        else if (foodName == "Ladoo") 
        {
            foodPrice = 70.00*quantity;
        } 
        else if (foodName == "Kulfi") 
        {
            foodPrice = 150.00*quantity;
        } 
        else if (foodName == "Doodh Peda") 
        {
            foodPrice = 80.00*quantity;
        } 
        else if (foodName == "Carrot Halwa") 
        {
            foodPrice = 95.00*quantity;
        } 
        else if (foodName == "Soan Papdi") 
        {
            foodPrice = 50.00*quantity;
        } 
        else if (foodName == "Peda") 
        {
            foodPrice = 75.00*quantity;
        } 
        else if (foodName == "Shrikhand") 
        {
            foodPrice = 100.00*quantity;
        }

        else if (foodName == "Hyderabadi Biryani") 
        {
            foodPrice = 250.00*quantity;
        } 
        else if (foodName == "Lucknowi Biryani") 
        {
            foodPrice = 280.00*quantity;
        } 
        else if (foodName == "Risotto ai Funghi") 
        {
            foodPrice = 220.00*quantity;
        } 
        else if (foodName == "Pulao") 
        {
            foodPrice = 150.00*quantity;
        } 
        else if (foodName == "Lemon Rice") 
        {
            foodPrice = 120.00*quantity;
        } 
        else if (foodName == "Arroz con Pollo") 
        {
            foodPrice = 210.00*quantity;
        } 
        else if (foodName == "Vegetable Biryani") 
        {
            foodPrice = 180.00*quantity;
        } 
        else if (foodName == "Chicken Biryani") 
        {
            foodPrice = 250.00*quantity;
        } 
        else if (foodName == "Mutton Biryani") 
        {
            foodPrice = 300.00*quantity;
        } 
        else if (foodName == "Egg Biryani") 
        {
            foodPrice = 220.00*quantity;
        } 
        else if (foodName == "Tawa Pulao") 
        {
            foodPrice = 130.00*quantity;
        } 
        else if (foodName == "Puliyodarai") 
        {
            foodPrice = 100.00*quantity;
        } 
        else if (foodName == "Ghee Rice") 
        {
            foodPrice = 120.00*quantity;
        } 
        else if (foodName == "Zafrani Pulao") 
        {
            foodPrice = 150.00*quantity;
        } 
        else if (foodName == "Khichdi") 
        {
            foodPrice = 100.00*quantity;
        } 
        else if (foodName == "Kashmiri Pulao") 
        {
            foodPrice = 180.00*quantity;
        } 
        else if (foodName == "Chitranna Rice") 
        {
            foodPrice = 110.00*quantity;
        } 
        else if (foodName == "Tamarind Rice") 
        {
            foodPrice = 120.00*quantity;
        } 
        else if (foodName == "Pongal Rice") 
        {
            foodPrice = 150.00*quantity;
        } 
        else if (foodName == "Vangi Bath") 
        {
            foodPrice = 130.00*quantity;
        }
        else 
        {
            System.out.println("Please provide a correct name of the food item.");
        }

        return foodPrice;
    }
}
