class StoveRunner 
{
    public static void main(String StoveBrand[]) 
	{
        // constructor
        Stove stove1 = new Stove();
        stove1.brand = "Bajaj";
        stove1.color = "Black";
        stove1.numberOfBurners = 4;
        stove1.fuelType = "LPG";
        System.out.println("Brand: " + stove1.brand);
        System.out.println("Color: " + stove1.color);
        System.out.println("Number of Burners: " + stove1.numberOfBurners);
        System.out.println("Fuel Type: " + stove1.fuelType);

        
        Stove stove2 = new Stove();
        stove2.brand = "Prestige";
        stove2.color = "Silver";
        stove2.numberOfBurners = 5;
        stove2.fuelType = "Electric";
        System.out.println("Brand: " + stove2.brand);
        System.out.println("Color: " + stove2.color);
        System.out.println("Number of Burners: " + stove2.numberOfBurners);
        System.out.println("Fuel Type: " + stove2.fuelType);

        
        Stove stove3 = new Stove();
        stove3.brand = "Hindware";
        stove3.color = "White";
        stove3.numberOfBurners = 4;
        stove3.fuelType = "LPG";
        System.out.println("Brand: " + stove3.brand);
        System.out.println("Color: " + stove3.color);
        System.out.println("Number of Burners: " + stove3.numberOfBurners);
        System.out.println("Fuel Type: " + stove3.fuelType);

        
        Stove stove4 = new Stove();
        stove4.brand = "Sujata";
        stove4.color = "Black";
        stove4.numberOfBurners = 6;
        stove4.fuelType = "Electric";
        System.out.println("Brand: " + stove4.brand);
        System.out.println("Color: " + stove4.color);
        System.out.println("Number of Burners: " + stove4.numberOfBurners);
        System.out.println("Fuel Type: " + stove4.fuelType);

        
        Stove stove5 = new Stove();
        stove5.brand = "Faber";
        stove5.color = "Stainless Steel";
        stove5.numberOfBurners = 4;
        stove5.fuelType = "LPG";
        System.out.println("Brand: " + stove5.brand);
        System.out.println("Color: " + stove5.color);
        System.out.println("Number of Burners: " + stove5.numberOfBurners);
        System.out.println("Fuel Type: " + stove5.fuelType);

        
        Stove stove6 = new Stove();
        stove6.brand = "Sunflame";
        stove6.color = "Red";
        stove6.numberOfBurners = 4;
        stove6.fuelType = "Electric";
        System.out.println("Brand: " + stove6.brand);
        System.out.println("Color: " + stove6.color);
        System.out.println("Number of Burners: " + stove6.numberOfBurners);
        System.out.println("Fuel Type: " + stove6.fuelType);

        
        Stove stove7 = new Stove();
        stove7.brand = "Glen";
        stove7.color = "Black";
        stove7.numberOfBurners = 3;
        stove7.fuelType = "LPG";
        System.out.println("Brand: " + stove7.brand);
        System.out.println("Color: " + stove7.color);
        System.out.println("Number of Burners: " + stove7.numberOfBurners);
        System.out.println("Fuel Type: " + stove7.fuelType);

        // Parameterized constructor
		
        Stove stove8 = new Stove("Elica", "Stainless Steel", 5, "Electric");
        System.out.println("Brand: " + stove8.brand);
        System.out.println("Color: " + stove8.color);
        System.out.println("Number of Burners: " + stove8.numberOfBurners);
        System.out.println("Fuel Type: " + stove8.fuelType);

        
        Stove stove9 = new Stove("Kaff", "Black", 6, "LPG");
        System.out.println("Brand: " + stove9.brand);
        System.out.println("Color: " + stove9.color);
        System.out.println("Number of Burners: " + stove9.numberOfBurners);
        System.out.println("Fuel Type: " + stove9.fuelType);

        
        Stove stove10 = new Stove("Lifelong", "White", 4, "Electric");
        System.out.println("Brand: " + stove10.brand);
        System.out.println("Color: " + stove10.color);
        System.out.println("Number of Burners: " + stove10.numberOfBurners);
        System.out.println("Fuel Type: " + stove10.fuelType);

        
        Stove stove11 = new Stove("Pigeon", "Stainless Steel", 4, "LPG");
        System.out.println("Brand: " + stove11.brand);
        System.out.println("Color: " + stove11.color);
        System.out.println("Number of Burners: " + stove11.numberOfBurners);
        System.out.println("Fuel Type: " + stove11.fuelType);

        
        Stove stove12 = new Stove("Crompton", "Black", 5, "Electric");
        System.out.println("Brand: " + stove12.brand);
        System.out.println("Color: " + stove12.color);
        System.out.println("Number of Burners: " + stove12.numberOfBurners);
        System.out.println("Fuel Type: " + stove12.fuelType);

        
        Stove stove13 = new Stove("Butterfly", "Silver", 3, "LPG");
        System.out.println("Brand: " + stove13.brand);
        System.out.println("Color: " + stove13.color);
        System.out.println("Number of Burners: " + stove13.numberOfBurners);
        System.out.println("Fuel Type: " + stove13.fuelType);

        
        Stove stove14 = new Stove("Samsung", "White", 4, "Electric");
        System.out.println("Brand: " + stove14.brand);
        System.out.println("Color: " + stove14.color);
        System.out.println("Number of Burners: " + stove14.numberOfBurners);
        System.out.println("Fuel Type: " + stove14.fuelType);
    }
}
