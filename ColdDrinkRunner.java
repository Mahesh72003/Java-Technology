public class ColdDrinkRunner 
{
    public static void main(String beverages[]) 
	{
        
        ColdDrink ref1 = new ColdDrink();
        ref1.brand = "Campa";
        ref1.flavor = "Cola";
        ref1.volume = 500.0;
        ref1.price = 100.00;
        ref1.type = "Soda";
        System.out.println("Brand: " + ref1.brand);
        System.out.println("Flavor: " + ref1.flavor);
        System.out.println("Volume: " + ref1.volume + "ml");
        System.out.println("Price: " + ref1.price);
        System.out.println("Type: " + ref1.type);

        
        ColdDrink ref2 = new ColdDrink();
        ref2.brand = "Slice";
        ref2.flavor = "Mango";
        ref2.volume = 1.0;
        ref2.price = 150.00;
        ref2.type = "Juice";
        System.out.println("\nBrand: " + ref2.brand);
        System.out.println("Flavor: " + ref2.flavor);
        System.out.println("Volume: " + ref2.volume + "L");
        System.out.println("Price: " + ref2.price);
        System.out.println("Type: " + ref2.type);

        
        ColdDrink ref3 = new ColdDrink();
        ref3.brand = "Appy Fizz";
        ref3.flavor = "Apple";
        ref3.volume = 1.5;
        ref3.price = 200.00;
        ref3.type = "Juice";
        System.out.println("\nBrand: " + ref3.brand);
        System.out.println("Flavor: " + ref3.flavor);
        System.out.println("Volume: " + ref3.volume + "L");
        System.out.println("Price: " + ref3.price);
        System.out.println("Type: " + ref3.type);

        
        ColdDrink ref4 = new ColdDrink();
        ref4.brand = "Campa";
        ref4.flavor = "Lemon";
        ref4.volume = 2.0;
        ref4.price = 220.00;
        ref4.type = "Soda";
        System.out.println("\nBrand: " + ref4.brand);
        System.out.println("Flavor: " + ref4.flavor);
        System.out.println("Volume: " + ref4.volume + "L");
        System.out.println("Price: " + ref4.price);
        System.out.println("Type: " + ref4.type);

        
        ColdDrink ref5 = new ColdDrink();
        ref5.brand = "Red Bull";
        ref5.flavor = "Energy";
        ref5.volume = 500.0;
        ref5.price = 180.00;
        ref5.type = "Energy Drink";
        System.out.println("\nBrand: " + ref5.brand);
        System.out.println("Flavor: " + ref5.flavor);
        System.out.println("Volume: " + ref5.volume + "ml");
        System.out.println("Price: " + ref5.price);
        System.out.println("Type: " + ref5.type);

        
        ColdDrink ref6 = new ColdDrink();
        ref6.brand = "Slice";
        ref6.flavor = "Lemon";
        ref6.volume = 1.0;
        ref6.price = 140.00;
        ref6.type = "Juice";
        System.out.println("\nBrand: " + ref6.brand);
        System.out.println("Flavor: " + ref6.flavor);
        System.out.println("Volume: " + ref6.volume + "L");
        System.out.println("Price: " + ref6.price);
        System.out.println("Type: " + ref6.type);

        
        ColdDrink ref7 = new ColdDrink();
        ref7.brand = "Appy Fizz";
        ref7.flavor = "Apple";
        ref7.volume = 1.0;
        ref7.price = 180.00;
        ref7.type = "Juice";
        System.out.println("\nBrand: " + ref7.brand);
        System.out.println("Flavor: " + ref7.flavor);
        System.out.println("Volume: " + ref7.volume + "L");
        System.out.println("Price: " + ref7.price);
        System.out.println("Type: " + ref7.type);

        
        ColdDrink ref8 = new ColdDrink("Campa", "Cherry", 1.0, 160.00, "Soda");
        System.out.println("\nBrand: " + ref8.brand);
        System.out.println("Flavor: " + ref8.flavor);
        System.out.println("Volume: " + ref8.volume + "L");
        System.out.println("Price: " + ref8.price);
        System.out.println("Type: " + ref8.type);

        
        ColdDrink ref9 = new ColdDrink("Red Bull", "Energy", 250.0, 140.00, "Energy Drink");
        System.out.println("\nBrand: " + ref9.brand);
        System.out.println("Flavor: " + ref9.flavor);
        System.out.println("Volume: " + ref9.volume + "ml");
        System.out.println("Price: " + ref9.price);
        System.out.println("Type: " + ref9.type);

        
        ColdDrink ref10 = new ColdDrink("Slice", "Mango", 1.5, 250.00, "Juice");
        System.out.println("\nBrand: " + ref10.brand);
        System.out.println("Flavor: " + ref10.flavor);
        System.out.println("Volume: " + ref10.volume + "L");
        System.out.println("Price: " + ref10.price);
        System.out.println("Type: " + ref10.type);

        
        ColdDrink ref11 = new ColdDrink("Appy Fizz", "Cola", 2.0, 180.00, "Soda");
        System.out.println("\nBrand: " + ref11.brand);
        System.out.println("Flavor: " + ref11.flavor);
        System.out.println("Volume: " + ref11.volume + "L");
        System.out.println("Price: " + ref11.price);
        System.out.println("Type: " + ref11.type);

        
        ColdDrink ref12 = new ColdDrink("Campa", "Lime", 500.0, 60.00, "Soda");
        System.out.println("\nBrand: " + ref12.brand);
        System.out.println("Flavor: " + ref12.flavor);
        System.out.println("Volume: " + ref12.volume + "ml");
        System.out.println("Price: " + ref12.price);
        System.out.println("Type: " + ref12.type);

        
        ColdDrink ref13 = new ColdDrink("Red Bull", "Tropical", 250.0, 150.00, "Energy Drink");
        System.out.println("\nBrand: " + ref13.brand);
        System.out.println("Flavor: " + ref13.flavor);
        System.out.println("Volume: " + ref13.volume + "ml");
        System.out.println("Price: " + ref13.price);
        System.out.println("Type: " + ref13.type);

        
        ColdDrink ref14 = new ColdDrink("Appy Fizz", "Pineapple", 1.0, 200.00, "Juice");
        System.out.println("\nBrand: " + ref14.brand);
        System.out.println("Flavor: " + ref14.flavor);
        System.out.println("Volume: " + ref14.volume + "L");
        System.out.println("Price: " + ref14.price);
        System.out.println("Type: " + ref14.type);
    }
}
