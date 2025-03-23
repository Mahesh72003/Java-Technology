class SoapRunner 
{
    public static void main(String Soapuse[]) 
	{
        
        Soap ref1 = new Soap();
        ref1.brand = "Patanjali";
        ref1.scent = "Lavender";
        ref1.weight = "Small";
        ref1.type = "Bar Soap";
        System.out.println("Brand: " + ref1.brand);
        System.out.println("Scent: " + ref1.scent);
        System.out.println("Weight: " + ref1.weight);
        System.out.println("Type: " + ref1.type);

        
        Soap ref2 = new Soap();
        ref2.brand = "Lux";
        ref2.scent = "Rose";
        ref2.weight = "Medium";
        ref2.type = "Liquid Soap";
        System.out.println("Brand: " + ref2.brand);
        System.out.println("Scent: " + ref2.scent);
        System.out.println("Weight: " + ref2.weight);
        System.out.println("Type: " + ref2.type);

        
        Soap ref3 = new Soap();
        ref3.brand = "Palmolive";
        ref3.scent = "Fresh";
        ref3.weight = "Large";
        ref3.type = "Hand Soap";
        System.out.println("Brand: " + ref3.brand);
        System.out.println("Scent: " + ref3.scent);
        System.out.println("Weight: " + ref3.weight);
        System.out.println("Type: " + ref3.type);

        
        Soap ref4 = new Soap();
        ref4.brand = "Nivea";
        ref4.scent = "Aloe Vera";
        ref4.weight = "Small";
        ref4.type = "Bar Soap";
        System.out.println("Brand: " + ref4.brand);
        System.out.println("Scent: " + ref4.scent);
        System.out.println("Weight: " + ref4.weight);
        System.out.println("Type: " + ref4.type);

        
        Soap ref5 = new Soap();
        ref5.brand = "Mysore Sandalwood";
        ref5.scent = "Sandalwood";
        ref5.weight = "Medium";
        ref5.type = "Liquid Soap";
        System.out.println("Brand: " + ref5.brand);
        System.out.println("Scent: " + ref5.scent);
        System.out.println("Weight: " + ref5.weight);
        System.out.println("Type: " + ref5.type);

        
        Soap ref6 = new Soap();
        ref6.brand = "Olay";
        ref6.scent = "Shea Butter";
        ref6.weight = "Large";
        ref6.type = "Hand Soap";
        System.out.println("Brand: " + ref6.brand);
        System.out.println("Scent: " + ref6.scent);
        System.out.println("Weight: " + ref6.weight);
        System.out.println("Type: " + ref6.type);

        
        Soap ref7 = new Soap();
        ref7.brand = "Yardley";
        ref7.scent = "English Lavender";
        ref7.weight = "Small";
        ref7.type = "Bar Soap";
        System.out.println("Brand: " + ref7.brand);
        System.out.println("Scent: " + ref7.scent);
        System.out.println("Weight: " + ref7.weight);
        System.out.println("Type: " + ref7.type);

        // Parameterized Constructor
        Soap ref8 = new Soap("Dove", "Almond", "Medium", "Liquid Soap");
        System.out.println("Brand: " + ref8.brand);
        System.out.println("Scent: " + ref8.scent);
        System.out.println("Weight: " + ref8.weight);
        System.out.println("Type: " + ref8.type);

        
        Soap ref9 = new Soap("Dial", "Spring Water", "Large", "Hand Soap");
        System.out.println("Brand: " + ref9.brand);
        System.out.println("Scent: " + ref9.scent);
        System.out.println("Weight: " + ref9.weight);
        System.out.println("Type: " + ref9.type);

        
        Soap ref10 = new Soap("Safeguard", "Clean Scent", "Small", "Bar Soap");
        System.out.println("Brand: " + ref10.brand);
        System.out.println("Scent: " + ref10.scent);
        System.out.println("Weight: " + ref10.weight);
        System.out.println("Type: " + ref10.type);

        
        Soap ref11 = new Soap("Cetaphil", "Fragrance-Free", "Medium", "Liquid Soap");
        System.out.println("Brand: " + ref11.brand);
        System.out.println("Scent: " + ref11.scent);
        System.out.println("Weight: " + ref11.weight);
        System.out.println("Type: " + ref11.type);

        
        Soap ref12 = new Soap("Dr. Bronner’s", "Peppermint", "Large", "Hand Soap");
        System.out.println("Brand: " + ref12.brand);
        System.out.println("Scent: " + ref12.scent);
        System.out.println("Weight: " + ref12.weight);
        System.out.println("Type: " + ref12.type);

        
        Soap ref13 = new Soap("Tom's of Maine", "Wild Lavender", "Medium", "Bar Soap");
        System.out.println("Brand: " + ref13.brand);
        System.out.println("Scent: " + ref13.scent);
        System.out.println("Weight: " + ref13.weight);
        System.out.println("Type: " + ref13.type);

        
        Soap ref14 = new Soap("Camay", "Rose", "Large", "Liquid Soap");
        System.out.println("Brand: " + ref14.brand);
        System.out.println("Scent: " + ref14.scent);
        System.out.println("Weight: " + ref14.weight);
        System.out.println("Type: " + ref14.type);
    }
}
