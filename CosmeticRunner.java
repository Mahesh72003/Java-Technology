class CosmeticRunner 
{
    public static void main(String  makeup[]) 
	{

        
        Cosmetic ref1 = new Cosmetic();
        ref1.brand = "Lakmé";
        ref1.productType = "Lipstick";
        ref1.shade = "Red";
        ref1.price = 650.00;
        ref1.type = "Stick";
        System.out.println("Brand: " + ref1.brand);
        System.out.println("Product Type: " + ref1.productType);
        System.out.println("Shade: " + ref1.shade);
        System.out.println("Price: " + ref1.price);
        System.out.println("Type: " + ref1.type);

        
        Cosmetic ref2 = new Cosmetic();
        ref2.brand = "Himalaya";
        ref2.productType = "Foundation";
        ref2.shade = "Nude";
        ref2.price = 950.00;
        ref2.type = "Cream";
        System.out.println("\nBrand: " + ref2.brand);
        System.out.println("Product Type: " + ref2.productType);
        System.out.println("Shade: " + ref2.shade);
        System.out.println("Price: " + ref2.price);
        System.out.println("Type: " + ref2.type);

        
        Cosmetic ref3 = new Cosmetic();
        ref3.brand = "Colorbar";
        ref3.productType = "Eyeliner";
        ref3.shade = "Black";
        ref3.price = 1200.00;
        ref3.type = "Stick";
        System.out.println("\nBrand: " + ref3.brand);
        System.out.println("Product Type: " + ref3.productType);
        System.out.println("Shade: " + ref3.shade);
        System.out.println("Price: " + ref3.price);
        System.out.println("Type: " + ref3.type);

        
        Cosmetic ref4 = new Cosmetic();
        ref4.brand = "Lakmé";
        ref4.productType = "Lipstick";
        ref4.shade = "Pink";
        ref4.price = 700.00;
        ref4.type = "Stick";
        System.out.println("\nBrand: " + ref4.brand);
        System.out.println("Product Type: " + ref4.productType);
        System.out.println("Shade: " + ref4.shade);
        System.out.println("Price: " + ref4.price);
        System.out.println("Type: " + ref4.type);

        
        Cosmetic ref5 = new Cosmetic();
        ref5.brand = "Lotus Herbals";
        ref5.productType = "Blush";
        ref5.shade = "Peach";
        ref5.price = 1000.00;
        ref5.type = "Powder";
        System.out.println("\nBrand: " + ref5.brand);
        System.out.println("Product Type: " + ref5.productType);
        System.out.println("Shade: " + ref5.shade);
        System.out.println("Price: " + ref5.price);
        System.out.println("Type: " + ref5.type);

        
        Cosmetic ref6 = new Cosmetic();
        ref6.brand = "Sugar";
        ref6.productType = "Foundation";
        ref6.shade = "Ivory";
        ref6.price = 1600.00;
        ref6.type = "Cream";
        System.out.println("\nBrand: " + ref6.brand);
        System.out.println("Product Type: " + ref6.productType);
        System.out.println("Shade: " + ref6.shade);
        System.out.println("Price: " + ref6.price);
        System.out.println("Type: " + ref6.type);

        
        Cosmetic ref7 = new Cosmetic();
        ref7.brand = "Maybelline";
        ref7.productType = "Mascara";
        ref7.shade = "Black";
        ref7.price = 750.00;
        ref7.type = "Stick";
        System.out.println("\nBrand: " + ref7.brand);
        System.out.println("Product Type: " + ref7.productType);
        System.out.println("Shade: " + ref7.shade);
        System.out.println("Price: " + ref7.price);
        System.out.println("Type: " + ref7.type);

        
        Cosmetic ref8 = new Cosmetic("Lakmé", "Lipstick", "Red", 800.00, "Stick");
        System.out.println("\nBrand: " + ref8.brand);
        System.out.println("Product Type: " + ref8.productType);
        System.out.println("Shade: " + ref8.shade);
        System.out.println("Price: " + ref8.price);
        System.out.println("Type: " + ref8.type);

        
        Cosmetic ref9 = new Cosmetic("Colorbar", "Eyeliner", "Brown", 1300.00, "Stick");
        System.out.println("\nBrand: " + ref9.brand);
        System.out.println("Product Type: " + ref9.productType);
        System.out.println("Shade: " + ref9.shade);
        System.out.println("Price: " + ref9.price);
        System.out.println("Type: " + ref9.type);

        
        Cosmetic ref10 = new Cosmetic("Revlon", "Lip Gloss", "Nude", 550.00, "Stick");
        System.out.println("\nBrand: " + ref10.brand);
        System.out.println("Product Type: " + ref10.productType);
        System.out.println("Shade: " + ref10.shade);
        System.out.println("Price: " + ref10.price);
        System.out.println("Type: " + ref10.type);

        
        Cosmetic ref11 = new Cosmetic("Lakmé", "Blush", "Rose", 1050.00, "Powder");
        System.out.println("\nBrand: " + ref11.brand);
        System.out.println("Product Type: " + ref11.productType);
        System.out.println("Shade: " + ref11.shade);
        System.out.println("Price: " + ref11.price);
        System.out.println("Type: " + ref11.type);

        
        Cosmetic ref12 = new Cosmetic("Colorbar", "Lipstick", "Plum", 1350.00, "Stick");
        System.out.println("\nBrand: " + ref12.brand);
        System.out.println("Product Type: " + ref12.productType);
        System.out.println("Shade: " + ref12.shade);
        System.out.println("Price: " + ref12.price);
        System.out.println("Type: " + ref12.type);

        
        Cosmetic ref13 = new Cosmetic("Maybelline", "Mascara", "Brown", 700.00, "Stick");
        System.out.println("\nBrand: " + ref13.brand);
        System.out.println("Product Type: " + ref13.productType);
        System.out.println("Shade: " + ref13.shade);
        System.out.println("Price: " + ref13.price);
        System.out.println("Type: " + ref13.type);

        
        Cosmetic ref14 = new Cosmetic("Lakmé", "Lipstick", "Coral", 950.00, "Stick");
        System.out.println("\nBrand: " + ref14.brand);
        System.out.println("Product Type: " + ref14.productType);
        System.out.println("Shade: " + ref14.shade);
        System.out.println("Price: " + ref14.price);
        System.out.println("Type: " + ref14.type);
    }
}
