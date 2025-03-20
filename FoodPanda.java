class FoodPanda 
{
    public static double foodPrice(String foodName) 
    {
        double foodPrice = 0.0;

        if (foodName=="Benne Masala Dosa") 
        {
            foodPrice = 150.00;
            return foodPrice;
        } 
        else if (foodName=="Rava Idli") 
        {
            foodPrice = 80.00;
            return foodPrice;
        } 
        else if (foodName=="Masala Dosa") 
        {
            foodPrice = 90.00;
            return foodPrice;
        } 
        else if (foodName=="Mangalore Buns") 
        {
            foodPrice = 100.00;
            return foodPrice;
        } 
        else if (foodName=="Chow Chow Bath")
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (foodName=="Kadabu")
        {
            foodPrice = 130.00;
            return foodPrice;
        } 
        else if (foodName=="Jowar Roti") 
        {
            foodPrice = 70.00;
            return foodPrice;
        } 
        else if (foodName=="Donne Biryani") 
        {
            foodPrice = 200.00;
            return foodPrice;
        } 
        else if (foodName=="Akki Roti") 
        {
            foodPrice = 110.00;
            return foodPrice;
        } 
        else if (foodName=="Hoorna Huggi") 
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (foodName=="Ragi Mudde") 
        {
            foodPrice = 90.00;
            return foodPrice;
        } 
        else if (foodName=="Kori Roti") 
        {
            foodPrice = 160.00;
            return foodPrice;
        } 
        else if (foodName=="Muddhe") 
        {
            foodPrice = 100.00;
            return foodPrice;
        } 
        else if (foodName=="Caprese Salad") 
        {
            foodPrice = 180.00;
            return foodPrice;
        } 
        else if (foodName=="Hesarubele Sambar") 
        {
            foodPrice = 110.00;
            return foodPrice;
        } 
        else if (foodName=="Bisi Bele Bath") 
        {
            foodPrice = 150.00;
            return foodPrice;
        } 
        else if (foodName=="Bun Nippattu") 
        {
            foodPrice = 60.00;
            return foodPrice;
        } 
        else if (foodName=="Mallige Idli") 
        {
            foodPrice = 80.00;
            return foodPrice;
        } 
        else if (foodName=="Methi Paratha") 
        {
            foodPrice = 110.00;
            return foodPrice;
        } 
        else if (foodName=="Mangalore Rice") 
        {
            foodPrice = 130.00;
            return foodPrice;
        }

        else if (foodName=="Aamras") 
        {
            foodPrice = 80.00;
            return foodPrice;
        } 
        else if (foodName=="Tiramisu") 
        {
            foodPrice = 250.00;
            return foodPrice;
        } 
        else if (foodName=="Panna Cotta") 
        {
            foodPrice = 220.00;
            return foodPrice;
        } 
        else if (foodName=="Badam Halwa") 
        {
            foodPrice = 100.00;
            return foodPrice;
        } 
        else if (foodName=="Suhal") 
        {
            foodPrice = 90.00;
            return foodPrice;
        } 
        else if (foodName=="Aate ka Halwa") 
        {
            foodPrice = 80.00;
            return foodPrice;
        } 
        else if (foodName=="Zabaglione") 
        {
            foodPrice = 150.00;
            return foodPrice;
        } 
        else if (foodName=="Rajma Chawal") 
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (foodName=="Amla Murabba") 
        {
            foodPrice = 60.00;
            return foodPrice;
        } 
        else if (foodName=="Mango Lassi") 
        {
            foodPrice = 90.00;
            return foodPrice;
        } 
        else if (foodName=="Phirni") 
        {
            foodPrice = 70.00;
            return foodPrice;
        } 
        else if (foodName=="Rose Sherbet") 
        {
            foodPrice = 50.00;
            return foodPrice;
        } 
        else if (foodName=="Thandai") 
        {
            foodPrice = 100.00;
            return foodPrice;
        } 
        else if (foodName=="Mastani") 
        {
            foodPrice = 150.00;
            return foodPrice;
        } 
        else if (foodName=="Banta") 
        {
            foodPrice = 40.00;
            return foodPrice;
        } 
        else if (foodName=="Kulfi Falooda") 
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (foodName=="Petha") 
        {
            foodPrice = 60.00;
            return foodPrice;
        } 
        else if (foodName=="Lassi") 
        {
            foodPrice = 70.00;
            return foodPrice;
        } 
        else if (foodName=="Gulkand") 
        {
            foodPrice = 50.00;
            return foodPrice;
        } 
        else if (foodName=="Curd Rice") 
        {
            foodPrice = 80.00;
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

        if (foodName=="Benne Masala Dosa") 
        {
            foodPrice = 150.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Rava Idli") 
        {
            foodPrice = 80.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Masala Dosa") 
        {
            foodPrice = 90.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Mangalore Buns") 
        {
            foodPrice = 100.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Chow Chow Bath")
        {
            foodPrice = 120.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Kadabu")
        {
            foodPrice = 130.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Jowar Roti") 
        {
            foodPrice = 70.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Donne Biryani") 
        {
            foodPrice = 200.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Akki Roti") 
        {
            foodPrice = 110.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Hoorna Huggi") 
        {
            foodPrice = 120.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Ragi Mudde") 
        {
            foodPrice = 90.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Kori Roti") 
        {
            foodPrice = 160.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Muddhe") 
        {
            foodPrice = 100.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Caprese Salad") 
        {
            foodPrice = 180.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Hesarubele Sambar") 
        {
            foodPrice = 110.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Bisi Bele Bath") 
        {
            foodPrice = 150.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Bun Nippattu") 
        {
            foodPrice = 60.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Mallige Idli") 
        {
            foodPrice = 80.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Methi Paratha") 
        {
            foodPrice = 110.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Mangalore Rice") 
        {
            foodPrice = 130.00*quantity;
            return foodPrice;
        }

        else if (foodName=="Aamras") 
        {
            foodPrice = 80.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Tiramisu") 
        {
            foodPrice = 250.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Panna Cotta") 
        {
            foodPrice = 220.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Badam Halwa") 
        {
            foodPrice = 100.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Suhal") 
        {
            foodPrice = 90.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Aate ka Halwa") 
        {
            foodPrice = 80.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Zabaglione") 
        {
            foodPrice = 150.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Rajma Chawal") 
        {
            foodPrice = 120.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Amla Murabba") 
        {
            foodPrice = 60.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Mango Lassi") 
        {
            foodPrice = 90.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Phirni") 
        {
            foodPrice = 70.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Rose Sherbet") 
        {
            foodPrice = 50.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Thandai") 
        {
            foodPrice = 100.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Mastani") 
        {
            foodPrice = 150.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Banta") 
        {
            foodPrice = 40.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Kulfi Falooda") 
        {
            foodPrice = 120.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Petha") 
        {
            foodPrice = 60.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Lassi") 
        {
            foodPrice = 70.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Gulkand") 
        {
            foodPrice = 50.00*quantity;
            return foodPrice;
        } 
        else if (foodName=="Curd Rice") 
        {
            foodPrice = 80.00*quantity;
            return foodPrice;
        }
        else 
        {
            System.out.println("Please provide a correct name of the food item.");
            return foodPrice;
        }
    }
}
