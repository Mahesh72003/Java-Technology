class TubeLightRunner 
{
    public static void main(String Light[]) 
	{

        TubeLight ref1 = new TubeLight();
        ref1.brand = "Havells";
        ref1.wattage = 5;
        ref1.color = "White";
        ref1.price = 342;
        ref1.length = "1ft";
        ref1.type = "LED";
        System.out.println("Brand: " + ref1.brand);
        System.out.println("Wattage: " + ref1.wattage + "W");
        System.out.println("Color: " + ref1.color);
        System.out.println("Price: " + ref1.price);
        System.out.println("Length: " + ref1.length);
        System.out.println("Type: " + ref1.type);

        
        TubeLight ref2 = new TubeLight();
        ref2.brand = "Syska";
        ref2.wattage = 10;
        ref2.color = "Warm White";
        ref2.price = 456;
        ref2.length = "2ft";
        ref2.type = "Fluorescent";
        System.out.println("\nBrand: " + ref2.brand);
        System.out.println("Wattage: " + ref2.wattage + "W");
        System.out.println("Color: " + ref2.color);
        System.out.println("Price: " + ref2.price);
        System.out.println("Length: " + ref2.length);
        System.out.println("Type: " + ref2.type);

        
        TubeLight ref3 = new TubeLight();
        ref3.brand = "Wipro";
        ref3.wattage = 15;
        ref3.color = "Cool White";
        ref3.price = 699;
        ref3.length = "4ft";
        ref3.type = "LED";
        System.out.println("\nBrand: " + ref3.brand);
        System.out.println("Wattage: " + ref3.wattage + "W");
        System.out.println("Color: " + ref3.color);
        System.out.println("Price: " + ref3.price);
        System.out.println("Length: " + ref3.length);
        System.out.println("Type: " + ref3.type);

        
        TubeLight ref4 = new TubeLight();
        ref4.brand = "Bajaj";
        ref4.wattage = 10;
        ref4.color = "Warm White";
        ref4.price = 516;
        ref4.length = "2ft";
        ref4.type = "Compact";
        System.out.println("\nBrand: " + ref4.brand);
        System.out.println("Wattage: " + ref4.wattage + "W");
        System.out.println("Color: " + ref4.color);
        System.out.println("Price: " + ref4.price);
        System.out.println("Length: " + ref4.length);
        System.out.println("Type: " + ref4.type);

        
        TubeLight ref5 = new TubeLight();
        ref5.brand = "Luminous";
        ref5.wattage = 20;
        ref5.color = "White";
        ref5.price = 849;
        ref5.length = "4ft";
        ref5.type = "Fluorescent";
        System.out.println("\nBrand: " + ref5.brand);
        System.out.println("Wattage: " + ref5.wattage + "W");
        System.out.println("Color: " + ref5.color);
        System.out.println("Price: " + ref5.price);
        System.out.println("Length: " + ref5.length);
        System.out.println("Type: " + ref5.type);

        
        TubeLight ref6 = new TubeLight();
        ref6.brand = "Orient Electric";
        ref6.wattage = 5;
        ref6.color = "Cool White";
        ref6.price = 414;
        ref6.length = "1ft";
        ref6.type = "LED";
        System.out.println("\nBrand: " + ref6.brand);
        System.out.println("Wattage: " + ref6.wattage + "W");
        System.out.println("Color: " + ref6.color);
        System.out.println("Price: " + ref6.price);
        System.out.println("Length: " + ref6.length);
        System.out.println("Type: " + ref6.type);

        
        TubeLight ref7 = new TubeLight();
        ref7.brand = "Philips";
        ref7.wattage = 15;
        ref7.color = "Warm White";
        ref7.price = 703;
        ref7.length = "2ft";
        ref7.type = "Compact";
        System.out.println("\nBrand: " + ref7.brand);
        System.out.println("Wattage: " + ref7.wattage + "W");
        System.out.println("Color: " + ref7.color);
        System.out.println("Price: " + ref7.price);
        System.out.println("Length: " + ref7.length);
        System.out.println("Type: " + ref7.type);

        
        TubeLight ref8 = new TubeLight("Havells", 5, "White", 379, "1ft", "LED");
        System.out.println("\nBrand: " + ref8.brand);
        System.out.println("Wattage: " + ref8.wattage + "W");
        System.out.println("Color: " + ref8.color);
        System.out.println("Price: " + ref8.price);
        System.out.println("Length: " + ref8.length);
        System.out.println("Type: " + ref8.type);

        
        TubeLight ref9 = new TubeLight("Syska", 10, "Cool White", 570, "2ft", "Fluorescent");
        System.out.println("\nBrand: " + ref9.brand);
        System.out.println("Wattage: " + ref9.wattage + "W");
        System.out.println("Color: " + ref9.color);
        System.out.println("Price: " + ref9.price);
        System.out.println("Length: " + ref9.length);
        System.out.println("Type: " + ref9.type);

        
        TubeLight ref10 = new TubeLight("Wipro", 20, "Warm White", 915, "4ft", "LED");
        System.out.println("\nBrand: " + ref10.brand);
        System.out.println("Wattage: " + ref10.wattage + "W");
        System.out.println("Color: " + ref10.color);
        System.out.println("Price: " + ref10.price);
        System.out.println("Length: " + ref10.length);
        System.out.println("Type: " + ref10.type);

        
        TubeLight ref11 = new TubeLight("Bajaj", 15, "White", 665, "2ft", "Compact");
        System.out.println("\nBrand: " + ref11.brand);
        System.out.println("Wattage: " + ref11.wattage + "W");
        System.out.println("Color: " + ref11.color);
        System.out.println("Price: " + ref11.price);
        System.out.println("Length: " + ref11.length);
        System.out.println("Type: " + ref11.type);

        
        TubeLight ref12 = new TubeLight("Luminous", 5, "Warm White", 456, "1ft", "LED");
        System.out.println("\nBrand: " + ref12.brand);
        System.out.println("Wattage: " + ref12.wattage + "W");
        System.out.println("Color: " + ref12.color);
        System.out.println("Price: " + ref12.price);
        System.out.println("Length: " + ref12.length);
        System.out.println("Type: " + ref12.type);

        
        TubeLight ref13 = new TubeLight("Orient Electric", 10, "Cool White", 562, "2ft", "Fluorescent");
        System.out.println("\nBrand: " + ref13.brand);
        System.out.println("Wattage: " + ref13.wattage + "W");
        System.out.println("Color: " + ref13.color);
        System.out.println("Price: " + ref13.price);
        System.out.println("Length: " + ref13.length);
        System.out.println("Type: " + ref13.type);

        
        TubeLight ref14 = new TubeLight("Philips", 20, "Warm White", 974, "4ft", "LED");
        System.out.println("\nBrand: " + ref14.brand);
        System.out.println("Wattage: " + ref14.wattage + "W");
        System.out.println("Color: " + ref14.color);
        System.out.println("Price: " + ref14.price);
        System.out.println("Length: " + ref14.length);
        System.out.println("Type: " + ref14.type);
    }
}
