class ChainRunner 
{
    public static void main(String ChainType[]) 
	{
        // Constructor 
        Chain ref1 = new Chain();
        ref1.material = "Steel";
        ref1.length = 20;
        ref1.type = "Necklace";
        System.out.println("Material: " + ref1.material);
        System.out.println("Length: " + ref1.length + " inches");
        System.out.println("Type: " + ref1.type);

    
        Chain ref2 = new Chain();
        ref2.material = "Gold";
        ref2.length = 18;
        ref2.type = "Bracelet";
        System.out.println("Material: " + ref2.material);
        System.out.println("Length: " + ref2.length + " inches");
        System.out.println("Type: " + ref2.type);

    
        Chain ref3 = new Chain();
        ref3.material = "Silver";
        ref3.length = 24;
        ref3.type = "Necklace";
        System.out.println("Material: " + ref3.material);
        System.out.println("Length: " + ref3.length + " inches");
        System.out.println("Type: " + ref3.type);

    
        Chain ref4 = new Chain();
        ref4.material = "Titanium";
        ref4.length = 22;
        ref4.type = "Watch Chain";
        System.out.println("Material: " + ref4.material);
        System.out.println("Length: " + ref4.length + " inches");
        System.out.println("Type: " + ref4.type);

    
        Chain ref5 = new Chain();
        ref5.material = "Platinum";
        ref5.length = 16;
        ref5.type = "Bracelet";
        System.out.println("Material: " + ref5.material);
        System.out.println("Length: " + ref5.length + " inches");
        System.out.println("Type: " + ref5.type);

    
        Chain ref6 = new Chain();
        ref6.material = "Steel";
        ref6.length = 28;
        ref6.type = "Curb Chain";
        System.out.println("Material: " + ref6.material);
        System.out.println("Length: " + ref6.length + " inches");
        System.out.println("Type: " + ref6.type);

    
        Chain ref7 = new Chain();
        ref7.material = "Gold";
        ref7.length = 30;
        ref7.type = "Box Chain";
        System.out.println("Material: " + ref7.material);
        System.out.println("Length: " + ref7.length + " inches");
        System.out.println("Type: " + ref7.type);

        //Parameterized constructor
        Chain ref8 = new Chain("Silver", 12, "Rope Chain");
        System.out.println("Material: " + ref8.material);
        System.out.println("Length: " + ref8.length + " inches");
        System.out.println("Type: " + ref8.type);

        
        Chain ref9 = new Chain("Copper", 18, "Ball Chain");
        System.out.println("Material: " + ref9.material);
        System.out.println("Length: " + ref9.length + " inches");
        System.out.println("Type: " + ref9.type);

        
        Chain ref10 = new Chain("Stainless Steel", 26, "Figaro Chain");
        System.out.println("Material: " + ref10.material);
        System.out.println("Length: " + ref10.length + " inches");
        System.out.println("Type: " + ref10.type);

        
        Chain ref11 = new Chain("Silver", 20, "Necklace");
        System.out.println("Material: " + ref11.material);
        System.out.println("Length: " + ref11.length + " inches");
        System.out.println("Type: " + ref11.type);

        
        Chain ref12 = new Chain("Gold", 22, "Curb Chain");
        System.out.println("Material: " + ref12.material);
        System.out.println("Length: " + ref12.length + " inches");
        System.out.println("Type: " + ref12.type);

        
        Chain ref13 = new Chain("Titanium", 18, "Box Chain");
        System.out.println("Material: " + ref13.material);
        System.out.println("Length: " + ref13.length + " inches");
        System.out.println("Type: " + ref13.type);

        
        Chain ref14 = new Chain("Platinum", 24, "Rope Chain");
        System.out.println("Material: " + ref14.material);
        System.out.println("Length: " + ref14.length + " inches");
        System.out.println("Type: " + ref14.type);
    }
}
