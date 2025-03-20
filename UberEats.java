class UberEats 
{
    public static double foodPrice(String foodName) 
    {
        double foodPrice = 0.0;

        if (foodName == "Butter Chicken") 
        {
            foodPrice = 300.87;
            return foodPrice;
        } 
        else if (foodName == "Rogan Josh") 
        {
            foodPrice = 400.99;
            return foodPrice;
        } 
        else if (foodName == "Tandoori Chicken") 
        {
            foodPrice = 250.75;
            return foodPrice;
        } 
        else if (foodName == "Dal Makhani") 
        {
            foodPrice = 180.50;
            return foodPrice;
        } 
        else if (foodName == "Shahi Paneer") 
        {
            foodPrice = 250.62;
            return foodPrice;
        } 
        else if (foodName == "Aloo Gobi") 
        {
            foodPrice = 150.88;
            return foodPrice;
        } 
        else if (foodName == "Gobi Masala") 
        {
            foodPrice = 160.25;
            return foodPrice;
        } 
        else if (foodName == "Bhindi Masala") 
        {
            foodPrice = 130.40;
            return foodPrice;
        } 
        else if (foodName == "Malai Kofta") 
        {
            foodPrice = 220.00;
            return foodPrice;
        } 
        else if (foodName == "Chole Masala") 
        {
            foodPrice = 140.35;
            return foodPrice;
        } 
        else if (foodName == "Amritsari Kulcha") 
        {
            foodPrice = 110.45;
            return foodPrice;
        } 
        else if (foodName == "Paneer Tikka") 
        {
            foodPrice = 200.77;
            return foodPrice;
        } 
        else if (foodName == "Punjabi Chole") 
        {
            foodPrice = 130.65;
            return foodPrice;
        } 
        else if (foodName == "Sarson da Saag") 
        {
            foodPrice = 160.00;
            return foodPrice;
        } 
        else if (foodName == "Makki di Roti") 
        {
            foodPrice = 100.50;
            return foodPrice;
        } 
        else if (foodName == "Keema Naan") 
        {
            foodPrice = 130.75;
            return foodPrice;
        } 
        else if (foodName == "Risotto Primavera") 
        {
            foodPrice = 220.00;
            return foodPrice;
        } 
        else if (foodName == "Pesarattu") 
        {
            foodPrice = 110.72;
            return foodPrice;
        } 
        else if (foodName == "Focaccia") 
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (foodName == "Tandoori Naan") 
        {
            foodPrice = 60.25;
            return foodPrice;
        } 
        else if (foodName == "Tacos al Pastor") 
        {
            foodPrice = 180.00;
            return foodPrice;
        } 
        else if (foodName == "Sev Puri") 
        {
            foodPrice = 40.00;
            return foodPrice;
        } 
        else if (foodName == "Guacamole with Tortilla Chips") 
        {
            foodPrice = 150.00;
            return foodPrice;
        } 
        else if (foodName == "Samosa") 
        {
            foodPrice = 30.90;
            return foodPrice;
        } 
        else if (foodName == "Ragda Pattice") 
        {
            foodPrice = 90.99;
            return foodPrice;
        } 
        else if (foodName == "Batata Puri") 
        {
            foodPrice = 60.50;
            return foodPrice;
        } 
        else if (foodName == "Aloo Tikki") 
        {
            foodPrice = 50.00;
            return foodPrice;
        } 
        else if (foodName == "Golgappa") 
        {
            foodPrice = 35.00;
            return foodPrice;
        } 
        else if (foodName == "Tandoori Paneer") 
        {
            foodPrice = 250.43;
            return foodPrice;
        } 
        else if (foodName == "Kathi Roll") 
        {
            foodPrice = 100.00;
            return foodPrice;
        } 
        else if (foodName == "Kachumber") 
        {
            foodPrice = 40.00;
            return foodPrice;
        } 
        else if (foodName == "Sizzling Brownie") 
        {
            foodPrice = 120.75;
            return foodPrice;
        } 
        else if (foodName == "Momo") 
        {
            foodPrice = 80.50;
            return foodPrice;
        } 
        else if (foodName == "Samosa Chaat") 
        {
            foodPrice = 70.30;
            return foodPrice;
        } 
        else if (foodName == "Bhutte ka Kees") 
        {
            foodPrice = 60.45;
            return foodPrice;
        } 
        else if (foodName == "Bruschetta") 
        {
            foodPrice = 120.00;
            return foodPrice;
        } 
        else if (foodName == "Enchiladas") 
        {
            foodPrice = 180.00;
            return foodPrice;
        } 
        else if (foodName == "Quesadilla") 
        {
            foodPrice = 160.25;
            return foodPrice;
        } 
        else if (foodName == "Pakora") 
        {
            foodPrice = 50.00;
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

        if (foodName == "Butter Chicken") 
        {
            foodPrice = 300.87 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Rogan Josh") 
        {
            foodPrice = 400.99 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Tandoori Chicken") 
        {
            foodPrice = 250.75 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Dal Makhani") 
        {
            foodPrice = 180.50 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Shahi Paneer") 
        {
            foodPrice = 250.62 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Aloo Gobi") 
        {
            foodPrice = 150.88 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Gobi Masala") 
        {
            foodPrice = 160.25 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Bhindi Masala") 
        {
            foodPrice = 130.40 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Malai Kofta") 
        {
            foodPrice = 220.00 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Chole Masala") 
        {
            foodPrice = 140.35 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Amritsari Kulcha") 
        {
            foodPrice = 110.45 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Paneer Tikka") 
        {
            foodPrice = 200.77 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Punjabi Chole") 
        {
            foodPrice = 130.65 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Sarson da Saag") 
        {
            foodPrice = 160.00 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Makki di Roti") 
        {
            foodPrice = 100.50 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Keema Naan") 
        {
            foodPrice = 130.75 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Risotto Primavera") 
        {
            foodPrice = 220.00 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Pesarattu") 
        {
            foodPrice = 110.72 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Focaccia") 
        {
            foodPrice = 120.00 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Tandoori Naan") 
        {
            foodPrice = 60.25 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Tacos al Pastor") 
        {
            foodPrice = 180.00 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Sev Puri") 
        {
            foodPrice = 40.00 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Guacamole with Tortilla Chips") 
        {
            foodPrice = 150.00 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Samosa") 
        {
            foodPrice = 30.90 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Ragda Pattice") 
        {
            foodPrice = 90.99 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Batata Puri") 
        {
            foodPrice = 60.50 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Aloo Tikki") 
        {
            foodPrice = 50.00 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Golgappa") 
        {
            foodPrice = 35.00 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Tandoori Paneer") 
        {
            foodPrice = 250.43 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Kathi Roll") 
        {
            foodPrice = 100.00 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Kachumber") 
        {
            foodPrice = 40.00 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Sizzling Brownie") 
        {
            foodPrice = 120.75 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Momo") 
        {
            foodPrice = 80.50 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Samosa Chaat") 
        {
            foodPrice = 70.30 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Bhutte ka Kees") 
        {
            foodPrice = 60.45 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Bruschetta") 
        {
            foodPrice = 120.00 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Enchiladas") 
        {
            foodPrice = 180.00 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Quesadilla") 
        {
            foodPrice = 160.25 * quantity;
            return foodPrice;
        } 
        else if (foodName == "Pakora") 
        {
            foodPrice = 50.00 * quantity;
            return foodPrice;
        } 
        else 
        {
            System.out.println("Please provide a correct name of the food item.");
            return foodPrice;
        }
    }
}
	