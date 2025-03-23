class ShampooRunner 
{
    public static void main(String anything[]) 
	{
        //  
        Shampoo ref1 = new Shampoo();
        ref1.brand = "Patanjali";
        ref1.fragrance = "Lavender";
        ref1.size = "Small";
        System.out.println("Brand: " + ref1.brand);
        System.out.println("Fragrance: " + ref1.fragrance);
        System.out.println("Size: " + ref1.size);

        
        Shampoo ref2 = new Shampoo();
        ref2.brand = "Himalaya";
        ref2.fragrance = "Coconut";
        ref2.size = "Medium";
        System.out.println("Brand: " + ref2.brand);
        System.out.println("Fragrance: " + ref2.fragrance);
        System.out.println("Size: " + ref2.size);

        
        Shampoo ref3 = new Shampoo();
        ref3.brand = "Head & Shoulders";
        ref3.fragrance = "Fresh";
        ref3.size = "Large";
        System.out.println("Brand: " + ref3.brand);
        System.out.println("Fragrance: " + ref3.fragrance);
        System.out.println("Size: " + ref3.size);

        
        Shampoo ref4 = new Shampoo();
        ref4.brand = "Biotique";
        ref4.fragrance = "Jasmine";
        ref4.size = "Small";
        System.out.println("Brand: " + ref4.brand);
        System.out.println("Fragrance: " + ref4.fragrance);
        System.out.println("Size: " + ref4.size);

        
        Shampoo ref5 = new Shampoo();
        ref5.brand = "Garnier";
        ref5.fragrance = "Apple";
        ref5.size = "Medium";
        System.out.println("Brand: " + ref5.brand);
        System.out.println("Fragrance: " + ref5.fragrance);
        System.out.println("Size: " + ref5.size);

        
        Shampoo ref6 = new Shampoo();
        ref6.brand = "TRESemmé";
        ref6.fragrance = "Coconut";
        ref6.size = "Large";
        System.out.println("Brand: " + ref6.brand);
        System.out.println("Fragrance: " + ref6.fragrance);
        System.out.println("Size: " + ref6.size);

        
        Shampoo ref7 = new Shampoo();
        ref7.brand = "Khadi";
        ref7.fragrance = "Wild Peach";
        ref7.size = "Small";
        System.out.println("Brand: " + ref7.brand);
        System.out.println("Fragrance: " + ref7.fragrance);
        System.out.println("Size: " + ref7.size);

        // Parameterized constructor
        Shampoo ref8 = new Shampoo("L'Oréal", "Rose", "Medium");
        System.out.println("Brand: " + ref8.brand);
        System.out.println("Fragrance: " + ref8.fragrance);
        System.out.println("Size: " + ref8.size);

        
        Shampoo ref9 = new Shampoo("Pantene", "Mango", "Large");
        System.out.println("Brand: " + ref9.brand);
        System.out.println("Fragrance: " + ref9.fragrance);
        System.out.println("Size: " + ref9.size);

        
        Shampoo ref10 = new Shampoo("Dove", "Tropical", "Small");
        System.out.println("Brand: " + ref10.brand);
        System.out.println("Fragrance: " + ref10.fragrance);
        System.out.println("Size: " + ref10.size);

        
        Shampoo ref11 = new Shampoo("Herbal Essences", "Almond", "Medium");
        System.out.println("Brand: " + ref11.brand);
        System.out.println("Fragrance: " + ref11.fragrance);
        System.out.println("Size: " + ref11.size);

        
        Shampoo ref12 = new Shampoo("Aveeno", "Lavender", "Large");
        System.out.println("Brand: " + ref12.brand);
        System.out.println("Fragrance: " + ref12.fragrance);
        System.out.println("Size: " + ref12.size);

        
        Shampoo ref13 = new Shampoo("Mamaearth", "Orchid", "Medium");
        System.out.println("Brand: " + ref13.brand);
        System.out.println("Fragrance: " + ref13.fragrance);
        System.out.println("Size: " + ref13.size);

        
        Shampoo ref14 = new Shampoo("Head & Shoulders", "Citrus", "Large");
        System.out.println("Brand: " + ref14.brand);
        System.out.println("Fragrance: " + ref14.fragrance);
        System.out.println("Size: " + ref14.size);
    }
}
